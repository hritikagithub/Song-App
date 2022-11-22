import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("album1" ,"Alan Walker");
        album1.addSong("Song 1",5.2);
        album1.addSong("Song 2",3.5);
        album1.addSong("Song 3",6.5);
        album1.addSong("Song 4",3.5);
        album1.addSong("Song 5",3.5);
        album1.addSong("Song 6",2.5);

       LinkedList<Song> myplayList = new LinkedList<>();
        album1.addToPlayList("Song 1",myplayList);
        album1.addToPlayList("Song 2",myplayList);
        album1.addToPlayList("Song 3",myplayList);
        album1.addToPlayList("Song 4",myplayList);
        album1.addToPlayList("Song 5",myplayList);

        play(myplayList);
    }
    public static void play(LinkedList<Song>playList){

    }
}