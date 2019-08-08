package movies.movie;

public class Movie {
    private String name;
    private String genre;
    private int runtime;

    public Movie(String name, String genre, int runtime) {
        this.name = name;
        this.genre = genre;
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runtime;
    }
}
