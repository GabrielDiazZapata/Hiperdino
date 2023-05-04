# Ejercicio de simulación de cajero automático

Este es un programa Java que simula el funcionamiento de un cajero automático, permitiendo la apertura y cierre de una caja, el añadir clientes a una fila, el procesamiento de la fila de clientes y la visualización de los clientes pendientes en la fila.

El programa utiliza las siguientes clases:

- La clase `Cajero` representa a un cajero automático y maneja la fila de clientes.
- La clase `Cliente` representa a un cliente del cajero automático y tiene un nombre  y un saldo inicial.
- La clase `GeneradorNombres` genera nombres aleatorios para los clientes.
- La clase `Main` es el punto de entrada del programa y contiene el loop principal de la simulación.

El programa funciona de la siguiente manera:

1. Al iniciar, se crea un objeto `Cajero` con un número de caja especificado por el usuario.
2. El usuario puede seleccionar una de las siguientes opciones: 
    1. Abrir caja
    2. Agregar cliente a la fila
    3. Atender siguiente cliente
    4. Ver clientes pendientes en la fila
    5. Cerrar caja y salir
3. Dependiendo de la opción seleccionada, se realizarán las operaciones correspondientes en el objeto `Cajero`.
4. El programa continuará en el bucle principal hasta que el usuario seleccione la opción de cerrar la caja y salir.

El objetivo de este programa es demostrar el uso de objetos y métodos en Java, y proporcionar una simulación simple de un cajero automático.



