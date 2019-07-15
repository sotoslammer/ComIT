package courses;

public abstract class Academic {
    private final int id;

    public Academic(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
