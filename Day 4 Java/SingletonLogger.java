class SingletonLogger {
    private static SingletonLogger instance = null;
    private static final String PREFIX = "[APP] ";
    
    private SingletonLogger() {
        //private constructor
    }
    
    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }
    
    public void log(String msg) {
        System.out.println(PREFIX + msg);
    }
}

class Main15 {
    public static void main(String[] args) {
        SingletonLogger l1 = SingletonLogger.getInstance();
        SingletonLogger l2 = SingletonLogger.getInstance();
        System.out.println(l1 == l2);
        l1.log("Started");
    }
}