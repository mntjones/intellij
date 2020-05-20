package academy.learnprogramming;

public interface NodeList {
    Item getRoot();
    boolean addItem(Item item);
    boolean removeItem(Item item);
    void move(Item root);
}
