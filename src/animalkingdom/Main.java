package animalkingdom;
import java.util.List;
import java.util.ArrayList;

public class Main{

    public static List<AbsAnimal> filteredList = new ArrayList<>();

    public static void filterFunc(List<AbsAnimal> mamals, FilterList tester){

        filteredList.clear();
        for (AbsAnimal mamal: mamals){
            if (tester.test(mamal)){
                filteredList.add(mamal);
            }

        }
    }

    public static void main(String[] args){

        System.out.println("\n\n\n*** Welcome to Animal Kingdom ***");
        System.out.println("** Work with Abstract Classes **");

        Mammals panda = new Mammals("Panda", 1869);
        System.out.println(panda);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        System.out.println(zebra);
        System.out.println(koala);

        Birds pigeon =  new Birds("Pigeon", 1837);
        Birds toucan =  new Birds("Toucan", 1758);
        Birds peacock =  new Birds("Peacock", 1821);
        Birds parrot =  new Birds("Parrot", 1824);
        Birds swan =  new Birds("Swan", 1758);
        System.out.println(pigeon);
        System.out.println(toucan);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        System.out.println(salmon);
        System.out.println(catfish);

        List<AbsAnimal> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(toucan);
        animalList.add(peacock);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
        // System.out.println(animalList);

        animalList.sort((b, a) -> a.getYearNamed() - b.getYearNamed());
        System.out.println("\n\n\n");
        animalList.forEach( a -> System.out.println(a));

        animalList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println("\n\n\n");
        animalList.forEach(a -> System.out.println(a));
        animalList.sort((a, b) -> a.move().compareToIgnoreCase(b.move()));
        animalList.forEach(a -> System.out.println(a + "  move: " + a.move()));

        filterFunc(animalList, (a) -> a.breath() == "lungs");
        System.out.println("\n\n\n");
        filteredList.forEach(a -> System.out.println(a + "   breath: " + a.breath()));

        filterFunc(animalList, (a) -> a.breath() == "lungs" && a.getYearNamed() == 1758);
         System.out.println("\n\n\n");
        filteredList.forEach(a -> System.out.println(a + "   breath: " + a.breath() + "   year named: " + a.getYearNamed()));

        filterFunc(animalList, (a) -> a.breath() == "lungs" && a.reproduce() == "eggs");
         System.out.println("\n\n\n");
        filteredList.forEach(a -> System.out.println(a + "   breath: " + a.breath() + "   reproduce: " + a.reproduce()));

        filterFunc(animalList, a -> a.getYearNamed() == 1758);
        filteredList.sort( (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println("\n\n\n");
        filteredList.forEach( a -> System.out.println(a));

        filterFunc(animalList, a -> a instanceof Mammals);
        filteredList.sort( (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println("\n\n\n");
        filteredList.forEach( a -> System.out.println(a));
    }
}

