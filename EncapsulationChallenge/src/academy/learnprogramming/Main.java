package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);

        System.out.println("Initial page count = " + printer.getNumberOfPages());

        int pagesPrinted = printer.printPage(4);

        System.out.println("Pages printed was " + pagesPrinted + " New count is: " + printer.getNumberOfPages());

        pagesPrinted = printer.printPage(2);

        System.out.println("Pages printed was " + pagesPrinted + " New count is: " + printer.getNumberOfPages());



    }
}
