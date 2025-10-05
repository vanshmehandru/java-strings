package week8.assignmentproblems;



interface Playable {
    void play();
    void pause();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    @Override
    public void pause() {
        System.out.println("Video paused.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        // Polymorphism using interface reference
        Playable ref;

        ref = new MusicPlayer();
        ref.play();
        ref.pause();

        System.out.println();

        ref = new VideoPlayer();
        ref.play();
        ref.pause();
    }
}

