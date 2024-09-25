import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Billy Bob", 50);

        ArrayList<Actor> cast = new ArrayList<>();
        cast.add(new Actor("Tuck Wilson", 46));
        cast.add(new Actor("Gordon Jewitt", 40));

        Movie movie = new Movie("Reception", "PG-13", director, cast, 148, "A thief steals tbe secret Diamond.", 829.89);

        TvShow tvShow = new TvShow("Tooth Fairy", "MA", director, cast, 5, 62);

        System.out.println(movie);

        System.out.println(tvShow);
    }
}
