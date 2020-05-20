package academy.learnprogramming;

public abstract class Item {
    // need to access from subclass
    protected Item rightLink = null;
    protected Item leftLink = null;

    protected Object value;

    public Item(Object value) {
        this.value = value;
    }

    // must be defined in extending class
    abstract Item next();
    abstract Item setNext(Item item);
    abstract Item previous();
    abstract Item setPrevious(Item item);
    abstract int compareTo(Item item);

    public Object getValue() {
        return value;
    };

    public void setValue(Object value) {
        this.value = value;
    }
}
