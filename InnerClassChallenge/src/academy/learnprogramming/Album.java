package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private SongList songs;

    public Album(String title, String artist) {
        this.songs = new SongList();
        this.title = title;
        this.artist = artist;
    }

    public boolean addSong (String title, int duration) {
       // goes to inner class to do the logic of adding
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(track);

        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + track);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song currentSong = songs.findSong(title);

        if (currentSong != null) {
            playlist.add(currentSong);
            return true;
        }
        System.out.println("The song is not in the album: " + title);
        return false;
    }

    // inner class
    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add (Song song) {
            //check if song is already in album - if not, add
            if (songs.contains(song)) {
                System.out.println("Error - song not added");
                return false;
            }
            this.songs.add(song);
            System.out.println("Song added: " + song.toString());
            return true;
        }

        private Song findSong(String title) {
            for (Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int track) {
            int index = track-1;

            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}
