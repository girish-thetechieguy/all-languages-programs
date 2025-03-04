/**
 * Note: Sound API provides capabilities for playing and capturing audio.
 */

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class _01_sound_api {
    public static void main(String[] args) {
        try {
            // Load an audio file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(_01_sound_api.class.getResource("sound.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start(); // Play the audio
            System.out.println("Playing sound...");
            Thread.sleep(3000); // Wait for 3 seconds to let the sound play
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
