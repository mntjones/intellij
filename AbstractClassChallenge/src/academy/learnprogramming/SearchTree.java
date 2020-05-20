package academy.learnprogramming;

public class SearchTree implements NodeList{
    private Item root = null;

    public SearchTree(Item root) {
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
        // start comparing from the root
        Item currentItem = this.root;

        while(currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(item);
                    return true;
                }
            }
            else if(comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                }
                else {
                    // the node with a previous is the root
                    currentItem.setPrevious(item);
                    return true;
                }
            }
            else {
                // equal
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        // won't get here, but Java wants this here
        return false;
    }

    @Override
    public boolean removeItem(Item item) {
        if (item != null) {
            System.out.println("Deleting item: " + item.getValue());
        }
        Item currentItem = this.root;
        Item parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);

            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void move(Item root) {
        // recursive method
        if (root != null) {
            move(root.previous());
            System.out.println(root.getValue());
            move(root.next());
        }
    }

    private void performRemoval(Item item, Item parent) {
        if (item.next() == null) {
            //no right tree, so make parent point to left tree - which may be null
            if (parent.next() == item) {
                //item is right child of parent
                parent.setNext(item.previous());
            }
            else if (parent.previous() == item) {
                //item is left child of parent
                parent.setPrevious(item.previous());
            }
            else {
                //parent is item - root of tree
                this.root = item.previous();
            }
        }
        else if (item.previous() == null) {
            // no left tree, so make parent point to right tree - which may be null
            if (parent.next() == item) {
                // item is right child of parent
                parent.setNext(item.next());
            }
            else if (parent.previous() == item) {
                // no left tree, make parent point to right tree - which may be null
                if (parent.next() == item) {
                    // item is right child of parent
                    parent.setNext(item.next());
                }
                else if (parent.previous() == item) {
                    //item is left child of parent
                    parent.setPrevious(item.next());
                }
                else {
                    // item is root
                    this.root = item.next();
                }
            }
            else {
                // neither left or right is null - ACK!
                // from the sub tree, find the smallest element (left-most)

                Item current = item.next();
                Item leftmost = item;

                while (current.previous() != null) {
                    leftmost = current;
                    current = current.previous();
                }
                //put smallest value into our node to be deleted
                item.setValue(current.getValue());
                // and delete the smallest
                if (leftmost == item) {
                    // there was no leftmost node, so current now points to smallest
                    item.setNext(current.next());
                }
                else {
                    //set smallest node's parent to point to smallest node's right child
                    // which may be null
                    leftmost.setPrevious(current.next());
                }
            }
        }
    }
}
