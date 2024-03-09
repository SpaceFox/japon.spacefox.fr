package fr.spacefox.japon

import fr.spacefox.japon.data.Category
import fr.spacefox.japon.data.Page
import fr.spacefox.japon.data.Place
import io.quarkus.qute.Template
import io.quarkus.qute.TemplateInstance
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/")
class ListHtmlResource(val list: Template) {

    @GET @Path("") @Produces(MediaType.TEXT_HTML) fun root(): TemplateInstance = accueil()

    @GET
    @Path("accueil")
    @Produces(MediaType.TEXT_HTML)
    fun accueil(): TemplateInstance =
        list.data("title", "Accueil").data("pages", Page.entries.toTypedArray()).withMenuData()

    @GET
    @Path("category/{name}")
    @Produces(MediaType.TEXT_HTML)
    fun category(@PathParam("name") name: String): TemplateInstance {
        val category = Category.valueOf(name)
        return list
            .data("title", category.displayName)
            .data("pages", category.pages())
            .withMenuData()
    }
}

@Path("/place/")
class ListWithMapHtmlResource(val listWithMap: Template) {

    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_HTML)
    fun category(@PathParam("name") name: String): TemplateInstance {
        val place = Place.valueOf(name)
        return listWithMap
            .data("title", place.displayName)
            .data("place", place)
            .data("pages", place.pages())
            .withMenuData()
    }
}

@Path("/page/")
class PageResource(val detail: Template) {

    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_HTML)
    fun page(@PathParam("name") name: String): TemplateInstance =
        detail.data("page", Page.valueOf(name)).withMenuData()
}

@Path("/mentionslegales/")
class LegalResource(val mentionslegales: Template) {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    fun page(): TemplateInstance = mentionslegales.instance().withMenuData()
}

@Path("/licences/")
class LicencesResource(val licences: Template) {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    fun page(): TemplateInstance = licences.instance().withMenuData()
}

private fun TemplateInstance.withMenuData(): TemplateInstance {
    return this.data("categories", Category.entries.toTypedArray())
        .data("places", Place.entries.toTypedArray())
}
