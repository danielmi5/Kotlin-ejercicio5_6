#### 1. ¿De qué tipo genera en la lista por defecto el compilador?
De tipo `Articulo`, ya que el compilador infiere el tipo más genérico común entre los elementos de la lista.

#### 2. ¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?
Se está aplicando polimorfismo porque los objetos de la clase derivada `Ordenador` están siendo tratados como instancias de la clase base `Articulo`. Además, se está sobrescribiendo el método `promocionNavidad()` en `Ordenador`, lo que permite que tenga un comportamiento distinto que los demás artículos.

#### 3. ¿Qué pasaría si creáramos la lista con listOf<Ordenador>? ¿Y si la hiciéramos con listOf<Any>?

En el primer caso, la lista solo podría contener artículos que sean `Ordenador`.

En el segundo caso, la lista podría contener cualquier tipo de dato.
