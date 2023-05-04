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




La clase ejecutable `Main` es la encargada de lanzar el programa y ejecutar todas las acciones necesarias. Al iniciarse, se muestra un menú que permite al usuario seleccionar diferentes opciones:

1. Abrir caja: Si la caja no está abierta, la abre y muestra un mensaje. Si ya estaba abierta, muestra un mensaje de que la caja ya está abierta.

2. Agregar cliente: Si la caja está abierta, agrega un cliente aleatorio generado por el `GeneradorClientes` a la fila de clientes. Si la caja está cerrada, muestra un mensaje de que no se pueden agregar clientes.

3. Atender cliente: Si hay clientes en la fila, atiende al siguiente y muestra un mensaje con los datos del cliente. Si no hay clientes, muestra un mensaje de que no hay clientes pendientes.

4. Mostrar clientes pendientes: Muestra los datos de todos los clientes que están en la fila de la caja.

5. Cerrar caja: Si la caja está abierta, la cierra y muestra un mensaje de despedida. Si la caja ya estaba cerrada, muestra un mensaje de que la caja ya está cerrada.

En la clase `Main`, se crea un objeto de la clase `Cajero` y se utiliza un bucle `while` para mostrar el menú y procesar la opción seleccionada por el usuario hasta que se seleccione la opción 5 para cerrar la caja y salir del programa.