package AdapterPattern;

/**
 * Created by alexyang on 6/5/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("Playing vlc music...");
    }

    @Override
    public void playMp4() {
        // System.out.println("Playing mp4 music...");
    }
}
