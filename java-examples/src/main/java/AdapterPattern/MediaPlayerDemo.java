package AdapterPattern;

/**
 * Created by alexyang on 6/5/17.
 *
 * An adapter is a class that makes two incompatible interfaces compatible. While internally it contains the same
 * calling interface for one type of object, internally, it contains a class instance of a different type and will
 * call that different set of interfaces so to expand the original capability. To explain this better, in the following
 * example, we have an old class 'AudioPlayer' that could only play mp3. We add an adapter to 'AudioPlayer' so now it
 * can play other types of music that its member adaptor object can also play.
 */
public class MediaPlayerDemo {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.playMedia("mp3");
        player.playMedia("vlc");
        player.playMedia("mp4");
        player.playMedia("acc");
    }
}
