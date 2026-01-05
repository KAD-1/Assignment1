import java.util.Objects;

public class User {
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    protected String getValues() { return name + ", " + age; }

    public String showinfo() { return "Name:щ" + name + " Age:" + age; }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
