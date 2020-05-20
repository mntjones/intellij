package academy.learnprogramming;

public class Tree implements NodeList{
    private Item root =  null;

    public Tree(Item root) {
        this.root = root;
    }

    @Override
    public Item getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Item item) {
        if(this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = item;
            return true;
        }

        Item currentItem = this.root;

        while(currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison <0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison >0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    // the node with a previous is the root
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                // equal
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(Item item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        Item currentItem = this.root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);

            if (comparison == 0) {
                // found item in list
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                }
                else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            else if (comparison < 0) {
                currentItem = currentItem.next();
            }
            else {
                // item is greater than one to be deleted- item is not in list
                System.out.println("Item " + item.getValue() + " is not in list");
                return false;
            }
        }
        return false;
    }

    @Override
    public void move(Item root) {
        if (root == null) {
            System.out.println("The list is empty");
        }
        else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
