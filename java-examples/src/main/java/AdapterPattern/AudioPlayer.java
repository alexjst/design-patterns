package AdapterPattern;

/**
 * Created by alexyang on 6/5/17.
 */
public class AudioPlayer implements MediaPlayer {
    protected MediaPlayerAdapter adapter = new MediaPlayerAdapter();
    @Override
    public void playMedia(String type) {
        if (type.equalsIgnoreCase("mp3")) {
            // built-in support for mp3 player
            System.out.println("Playing mp3 music...");
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            adapter.playMedia(type);
        } else {
            System.out.println("Unsupported music format");
        }
    }
}
