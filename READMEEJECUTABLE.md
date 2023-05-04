La clase ejecutable `Main` es la encargada de lanzar el programa y ejecutar todas las acciones necesarias. Al iniciarse, se muestra un menú que permite al usuario seleccionar diferentes opciones:

1. Abrir caja: Si la caja no está abierta, la abre y muestra un mensaje. Si ya estaba abierta, muestra un mensaje de que la caja ya está abierta.

2. Agregar cliente: Si la caja está abierta, agrega un cliente aleatorio generado por el `GeneradorClientes` a la fila de clientes. Si la caja está cerrada, muestra un mensaje de que no se pueden agregar clientes.

3. Atender cliente: Si hay clientes en la fila, atiende al siguiente y muestra un mensaje con los datos del cliente. Si no hay clientes, muestra un mensaje de que no hay clientes pendientes.

4. Mostrar clientes pendientes: Muestra los datos de todos los clientes que están en la fila de la caja.

5. Cerrar caja: Si la caja está abierta, la cierra y muestra un mensaje de despedida. Si la caja ya estaba cerrada, muestra un mensaje de que la caja ya está cerrada.

En la clase `Main`, se crea un objeto de la clase `Cajero` y se utiliza un bucle `while` para mostrar el menú y procesar la opción seleccionada por el usuario hasta que se seleccione la opción 5 para cerrar la caja y salir del programa.
