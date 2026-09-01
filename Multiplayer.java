class Song {
    String name;
    Song next;
    Song previous;

    Song(String name) {
        this.name = name;
        this.next = null;
        this.previous = null;
    }
}

public class Multiplayer {

    Song current;
    Song head;

    // Add a song
    void addSong(String name) {

        Song newSong = new Song(name);

        if (head == null) {
            head = newSong;
            current = head;
            return;
        }

        Song temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newSong;
        newSong.previous = temp;
    }

    // Play next song
    void playNextSong() {

        if (current == null) {
            System.out.println("Playlist is empty");
        } else if (current.next == null) {
            System.out.println("No next song");
        } else {
            current = current.next;
            System.out.println("Playing: " + current.name);
        }
    }

    // Play previous song
    void playPreviousSong() {

        if (current == null) {
            System.out.println("Playlist is empty");
        } else if (current.previous == null) {
            System.out.println("No previous song");
        } else {
            current = current.previous;
            System.out.println("Playing: " + current.name);
        }
    }

    // Display playlist
    void display() {

        Song temp = head;

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Multiplayer player = new Multiplayer();

        player.addSong("kalyani");
        player.addSong("jhol");
        player.addSong("kolaveri di ");
        player.addSong("sun raha hai ");

        player.display();

        System.out.println("Current: " + player.current.name);

        player.playNextSong();
        player.playNextSong();

        player.playPreviousSong();
    }
}
