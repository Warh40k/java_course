/**
 * A <code>hello world</code> program
 *
 * @author nikita
 * @version 1.0
 */
package org.stepic.java.example;

import java.util.Scanner;

public class HelloWorld {
    /**
     * Program main method
     *
     * @param args cli args
     */
    public static void main(String[] args) {
        // simple code
        Robot robot = new Robot();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Robot.moveRobot(robot,x,y);

    }

}