🍽 Restaurante con Hilos en Java

Este proyecto es una aplicación en Java que simula el flujo de un restaurante utilizando hilos (Threads) para manejar tareas de forma secuencial.

🚀 Funcionalidades principales

Tomar un pedido de un cliente

Preparar la comida

Cobrar la cuenta

Simulación de tiempos con Thread.sleep()

Ejecución en orden gracias a join()

🧠 Lógica del programa
La lógica del programa está separada en dos clases principales:

✅ TareaRestaurante.java
Clase que representa una tarea individual en el restaurante. Contiene:

Atributos: descripción de la tarea (String).
Métodos:

run(): simula la ejecución de la tarea con un tiempo aleatorio.

✅ Restaurante.java
Clase principal que maneja la secuencia de tareas.

Crea tres hilos: Tomar pedido, Preparar comida, Cobrar cuenta.

Usa start() para iniciar los hilos.

Usa join() para que las tareas se ejecuten en orden.

🧺 Estructura de datos
No se utilizan estructuras complejas, ya que el objetivo es la gestión de hilos.
Cada tarea se modela como un objeto Thread extendido en la clase TareaRestaurante.

📦 Clases utilizadas

java.lang.Thread

java.lang.InterruptedException

🧩 Organización del flujo
El flujo del programa sigue el orden natural de un restaurante:

📋 Tomar pedido

🍳 Preparar la comida

💵 Cobrar la cuenta

💾 Persistencia
No utiliza archivos, la simulación se ejecuta directamente en memoria.

🖥 Requisitos para ejecutar
JDK 8 o superior

Cualquier IDE (Eclipse, IntelliJ, NetBeans) o compilador de línea de comandos

👨‍💻 Autores

Carlos Sierra

Yesenia Perez

Andres Morales
