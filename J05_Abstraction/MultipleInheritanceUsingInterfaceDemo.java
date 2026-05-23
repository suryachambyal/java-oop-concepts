package J05_Abstraction;

// Demonstrating Multiple Inheritance using Interfaces

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

public class MultipleInheritanceUsingInterfaceDemo {

    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone();

        s1.takePhoto();
        s1.playMusic();
    }
}
