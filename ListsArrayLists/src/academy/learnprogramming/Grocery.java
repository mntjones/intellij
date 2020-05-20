package academy.learnprogramming;

import java.util.ArrayList;

public class Grocery {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem (String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0 ) {
            modifyGroceryList(position, newItem);
        }
    }
    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);

    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeItem(position);
        }
    }
    private void removeItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String item) {
        return groceryList.indexOf(item);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
