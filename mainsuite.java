
import java.util.Collection;

public class mainsuite {
    static String[] E = {"E ","F ","Gb","G ","Ab","A ", "Bb", "B ", "C ","Db","D ","Eb"};
    static String[] A = {"A ", "Bb","B ", "C ","Db","D ","Eb", "E ","F ","Gb","G ","Ab"};
    static String[] D = {"D ","Eb","E ","F ","Gb","G ","Ab","A ", "Bb", "B ", "C ","Db"};
    static String[] G = {"G ","Ab","A ", "Bb", "B ", "C ","Db","D ","Eb","E ","F ","Gb"};
    public static void main(String[] args){
    chord thing = (new chord("D min7", E, A, D, G));
    System.out.println(thing.getRoot());
    System.out.println(thing.getThird());
    System.out.println(thing.getFifth());
    System.out.println(thing.getSeventh());

    } 
}
