package e_Dependency_Inversion_DIP.bad;


/*
The DIP states that high-level modules/classes
should not depend on low-level modules/classes
directly; instead, they should depend on abstractions


The NotificationService class directly depends on the EmailSender class, violating the DIP.
 */
// Bad example
class RockMusicPlayer {
    public void playRockMusic() {
        // Play rock music
    }
}

class ClassicalMusicPlayer {
    public void playClassicalMusic() {
        // Play classical music
    }
}

public class MusicApp {
    private RockMusicPlayer rockMusicPlayer;

    public MusicApp() {
        this.rockMusicPlayer = new RockMusicPlayer();
    }

    public void playRockMusic() {
        rockMusicPlayer.playRockMusic();
    }
}

