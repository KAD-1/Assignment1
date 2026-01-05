public class Person extends User {
    private String gender;

    public Person(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public void setgender(String gender) { this.gender = gender; }
    public String getgender() { return gender; }

    @Override
    protected String getValues() {
        return super.getValues() + ", " + gender;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }
}
