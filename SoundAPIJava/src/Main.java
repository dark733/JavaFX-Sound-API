import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner s = new Scanner(System.in);
        File file = new File("M3.wav");
        AudioInputStream audioStream =AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        String response = s.nextLine();

        System.out.println("Hello world!");

    }
}