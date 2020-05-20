package academy.learnprogramming;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 120);
        album.addSong("Love don't mean a thing", 180);
        album.addSong("Holy man", 222);
        album.addSong("Hold on", 333);
        album.addSong("Lady double dealer", 444);
        album.addSong("You can't do it right", 324);
        album.addSong("High ball shooter", 664);
        album.addSong("The gypsy", 235);
        album.addSong("Soldier of fortune", 311);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 245);
        album.addSong("I put the finger on you", 432);
        album.addSong("Lets go", 332);
        album.addSong("Inject the venom", 634);
        album.addSong("Snowballed", 121);
        album.addSong("Evil walks", 322);
        album.addSong("C.O.D.", 221);
        album.addSong("Breaking the rules", 453);
        album.addSong("Night of the long knives", 334);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        }
        else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();


        while (!quit) {
            System.out.println("Enter a choice: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Finished playing songs in playlist");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We are at the first song in the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else {
                            System.out.println("We are at the first song in the playlist");
                        }
                    }
                    else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("End of playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: ");
        System.out.println("\t 0 - to quit");
        System.out.println("\t 1 - to play next song");
        System.out.println("\t 2 - to play previous song");
        System.out.println("\t 3 - to replay current song");
        System.out.println("\t 4 - to list songs in playlist");
        System.out.println("\t 5 - to print menu");
        System.out.println("\t 6 - to delete current song");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();

        System.out.println("==========");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==========");
    }
}
