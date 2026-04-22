
import java.util.*;
public class tab {
    //consructor takes list of chords, has output method. 
    private List<String> nameList = new ArrayList<>();
    private List<Integer> eIndexes = new ArrayList<>();
    private List<Integer> aIndexes = new ArrayList<>();
    private List<Integer> dIndexes = new ArrayList<>();
    private List<Integer> gIndexes = new ArrayList<>();


    public tab(List<chord> chordList, String[] E, String[] A, String[] D, String[] G){
        List<String> eArrayList = Arrays.asList(E);
        List<String> aArrayList = Arrays.asList(A);
        List<String> dArrayList = Arrays.asList(D);
        List<String> gArrayList = Arrays.asList(G);


        for (chord chordTones : chordList){
            nameList.add(chordTones.getName());
            if (chordTones.getSeventh() == null){
                if (eArrayList.indexOf(chordTones.getRoot())<10){
                    eIndexes.add(eArrayList.indexOf(chordTones.getRoot()));
                    aIndexes.add(aArrayList.indexOf(chordTones.getFifth()));
                    dIndexes.add(dArrayList.indexOf(chordTones.getRoot()));
                    gIndexes.add(gArrayList.indexOf(chordTones.getThird()));
                }else{
                    eIndexes.add(eArrayList.indexOf(chordTones.getFifth()));
                    aIndexes.add(aArrayList.indexOf(chordTones.getRoot()));
                    dIndexes.add(dArrayList.indexOf(chordTones.getThird()));
                    gIndexes.add(gArrayList.indexOf(chordTones.getFifth()));

                }
            }else{
                if (eArrayList.indexOf(chordTones.getRoot())>=10){
                    eIndexes.add(eArrayList.indexOf(chordTones.getFifth()));
                    aIndexes.add(aArrayList.indexOf(chordTones.getRoot()));
                    dIndexes.add(dArrayList.indexOf(chordTones.getThird()));
                    gIndexes.add(gArrayList.indexOf(chordTones.getSeventh()));
                }else{
                    eIndexes.add(eArrayList.indexOf(chordTones.getRoot()));
                    aIndexes.add(aArrayList.indexOf(chordTones.getFifth()));
                    dIndexes.add(dArrayList.indexOf(chordTones.getSeventh()));
                    gIndexes.add(gArrayList.indexOf(chordTones.getThird()));

                }
            }
        }
    }
    public void printTab(){
        System.out.print("  ");
        for (String name : nameList){
            System.out.print(name + "  ");
        }
        System.out.println("");
        printString(gIndexes);
        printString(dIndexes);
        printString(aIndexes);
        printString(eIndexes);

    }
    public void printString(List<Integer> string){
        System.out.print("--");
        for (int fret : string){
            if (fret > 9){
                System.out.print(fret + "------");
            }else{
                System.out.print(fret + "-------");
            }
        }
        System.out.println(" ");

    }
}
