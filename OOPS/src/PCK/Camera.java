package PCK;

public class Camera implements Recordable, Streamable{
	@Override
    public void record() {
        System.out.println("Camera recording video.");
    }

    @Override
    public void stream() {
        System.out.println("Camera streaming live video.");
    }
}
