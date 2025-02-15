fun main(){
    val articulo1 = Articulo("articulo1", 25.0)
    val articulo2 = Articulo("articulo2", 45.0)
    val ordenador1 = Ordenador("ordenador1", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("ordenador2", 399.99 )

    val lista = listOf(articulo1, articulo2, ordenador1, ordenador2)
    val promocion = 50.0

    println("Articulos en oferta:")
    for (articulo in lista){
        articulo.promocionNavidad(promocion)
        println(articulo)
    }

}



