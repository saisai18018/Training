package management;

public class Course {
    private String id;
    private String title;

    public Course(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return id + " - " + title;
    }
}
