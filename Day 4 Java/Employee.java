class Employee {
    private String name;
    private double salary;
    
    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("invalid name");
        }
    }
    
    public void setSalary(double s) {
        if (s >= 10000 && s <= 500000) {
            this.salary = s;
        } else {
            System.out.println("invalid salary");
        }
    }
    
    public void raise(double percent) {
        if (percent >= 0 && percent <= 100) {
            salary = salary + (salary * percent / 100);
        } else {
            System.out.println("invalid raise");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
}

class Main13 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("");
        e.setSalary(9000);
        e.setSalary(120000);
        e.raise(10);
        e.raise(200);
    }
}