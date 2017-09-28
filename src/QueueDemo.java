import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<Car> carQueue= new ArrayDeque<>();

        System.out.println(carQueue.offer(new Car("Nissan",1996)));
        System.out.println(carQueue.offer(new Car("BMW", 1997)));
        System.out.println(carQueue.offer(new Car("Niva",1990 )));
        System.out.println(carQueue.offer(new Car("Nissan", 2000)));
        System.out.println(carQueue.offer(new Car("Toyota", 2005)));

        System.out.println(carQueue.element());

        Queue<Car> lifoCarQueue= Collections.asLifoQueue(new ArrayDeque<>());


        lifoCarQueue.offer(new Car("Nissan",1996));
        lifoCarQueue.offer(new Car("BMW", 1997));
        lifoCarQueue.offer(new Car("Niva",1990 ));
        lifoCarQueue.offer(new Car("Nissan", 2000));
        lifoCarQueue.offer(new Car("Toyota", 2005));

        System.out.println(lifoCarQueue.element());

        LinkedList<Car> carLinkedList = new LinkedList<>();

        carLinkedList.add(new Car("Nissan",1996));
        carLinkedList.add(new Car("BMW", 1997));
        carLinkedList.add(new Car("Niva",1990 ));
        carLinkedList.add(new Car("Nissan", 2000));
        carLinkedList.add(new Car("Toyota", 2005));

        carLinkedList.add(3, new Car("Hyundai", 2008));

    }
}
