package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        // testing move
        tree.move(tree.getRoot());

        String stringData = "Red Red Orange Yellow Green Blue Violet Indigo";
        String[] data = stringData.split(" ");
        for(String s : data) {
            //create item with value set to String s
            tree.addItem(new Node(s));
        }
        // testing add
        tree.move(tree.getRoot());

        // testing remove
        tree.removeItem(new Node("Green"));
        tree.move(tree.getRoot());
        tree.removeItem(new Node("Green"));
        tree.move(tree.getRoot());
        tree.removeItem(new Node("Yellow"));
        tree.move(tree.getRoot());
        tree.removeItem(new Node("Blue"));
        tree.move(tree.getRoot());




    }
}
