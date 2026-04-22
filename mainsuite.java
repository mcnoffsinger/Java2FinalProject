import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class mainsuite {
    static String[] E = {"E ","F ","Gb","G ","Ab","A ", "Bb", "B ", "C ","Db","D ","Eb"};
    static String[] A = {"A ", "Bb","B ", "C ","Db","D ","Eb", "E ","F ","Gb","G ","Ab"};
    static String[] D = {"D ","Eb","E ","F ","Gb","G ","Ab","A ", "Bb", "B ", "C ","Db"};
    static String[] G = {"G ","Ab","A ", "Bb", "B ", "C ","Db","D ","Eb","E ","F ","Gb"};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    

        /*
        This was for testing
        chord thing = (new chord("hehehe", E, A, D, G));
        chord thing2 = (new chord("Dbmaj ", E, A, D, G));
        chord thing3 = (new chord("B min7", E, A, D, G));
        System.out.println(thing.getRoot());
        System.out.println(thing.getThird());
        System.out.println(thing.getFifth());
        System.out.println(thing.getSeventh());
        List<chord> thinglist = new ArrayList<>();
        thinglist.add(thing);
        thinglist.add(thing2);
        thinglist.add(thing3);

        tab fultab = new tab(thinglist, E, A, D, G);
        fultab.printTab();
        */
        
        //main program loop
        List<String> inputList = new ArrayList<>();
        
        
        System.out.println("Hello! This is a simple porgram that outputs tabs for chords you enter. You probably won't get any use out of it, but I will.");
        while (true){
            System.out.println("Enter a chord to add or type \"exit\" to quit and see results. \nWhen typing the chords, type the capital letter (A-G), a space, min or maj, and then either a space or the number 7. \nEX: \"A min7\" or \"Dbmin \" \n");
            
            
            String input = scanner.nextLine();
            //System.out.println(input);
            if (input.contains("exit")){
                break;
            }else{
                inputList.add(input);
            }
        }
        List<chord> thinglist = new ArrayList<>();
        for (String inputtedChord : inputList){
            thinglist.add(new chord(inputtedChord, E, A, D, G));
        }
        tab fulltab = new tab(thinglist, E, A, D, G);
        fulltab.printTab();
        scanner.close();
        
    

    
    } 
}
