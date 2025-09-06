class TareaRestaurante extends Thread {
    private final String tarea;

    public TareaRestaurante(String nombre, String tarea) {
        super(nombre); // nombre del hilo
        this.tarea = tarea;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " esta realizando: " + tarea);
            Thread.sleep((int)(Math.random() * 3000) + 1000); // simula tiempo de la tarea
            System.out.println(getName() + " termino la tarea: " + tarea);
        } catch (InterruptedException e) {
        }
    }
}

public class Restaurante {
    public static void main(String[] args) throws InterruptedException {
        // Crear los 3 hilos
        TareaRestaurante tomarPedido = new TareaRestaurante("Hilo-1", "Tomar pedido del cliente");
        TareaRestaurante prepararComida = new TareaRestaurante("Hilo-2", "Preparar la comida");
        TareaRestaurante cobrarCuenta = new TareaRestaurante("Hilo-3", "Cobrar la cuenta");

        // Ejecutar en orden usando join()
        tomarPedido.start();
        tomarPedido.join();

        prepararComida.start();
        prepararComida.join();

        cobrarCuenta.start();
    }
}