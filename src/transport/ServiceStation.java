package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport>{
    private String name;
    private final Queue<T> queue = new LinkedList<>();

    public ServiceStation(String name) {
        this.name = name;
    }

    public void addTransport (T  transport) {
        queue.offer(transport);
    }

    public void doDiagnsotic() {
        T transport = queue.poll();
        if (transport != null) {
            transport.passDiagnostic();
        } else {
            System.out.println("Диагностика всех автомобилей проведена. В очереди никого нет.");
        }
    }

}
