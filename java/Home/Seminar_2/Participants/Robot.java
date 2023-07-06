package Home.Seminar_2.Participants;

import Home.Seminar_2.Interface.Jump;
import Home.Seminar_2.Interface.Run;
import Home.Seminar_2.Obstracles.Treadmill;
import Home.Seminar_2.Obstracles.Wall;

public class Robot implements Run, Jump {
    private final String name;
    private final int heightJump;
    private int runDistance;

    public Robot(String name, int heightJump, int runDistance) {
        this.name = name;
        this.heightJump = heightJump;
        this.runDistance = runDistance;
    }

    public Robot(String name) {
        this.name = name;
        this.heightJump = 0;
        this.runDistance = 0;
    }

    @Override
    public boolean jump(Wall wall) {
        if (heightJump >= wall.getHeight()) {
            System.out.println(getName() + " перелетел");
            return true;
        } else {
            System.out.println(getName() + " выбыл из соревнования");
            return false;
        }
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (runDistance >= treadmill.getDistance()) {
            runDistance -= treadmill.getDistance();
            System.out.println(getName() + " проехал");
            return true;
        } else {
            System.out.println(getName() + " выбыл из соревнования");
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
