public class Student {

    private int id;
    private String name;
    private String city;
    private double percentage;

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    public Student setPercentage(double percentage) {
        this.percentage = percentage;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPercentage() {
        return percentage;
    }

    public Student(int id, String name, String city, double percentage) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.percentage = percentage;
    }

    public Student() {}

    public String toString() {
        return "Student[id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
    }
}
