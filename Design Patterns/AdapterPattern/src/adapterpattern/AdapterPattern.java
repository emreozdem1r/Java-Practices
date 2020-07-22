package adapterpattern;
/**
 *
 * @author Emre
 */
public class AdapterPattern {

    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "beyond.mp3");
        audioPlayer.play("mp4", "video1.mp4");
        audioPlayer.play("vlc", "video2.vlc");
        audioPlayer.play("avi", "video3.avi");

    }
    
}
