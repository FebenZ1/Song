package Songs;
import java.util.ArrayList;

public class SongList {
    ArrayList<Song> mySongs;
    public SongList(){
        mySongs=new ArrayList<Song>();
    }

    public ArrayList<Song> getMySongs() {
        return mySongs;
    }

    public void setMySongs(ArrayList<Song> mySongs) {
        this.mySongs = mySongs;
    }

    public void addSong (Song value){
        mySongs.add(value);
    }
}
