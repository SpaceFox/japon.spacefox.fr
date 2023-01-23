package fr.spacefox.japon.data

interface Content {
    fun render(): String
}

data class Text(val text: String) : Content {
    override fun render() = "<p>$text</p>"
}

data class Image(val folder: String, val id: String, val title: String) : Content {
    override fun render(): String {
        return """<figure>
                    <figcaption>$title</figcaption>
                    <a href="photos/${folder}/$id.jpg" title="$title" data-lightbox="imgset">
                        <img src="photos/${folder}/mini/$id.jpg" alt="$title"/>
                    </a>
                </figure>"""
    }
}