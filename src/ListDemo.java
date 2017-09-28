import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        arrayListExample();
        System.out.println();
        linkedListExample();
    }

    private static void linkedListExample() {
        LinkedList<Car> cars = new LinkedList<>();

        cars.add(new Car("Toyota", 1976));
        cars.add(new Car("BMW", 2005));
        cars.add(new Car("Niva", 2001));
        cars.add(new Car("Lexus", 1999));

        cars.addFirst(new Car("Lexus", 1999));

        Iterator<Car>iterator=cars.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getName());
    }

    private static void arrayListExample() {
        ArrayList<Car> cars=new ArrayList<>();

        cars.add(new Car("Toyota", 1976));
        cars.add(new Car("BMW", 2005));
        cars.add(new Car("Niva", 2001));
        cars.add(new Car("Lexus", 1999));

        System.out.println("cars.size() = " + cars.size());
        System.out.println("cars.contains = " + cars.contains(new Car("BMW", 2005)));

        System.out.println("cars = " + cars.indexOf(new Car("Niva", 2001)));

        Car selectedCar=cars.get(3);
        System.out.println("selectedCar = " + selectedCar);

        Iterator<Car>iterator=cars.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getName());

        cars.clear();

        System.out.println("cars.isEmpty() = "+cars.isEmpty());
    }
}
