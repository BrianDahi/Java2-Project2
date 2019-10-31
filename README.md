# proj2F19
Whats given 
String stID = "OKCE";
Objective 
- is to find the postion of the given String and search through a trim down mesonet file.
-next is to find the letterAvg
-last find how many other stations have this letter
* I started in PosAvg since it was first in the driver class. I have two constructors one default and the other to take in the given String. I made a read()method to read in Mesonet.txt I used an arrayList this time. I then created another method called indexOfStation() thsi searched for the given String that was passed into the construtor and stored the result as the index. For OKCE it is 79. Last for this class was the format of the toString() and to get the avges that would equal 79. For this case we only need the first two sets.
* Now to MesoInherit
- this class consited of taking in the parameter mesoStation which only held the given station OKCE. The goal of this class was to break down the String and find the Ascii value of each char and take three avg - floor,ceiling, and natrual. The method int[] calAverage consisted of the computation of getting these avgs, and the method letterAverage() returned the natural avg.
* The last class is LetterAvg() Which took in a char variable that is the result from the avg in MesoInherit. We made a call to PosAvg because I made a get method to get the arrayList which had stored the mesonet file. In this class I made two more arrayList one for temporary store and the other to store the mathcing String that had the starting letter that mathced the given one.
-My first method is numberOfStationWithLetterAvg() which consisted of copying the arrayList and searching through. I made a for loop  with a temp string. Each loop would compare the char with the 0 index of the String from mesonet String. If it was true it would store into my counter and store that string into my mathch ArrayList.
-Second is the toString() we all love it is formated to concat the Strings and return the final Sting after the forloop.














