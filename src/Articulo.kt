open class Articulo(var nombre: String, var precio: Double) {
    private val id: Int = generarId()

    init {
        totalArticulos++
    }

    companion object {
        var totalArticulos = 1
    }

    private fun generarId(): Int = totalArticulos


    open fun promocionNavidad(porcentaje: Double) {
        precio -= precio * (porcentaje / 100)
    }

    override fun toString(): String {
        val numDecimales = 2
        return "$nombre - ${"%.${numDecimales}f".format(precio)}€ (ID: $id)"
    }
}
