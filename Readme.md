**Tarea 1** _Remaster Edition_

* Realizado en nueva y limpia instalación de IntelliJ IDEA

* Objetos lógicos separados en diferentes clases.

* Código simplificado y reducido.

* TDD

* Ignorados archivos de Gradle.

Triángulo y Diamante: 
Para evitar concatenaciones dentro de loops, se realizan solo dentro de una misma línea, usando nuevos metodos como "linea de espacios" o "linea de asteriscos" y se imprime antes de entrar en nuevas iteraciones


FactoresPrimos: 
Usé una lista de enteros en vez de un arreglo porque no se conoce 
la cantidad de factores que va a resultar de la operación y por ende 
el tamaño máximo del arreglo. 

TikiTaka: 

* Antes: verifica si el número iterante es divisible, almacena el resultado (tiki o taka) 
para poder retornarlo después, luego lo concatena en un segundo String y una vez terminada la iteración imprime toda la colección.

* Ahora: verifica si el número iterante es divisible, almacena el resultado (tiki o taka) y lo imprime justo después.

La diferencia es que el codigo es mucho más simple ahora, la desventaja es que toma mucho más tiempo, si se ingresa un número más grande 
va a tomar más tiempo hasta que imprima las líneas una a una sin poder terminar el cálculo. 
