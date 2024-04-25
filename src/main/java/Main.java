
public static void main(String[] args) {

//    In the 'main' method, initialize an object of the 'MusicPlayer' and 'VideoPlayer' classes with the 'Playable' interface (polymorphism).

    Playable MusicPlayer1 = new MusicPlayer();
    Playable VideoPlayer1 = new VideoPlayer();

    MusicPlayer1.play();
    VideoPlayer1.play();


//    In the 'main' method, create an object of the 'MediaController' class and use it to play both a song and a video.

    MediaController mediacontroller1 = new MediaController();

    mediacontroller1.playMedia(MusicPlayer1);
    mediacontroller1.playMedia(VideoPlayer1);

}