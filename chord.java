

public class chord {

    private String root;
    private String third;
    private String fifth;
    private String seventh;//may not be used, may be null

    String[] roots = {"A", "Bb", "B", "C","Db","D","Eb","E","F","Gb","G","Ab"};
    //constructor takes name, return list of four numbers
    public chord(String chordName, String[] E, String[] A, String[] D, String[] G){
       

        if (chordName.charAt(1) !='b'){
            this.root = chordName.substring(0,1);
            


        }

    }
    public String getRoot(){
        return this.root;
    }
}
