package PCK;

public class VideoPlayer implements Playable, Streamable {

    @Override
    public void play() {
        System.out.println("VideoPlayer playing video.");
    }

    @Override
    public void stream() {
        System.out.println("VideoPlayer streaming video.");
    }
}