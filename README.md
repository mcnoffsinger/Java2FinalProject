# Bass Tab Creator 🎸

## How to use
CLONE THE REPO AND OPEN IT IN VS CODE!  
In the terminal, run mainsuite.java or press the play button (if you have the java extensions). The exact command should be `java mainsuite.java`. If this does not work, compile the other two files with `javac chord.java` and `javac tab.java`.  



The program will prompt the user with entering in a chord name. These must be formatted like this: `XXmmm7`. XX is the two character note the chord starts on, like A or Ab (A flat). the "mmm" bit should be replaced with "min" or "maj" to indicate the type of chord. The last character of the chord needs to be either a blank space or a "7". If an incorrect stream of text is entered the chord will be ERROR and all of th enotes in it will be E. After the chords are entered, type exit to see the results.  

If the terminal is not long enough then the output will appear garbled and messy. Please extend the display of the terminal so that you can read each line on it's own.  

Example of good input: `"A min7"`, `"Bbmaj "`, `"C maj "`, `"Ebmin7"`  

Example of bad input: `"Amin"`, `"c maj7"`, `"Db min "`, `"Cbmaj7"`


## Java 2 Relevance
The program uses generics and arrayLists to create objects and iterate through lists. Additionally, the program has unique classes that tested my coding ability and critical thinking. 

## AI Usage
I did not use AI on this project, other than the copilot overview when I looked up something silly, like "how do input java" or "string indexing java". 
I usually don't feel proud of something unless I did it entirely on my own, so I avoided using AI for anything. Funnily enough, I wrote the last bit of this project at home with "Online Java IDE," a site with numerous ads and no AI integration.
In fact, even the emoji on the top of this page wasn't AI. I used the windows key + period key shortcut to type it on my own. 
