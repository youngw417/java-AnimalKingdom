package animalkingdom;

public class Birds extends AbsAnimal{

    public Birds(String name, int year){
        super(name, year);
    }

    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }
    //  @Override
    // public String toString(){
    //     return "Id: " + id + ",  Name: " + name + ",  Year named: " + yearNamed;
    // }
}