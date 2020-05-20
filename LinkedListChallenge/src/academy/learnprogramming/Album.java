package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.songs = new ArrayList<Song>();
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public boolean addSong (String title, int duration) {
        //check if song is already in album - if not, add
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            System.out.println("Song added to Album " + this.getTitle());
            return true;
        }
        else {
            System.out.println("Error. Not added");
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    private Song findSong(int track) {
        int index = track-1;

        if (index >= 0 && index < songs.size()) {
            return songs.get(index);
        }
        return null;
    }

    public boolean addToPlaylist(int track, LinkedList<Song> playlist) {
        int index = track -1;

        if ((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have a track " + track);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song currentSong = findSong(title);

        if (currentSong != null) {
            playlist.add(currentSong);
            return true;
        }
        System.out.println("The song is not in the album " + this.getTitle());
        return false;
    }

}
