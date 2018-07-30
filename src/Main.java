import Songs.Song;
import Songs.SongList;

public class Main{
    public static void main(String[] args){
        SongList songs=new SongList();

        Song s = new Song();
        s.setName("1999");
        s.setAlbum("1999");
        s.setArtist("Prince");
        s.setRating(10);

        //ArrayList<Song> mySongs = new ArrayList<>();
        songs.addSong(s);

        Song a = new Song();
        a.setName("Don");
        a.setAlbum("1988");
        a.setArtist("Joke");
        a.setRating(7);

        songs.addSong(a);

        for (Song oneSong:songs.getMySongs()){
            System.out.printf("The song is %s \n The album is %s\n", oneSong.getArtist(), oneSong.getAlbum());

        }

    }
}