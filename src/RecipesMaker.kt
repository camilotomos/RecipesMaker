fun main (args: Array<String>) {

    do{
        //Mensaje de Bienvenida
        println(":: Bienvenid@s a Recipe Maker ::\n")

        //Opciones Menu de Usuario
        println("Selecciona la opción deseada")
        println("1. Hacer una receta " )
        println("2. Ver mis recetas " )
        println("3. Salir \n")

        //Se espera seleccion por teclado
        println("Digite el numero requerido")
        val seleccion = readLine().toString()


        if(seleccion.equals("1") ) {
            var Ingredientes = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos", "Aceite")

            for((index,Ingredientes) in Ingredientes.withIndex()){
                println("$index: $Ingredientes")
            }

            println("Elige los Ingredientes\n")
        }

        if(seleccion.equals("2") ) {
            println("'VER MIS RECETAS")
        }
    }while(!seleccion.equals("3"));
    println("Muchas gracias por su visita")
}