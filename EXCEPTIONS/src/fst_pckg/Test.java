package fst_pckg;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Robot> robots = new ArrayList<>();
        robots.add(new FlyingRobot("Robot1"));
        robots.add(new FlyingRobot("Robot2"));
        robots.add(new CleaningRobot("CleaningRobot3"));
        robots.add(new CleaningRobot("CleaningRobot4"));
        performAllTasks(robots);
    }

    public static void performAllTasks(List<Robot> robots) {
        System.out.println("----------------------");
        for (Robot robot:robots){
            robot.performTask();
        }
    }
}
