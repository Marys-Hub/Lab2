package Cinema;

public class MVCPatterndemo {
    public static void main(String[] args) {
        Cinema model  = printMovieFromDatabase();

        CinemaView view = new CinemaView();

        CinemaController controller = new CinemaController(model, view);

        controller.updateView();

        //update model data
        controller.setMovieName("Kill Bill");
        controller.setMovieCategory("love");
        System.out.println("After updating, Movie Details are as follows");
        System.out.println("After updating, Movie Details are as follows");

        controller.updateView();
    }

    private static Cinema printMovieFromDatabase(){
        Cinema movie = new Cinema();
        movie.setName("Kill BILL 2022");
        movie.setId("02");
        movie.setCategory("action & thriller");
        return movie;
    }
}
