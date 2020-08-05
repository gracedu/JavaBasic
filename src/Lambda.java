import java.util.*;
import java.util.stream.Collectors;

public class Lambda {
    @FunctionalInterface
    interface MyString {
        String myStringFunction(String str);
    }

    static class MyStringImpl implements MyString {

        @Override
        public String myStringFunction(String str) {
            return "old fashioned way of implementation " + str;
        }
    }

    public static void main(String[] args) {
        MyString oldStr = new MyStringImpl();
        System.out.println(oldStr.myStringFunction("cat"));

        MyString str1 = (str) -> "hello " + str;
        MyString str2 = (str) -> "goodbye " + str;
        System.out.println(str1.myStringFunction("cat"));
        System.out.println(str2.myStringFunction("cat"));

        System.out.println("*********************************");

        Bike b1 = new Bike(3, "triangle");
        Bike b2 = new Bike(4, "square");
        List<Bike> bikes = new ArrayList<>();
        bikes.add(b1);
        bikes.add(b2);
        List<Bike> list1 = bikes.stream().filter(b->b.getWheelNumber()==3).collect(Collectors.toList());
        List<Integer> list2 = bikes.stream().map((Bike bike) -> bike.getWheelNumber()).collect(Collectors.toList());
                                               //Bike::getWheelNumber
        String joined = bikes.stream().map(Object::toString).collect(Collectors.joining(", "));
                                           //(bike -> bike.toString())
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(joined);

        System.out.println("***************Convert a map to a list******************");
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");

        List<String> list = numbers.values().stream().collect(Collectors.toList());
        System.out.println(list);

        System.out.println("*******************List to map*************************");
        //we have the bike list
        Map<Integer, String> map1 = bikes.stream().collect(Collectors.toMap(b->b.getWheelNumber(), b->b.getWheelShape()));
        Map<Integer, String> map2 = bikes.stream().collect(Collectors.toMap(Bike::getWheelNumber, Bike::getWheelShape));
        System.out.println(map1);
        System.out.println(map2);

        System.out.println("***********Comparator***************");
        Person[] p = new Person[3];
        p[0] = new Person(100, 1, 20);
        p[1] = new Person(800, 2, 45);
        p[2] = new Person(1000, 3, 34);

        Arrays.sort(p, new AgeComparator());

        Comparator<Person> comp = (e1, e2) -> e1.getAge() - e2.getAge();

        Arrays.sort(p, (p1, p2) -> p1.getAge() - p2.getAge());

        System.out.println("*******Given Map<String,List<String>>, get a list of values*****");

        Map<String, List<String>> map3 = new HashMap<>();
        List<String> s1 = new ArrayList<>();
        s1.add("ragdoll");
        s1.add("domestic short hair");
        map3.put("cat", s1);
        List<String> s2 = new ArrayList<>();
        s2.add("poodle");
        s2.add("chiwawa");
        map3.put("dog", s2);

        List<String> result = map3.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(result);

    }
}
