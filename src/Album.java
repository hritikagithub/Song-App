import java.util.ArrayList;
import java.util.LinkedList;
public class Album {

    private String name ;
    private String artist ;
    private ArrayList<Song>songs;

    public Album(String name,String artist) {
        this.name = name;
        this.artist = artist ;
        this.songs = new ArrayList<>();
    }
    //finding the song in Album
    public boolean findSong(String title){
        for(Song checkSong : this.songs)
        {
            if(checkSong.getTitle().equals(title))
            {
                System.out.println("Song Found !!");
                return true;
            }
        }
        return false;
    }
    //adding Song in Album
    public boolean addSong(String title,double duration ){
        if(findSong(title)== true){
            System.out.println("Song is already present");
            return  false;
        }
        //else add
       songs.add(new Song(title,duration));
        return true;
    }
    //adding Song in PlayList by title
    public boolean addToPlayList(String title,LinkedList<Song> playList){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                playList.add(checkedSong);
                return true;
            }
        }
        return false;
    }
    //adding Song in PlayList by tracknumber
    public boolean addToPlayList(int tracknumber,LinkedList<Song>playList){
        int index = tracknumber-1;
        if(index >= 0 && index <= songs.size()-1){
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }
}
