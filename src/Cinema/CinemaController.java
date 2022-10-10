package Cinema;

public class CinemaController {
    private Cinema model;
    private CinemaView view;

    public CinemaController(Cinema model, CinemaView view){
        this.model = model;
        this.view = view;
    }

    public void setMovieName(String name){
        model.setName(name);
    }

    public String getMovieName(){
        return model.getName();
    }

    public void setMovieId(String id){
        model.setId(id);
    }

    public String getMovieId(){
        return model.getId();
    }

    public void setMovieCategory(String category){
        model.setCategory(category);
    }

    public String getMovieCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printCinemaDetails(model.getName(), model.getId(), model.getCategory());
    }
}
