package fr.spacefox.japon.data

enum class Category(val displayName: String) {
    chateaux("Châteaux"),
    seulementaujapon("Seulement au Japon"),
    temples("Temples"),
    jardins("Jardins"),
    panoramiques("Panoramiques"),
    nature("Nature"),
    shinto("Sintoïsme"),
    quotidien("Vie quotidienne"),
    francisla("Francis-La");

    fun pages(): List<Page> = Page.values().filter { it.category == this }

    fun imgCount(): Int = pages().sumOf { it.imgCount() }
}
