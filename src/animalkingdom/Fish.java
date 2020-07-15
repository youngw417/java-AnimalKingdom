package animalkingdom;

public class Fish extends AbsAnimal{


    public Fish(String name, int year){
        super(name, year);
    }


    @Override
    public String move(){
        return "swim";
    }

    @Override
    public String breath(){
        return "gills";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }
}