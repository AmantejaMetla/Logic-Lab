class IDGenerator {
    private static int next = 1000;
    
    public static int nextId() {
        int id = next;
        next++;
        return id;
    }
}

class User {
    private final int id;
    private String name;
    
    public User(String name) {
        this.id = IDGenerator.nextId();
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}

class Main10 {
    public static void main(String[] args) {
        User u1 = new User("A");
        User u2 = new User("B");
        System.out.println(u1.getId());
        System.out.println(u2.getId());
    }
}