package org.stepic.java.hash_override;

public class Robot {

    private int x = 0, y = 0;
    private Direction direction = Direction.UP;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (direction) {
            case UP -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.UP;
        }
        System.out.println("Поворот влево");
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (direction) {
            case UP -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.UP;
            case DOWN -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.DOWN;
        }

        System.out.println("Поворот вправо");
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (direction) {
            case UP -> y++;
            case DOWN -> y--;
            case LEFT -> x--;
            case RIGHT -> x++;
        }
        System.out.println("Шаг вперед");
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction xDir = Direction.RIGHT;
        Direction yDir = Direction.UP;

        if(robot.getX() > toX) xDir = Direction.LEFT;
        if(robot.getY() > toY) yDir = Direction.DOWN;

        if (robot.getX() != toX) {
            rotateToDir(robot, xDir);

            while(robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            rotateToDir(robot, yDir);

            while(robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public static void rotateToDir(Robot robot, Direction dir) {

        while(robot.getDirection().ordinal() != dir.ordinal()) {
            robot.turnRight();
        }
    }
}
