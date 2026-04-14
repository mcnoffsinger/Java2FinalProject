# Project Proposal

## Name
### Maxwell Noffsinger


## Project title
### Chord Name to Tabs Converter


## Description
The user could enter a chord progression in two formats (Nashville numbers and key or full chord names) and the program would return tabs for bass chords into either the terminal or a formatted html document.

## Why is this a Java 2 project?
This project would require multiple data structures and collections. It would require formatting output as well. It would use collections to keep scales and iterate through them as well. It would also use generics for containing these scales within a collection. The program itself is complex because it would have to search for the four notes closest together on the strings and that allow all the voices to chine through. This involves setting priorities for notes and seaching through multiple collections. 

## What is the MVP?
Program that accepts list of chords as input and outputs a formatted tab of output. 
### Example input: 
F#maj, G#min, Amin7, E5
### Example output:
--F#maj---G#min---Amin7---E5\
--3-------4-------0-------4\
--4-------6-------2-------2\
--4-------6-------3-------2\
--2-------4-------5-------0\

## What are stretch goals?
Using binary I/O to output to a pretty html file instead of the terminal

## AI use plan
I will code it mostly without AI, but for menial tasks and html if needed I will use AI to help me. 