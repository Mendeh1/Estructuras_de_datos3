import java.util.LinkedList;

public class TicketQueue {
    private LinkedList<Request> queue;

    public TicketQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(String personName, int numTickets) {
        // Agregar la solicitud al final de la cola
        Request request = new Request(personName, numTickets);
        queue.addLast(request);
    }

    public void processRequest() {
        if (!isEmpty()) {
            // Procesar la solicitud al principio de la cola
            Request request = queue.removeFirst();
            System.out.println("Procesando solicitud para " + request.getPersonName() + " para " + request.getNumTickets() + " boletos");
        }
    }

    public void cancelRequest() {
        if (!isEmpty()) {
            // Cancelar la solicitud al principio de la cola
            Request request = queue.removeFirst();
            System.out.println("Solicitud para " + request.getPersonName() + " para " + request.getNumTickets() + " boletos cancelada");
        }
    }

    public boolean isEmpty() {
        // Verificar si la cola está vacía
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();

        // Agregar solicitudes
        ticketQueue.addRequest("Usuario1", 2);
        ticketQueue.addRequest("Usuario2", 3);
        ticketQueue.addRequest("Usuario3", 1);

        // Procesar solicitudes en orden
        ticketQueue.processRequest();
        ticketQueue.processRequest();
        ticketQueue.processRequest();

        // Cancelar una solicitud
        ticketQueue.cancelRequest();
    }
}



