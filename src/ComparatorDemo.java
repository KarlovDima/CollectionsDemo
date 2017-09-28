import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();


        cars.add(new Car("Nissan",1996));
        cars.add(new Car("BMW", 1997));
        cars.add(new Car("Niva",1990 ));
        cars.add(new Car("Nissan", 2000));

        /*cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/




//        cars.sort(new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                Integer first= o1.getYear();
//                Integer second= o2.getYear();
//                return first.compareTo(second);
//            }
//        });

        cars.stream().sorted((c1,c2)->((Integer)c1.getYear()).compareTo(c2.getYear())).forEach(c -> System.out.println(c));

        System.out.println(cars.stream().filter(p->p.getYear()>=1997).count());

//        Iterator<Car> iterator=cars.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
    }
}

