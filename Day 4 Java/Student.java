public class Student {
    public final int id;
    private String name;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student(101);
        s.setName("Alice");
        System.out.println(s.getId());
    }
}
