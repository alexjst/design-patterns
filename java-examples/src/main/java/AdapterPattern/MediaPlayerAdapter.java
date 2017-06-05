package AdapterPattern;

/**
 * Created by alexyang on 6/5/17.
 */
public class MediaPlayerAdapter implements MediaPlayer {
    public void playMedia(String type) {
        if (type == null) return;
        else if (type.equalsIgnoreCase("vlc")) {
            VlcPlayer player = new VlcPlayer();
            player.playVlc();
        } else if (type.equalsIgnoreCase("mp4")) {
            Mp4Player player = new Mp4Player();
            player.playMp4();
        }
    }
}
