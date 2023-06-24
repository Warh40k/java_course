/**
 * A <code>hello world</code> program
 *
 * @author nikita
 * @version 1.0
 */
package org.stepic.java.example;
public class HelloWorld {
    /**
     * Program main method
     *
     * @param args cli args
     */
    public static void main(String[] args) {
        // simple code
        Nikitos nikitos = new Nikitos();
        Nikitos.Anton antosha = new Nikitos.Anton();
        Nikitos.Anton gandosha = new Nikitos.Anton();
        gandosha.name = "sdfjl";
        System.out.println(antosha.name);
        System.out.println(gandosha.name);
    }

}

class  Nikitos {

    public int num = 1;

    public static class Anton {
        public void getAnton() {
            System.out.print(name);
        }
        public String name = "Antonus";
    }

    public void getNikitos() {
        Anton anton = new Anton();
        anton.getAnton();
    }


}
