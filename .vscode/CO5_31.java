
import java.util.*;

public class CO5_31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("How many songs do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        System.out.println("\nFull Playlist:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying (removed): " + firstSong);
        } else {
            System.out.println("\nPlaylist is empty.");
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped (removed): " + lastSong);
        } else {
            System.out.println("\nPlaylist is empty.");
        }

        System.out.println("Final Playlist:");
        System.out.println(playlist);

        sc.close();
    }
}
