import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        hashSetExample();
        treeSetExample();
        linkedHashSetExample();

    }

    public static void hashSetExample() {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car("Nissan",1996));
        cars.add(new Car("BMW", 1997));
        cars.add(new Car("Niva",1990 ));
        cars.add(new Car("Nissan", 2000));

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }


    }

    public static void treeSetExample() {
        Set<Integer> tree = new TreeSet<>();

        tree.add(34);
        tree.add(21);
        tree.add(67);
        tree.add(23);
        tree.add(676);
        tree.add(453);
        tree.add(23);

        Iterator<Integer> iterator = tree.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

    public static void linkedHashSetExample() {
        Set<Integer> linkedTree = new LinkedHashSet<>();

        linkedTree.add(34);
        linkedTree.add(21);
        linkedTree.add(67);
        linkedTree.add(23);
        linkedTree.add(676);
        linkedTree.add(453);
        linkedTree.add(23);

        Iterator<Integer> iterator = linkedTree.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
