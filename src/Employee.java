import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private String email;
    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    /*
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return id == e.id &&
                name.equals(e.name) &&
                Objects.equals(email, e.email);
    }
*/
    public static Map<Employee, Integer> getData() {
        Map<Employee, Integer> hm = new HashMap<>();
        Employee em = new Employee(1, "grace", "grace@test.com");
        System.out.println(em.hashCode());
        hm.put(em, 10);
        return hm;
    }


    public static void main(String[] args) {
        Map<Employee, Integer> hm = getData();
        Employee em = new Employee(1, "grace", "grace@test.com");
        System.out.println(em.hashCode());

        Integer value = hm.get(em);
        System.out.println(value);
    }
    //If we don't have hashCode() and equals, value will be null.
    //Because hash codes of the two objects are different.
    //If we only have hashCode() method, value is still null. Because the two objects are not equal.
}
