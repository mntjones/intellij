package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");


    // static nested class
    public static void main(String[] args) {

        // 4 tyoes of nested classes in Java:
            // - static - used to associate a class with its outer class
                // cannot access the non-static methods/variables of its outer class without
                // first creating an instance of that class
            // - non-static / inner class
            // - local class / inner class defined inside a scope block (method)
            // - anonymous class / nested class without a class name


//        Gearbox mcLaren = new Gearbox(6);
//        // Note nomenclature to declare
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


        //Local Class example
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener () {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        // anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        System.out.println("choose an option: 0 to quit or 1");
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
