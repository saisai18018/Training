package PCK;

public class MediaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playable audioPlayable = new AudioPlayer();
        Recordable audioRecordable = new AudioPlayer();

        Playable videoPlayable = new VideoPlayer();
        Streamable videoStreamable = new VideoPlayer();

        Recordable cameraRecordable = new Camera();
        Streamable cameraStreamable = new Camera();

        // AudioPlayer methods
        audioPlayable.play();
        audioRecordable.record();

        // VideoPlayer methods
        videoPlayable.play();
        videoStreamable.stream();

        // Camera methods
        cameraRecordable.record();
        cameraStreamable.stream();
    }

}
