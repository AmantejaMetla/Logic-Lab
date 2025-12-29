public class Stopwatch {
    private boolean running;
    private int ticks;

    public void start() {
        running = true;
    }

    public void stop() {
        running = false;
    }

    public void reset() {
        ticks = 0;
    }

    public int elapsed() {
        return ticks;
    }

    public boolean isRunning() {
        return running;
    }

    public void incrementTick() {
        if (running) ticks++;
    }

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        sw.start();
        for (int i = 0; i < 1000; i++) {
            if (sw.isRunning()) sw.incrementTick();
        }
        sw.stop();
        System.out.println(sw.elapsed());
        sw.reset();
    }
}
