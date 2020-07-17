package animalkingdom;

abstract class AbsAnimal{
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearNamed;

    public AbsAnimal(){
        maxId++;
        id = maxId;
    }

    public AbsAnimal(String name, int year){

        maxId++;
        id = maxId;
        this.name = name;
        yearNamed = year;

    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();
 

    void eat(){
        System.out.println("I am eating food!!!");
    }

    String getName(){
        return name;
    }

    int getYearNamed(){
        return yearNamed;
    }
    int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Id: " + id + ",  Name: " + name + ",  Year named: " + yearNamed;
    }

}