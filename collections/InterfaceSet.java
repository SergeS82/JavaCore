package collections;

import java.util.*;

class Car implements Comparable<Car> {
    private String brand;
    private String name;
    private boolean onSale;

    public static final String TOYOTA = "Toyota";
    public static final String KIA = "Kia";
    public static final String BMW = "BMW";
    public static final Comparator<Car> brandComparator = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            //return o1.brand.concat("%20s").formatted(" ").concat(o1.name.concat("%20s").formatted(" ")).compareTo(o2.brand.concat("%20s").formatted(" ").concat(o2.name.concat("%20s").formatted(" ")));
            return o1.brand.compareTo(o2.brand);
        }
    };
    static class BrandComparator implements Comparator<Car>{
        boolean isReversed = false;
        public BrandComparator(boolean isReversed) {
            this.isReversed = isReversed;
        }
        public BrandComparator() {
        }
        @Override
        public int compare(Car o1, Car o2) {
            if (isReversed) return o2.brand.compareTo(o1.brand);
            else return o1.brand.compareTo(o2.brand);
        }
    }
    public static final Comparator<Car> nameComparator = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            //return o1.brand.concat("%20s").formatted(" ").concat(o1.name.concat("%20s").formatted(" ")).compareTo(o2.brand.concat("%20s").formatted(" ").concat(o2.name.concat("%20s").formatted(" ")));
            return o1.name.compareTo(o2.name);
        }
    };

    public Car(String brand, String name, boolean onSale) {
        this.name = name;
        this.brand = brand;
        this.onSale = onSale;
    }

    public Car(String name, String brand) {
        this(name, brand, true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(brand, car.brand) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand);
    }

    @Override
    public int compareTo(Car o) {
        int cmp;
        cmp = this.brand.compareTo(o.brand);
        return switch (cmp) {
            case 0: {
                cmp = this.name.compareTo(o.name);
                yield switch (cmp){
                    default: yield cmp;
                };
            }
            default: yield cmp ;
        };
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", onSale=" + onSale +
                '}';
    }
}
public class InterfaceSet {
    public static void main(String[] args) {
        Car car1 = new Car(Car.TOYOTA, "Camri", false);
        Car car2 = new Car(Car.KIA, "Rio", false);
        Car car3 = new Car(Car.BMW, "X5", false);
        Car car4 = new Car(Car.BMW, "X3", false);
        Car car5 = new Car(Car.BMW, "X6", false);
        Car car6 = new Car(Car.TOYOTA, "Raw 4", true);
        Car car7 = new Car(Car.KIA, "Ceed", false);
        Car car8 = new Car(Car.TOYOTA, "Yaris", false);
        Car car9 = new Car(Car.BMW, "320i", false);
        Car car10 = new Car(Car.TOYOTA, "Corolla", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car10);
        // списки уникальных значений должны быть перегруженны методы Object
        // .. equals и hashCode Alt+Ins в IDEA
        // Для TreeSet необходимо чтобы класс реализовывал интерфейс Comparable<T> и метод compareTo
        // .. или передавать в конструктор класс реализующий интерфейс Comparator и метод compare
        // .. Методы compareTo или compare должны быть согласованы с методом equals
        Set<Car> hashSet = new HashSet<>(carList);
        Set<Car> linkedHashSet = new LinkedHashSet<>(carList);
        Set<Car> treeSet1 = new TreeSet<>(carList);
        Set<Car> treeSet2 = new TreeSet<>(new Car.BrandComparator(true).thenComparing(Car.nameComparator));
        for (Car car : treeSet2) {
            System.out.println(car);
        }

    }
}
