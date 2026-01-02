class Temperature {
    private final double celsius;
    
    public Temperature(double celsius) {
        this.celsius = celsius;
    }
    
    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }
    
    public Temperature withCelsius(double c) {
        return new Temperature(c);
    }
    
    public double getCelsius() {
        return celsius;
    }
}

class Main8 {
    public static void main(String[] args) {
        Temperature t = new Temperature(25.0);
        System.out.println(t.toFahrenheit());
        Temperature t2 = t.withCelsius(30.0);
        System.out.println(t.getCelsius());
    }
}