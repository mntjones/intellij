package academy.learnprogramming;

public class Node extends Item{
    public Node(Object value) {
        super(value);
    }

    @Override
    Item next() {
        return this.rightLink;
    }

    @Override
    Item setNext(Item item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    Item previous() {
        return this.leftLink;
    }

    @Override
    Item setPrevious(Item item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(Item item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else {
            return -1;
        }
    }
}
