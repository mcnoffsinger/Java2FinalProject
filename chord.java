import java.util.*;

public class chord {

    private String name;


    private String root;
    private String third;
    private String fifth;
    private String seventh = null;//may not be used, may be null

    String[] roots = {"A ", "Bb", "B ", "C ","Db","D ","Eb","E ","F ","Gb","G ","Ab"};
    List<String> rootsList = Arrays.asList(roots);

    //constructor takes name, return list of four numbers
    public chord(String chordName, String[] E, String[] A, String[] D, String[] G){

        if (chordName.length() != 6 || !(rootsList.contains(chordName.substring(0,2)) )){
            this.name = "ERROR ";
            this.root = "E ";
            this.fifth = "E ";
            this.third = "E ";
        
        
        }else {

            this.root = chordName.substring(0,2);

            if (chordName.substring(2, 5).equals("maj")){
                this.third = rootsList.get((rootsList.indexOf(this.root)+4)%12);//mod 12 to loop back around
                if (chordName.substring(5,6).equals("7")){
                    this.seventh = rootsList.get((rootsList.indexOf(this.root)+11)%12);
                }
            }else {
                this.third = rootsList.get((rootsList.indexOf(this.root)+3)%12);
                if (chordName.substring(5,6).equals("7")){
                    this.seventh = rootsList.get((rootsList.indexOf(this.root)+10)%12);
                }
            }
            this.fifth = rootsList.get((rootsList.indexOf(this.root)+7)%12);

            this.name = chordName;
        }

            

        
        
            


        

    }
    public String getRoot(){
        return this.root;
    }
    public String getThird(){
        return this.third;
    }
    public String getFifth(){
        return this.fifth;
    }
    public String getSeventh(){
        return this.seventh;
    }
    public String getName(){
        return this.name;
    }

}
