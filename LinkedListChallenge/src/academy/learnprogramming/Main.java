package academy.learnprogramming;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("At Last", "Etta James");
        album.addSong("At Last", 380);
        album.addSong("Songbird", 444);
        album.addSong("Joyful Noise", 245);
        album.addSong("Summertime", 500);
        album.addSong("Tonight", 333);
        album.addSong("Love", 222);
        album.addSong("My Song", 421);

        albums.add(album);

        album = new Album("Celebrity", "Nsync");
        album.addSong("Celebrity", 380);
        album.addSong("Dirty Pop", 444);
        album.addSong("Gonna Be Me", 245);
        album.addSong("Bye Bye Bye", 500);
        album.addSong("Merry Christmas", 333);
        album.addSong("Gone", 222);
        album.addSong("No Strings Attached", 421);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();

        albums.get(0).addToPlaylist("At Last", playlist);
        albums.get(0).addToPlaylist("Summertime", playlist);
        albums.get(0).addToPlaylist(22, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(5, playlist);

        play(playlist);

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
        System.out.println("\t 4 - to ist songs in playlist");
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
