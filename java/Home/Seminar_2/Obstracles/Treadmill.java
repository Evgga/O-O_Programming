package Home.Seminar_2.Obstracles;

public class Treadmill extends Obstracles{
    private final int distance;

    public Treadmill(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", dist=" + distance + '\n';
    }
}
