package PCK;

public class AudioPlayer implements Playable, Recordable{
	
	@Override
    public void play() {
        System.out.println("AudioPlayer playing audio.");
    }

    @Override
    public void record() {
        System.out.println("AudioPlayer recording audio.");
    }
}
