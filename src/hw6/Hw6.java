
package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author Adam Hennefer
 * CS401 Assignment #6
 * Travis-CI introduction
 * 
 */
public class Hw6 {

    public static<T> int linearSearch(List<T> list, Predicate<T> check){
        for (int i = 0; i < list.size(); i++) 
            //if (check.equals(list.get(i))) return i;
            if(check.test(list.get(i))) return i;
        return -1;
        }
   
    
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        List<Integer> iList = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        String word;
//        String check = "working";  
        
        // initialize string array
        sList.add("first");
        sList.add("second");
        sList.add("third");
        
        // initialize integer array
        for(int i=0; i<3; i++){
            iList.add(i);
        }
        
//        System.out.println("Enter at least three words.");
//        System.out.println("One at a time: ");
//        
//        for(int i=0; i<3; i++){
//            word = input.next();
//            sList.add(word);
//        }
        Predicate<Integer> matchFirstPositionInt = (i)-> i == 0;
        Predicate<Integer> matchOtherPositionInt = (i)-> i == 2;
        Predicate<Integer> notMatchInt = (i)-> i == 9;
//        Predicate<String> matchFirstPositionStr = Predicate.isEqual("first");
        Predicate<String> matchFirstPositionStr = (s)-> s == "first";
        Predicate<String> matchOtherPositionStr = (s)-> s == "third";
        Predicate<String> noMatchStr = (s)-> s == "noMatch";

//        Predicate<Integer> same = (x, y)->(return x == y);
//        Predicate<String> comparator = (x, s2)-> {
//            if(s1 == s2) return true;
//        };
        
        // print int list
        System.out.print("iList = ");
        for(int i=0; i< iList.size(); i++){
            System.out.print(iList.get(i)+", ");
        }
        System.out.println();
        
        int firstPosMatch = linearSearch(iList, matchFirstPositionInt);
        int otherPosMatch = linearSearch(iList, matchOtherPositionInt);
        int noPosMatch = linearSearch(iList, notMatchInt);
                    
        System.out.println("First Position: "+firstPosMatch);
        System.out.println("Other Position: "+otherPosMatch);
        System.out.println("No Match Position: "+noPosMatch);
        
        //print out the string list
        System.out.print("sList = ");
        for(int i=0; i< sList.size(); i++){
            System.out.print(sList.get(i)+", ");
        }
        System.out.println();
        
        int firstPosMatchStr = linearSearch(sList, matchFirstPositionStr);
        int otherPosMatchStr = linearSearch(sList, matchOtherPositionStr);
        int noPosMatchStr = linearSearch(sList, noMatchStr);
        
        System.out.println("First Position: "+firstPosMatchStr);
        System.out.println("Other Position: "+otherPosMatchStr);
        System.out.println("No Match Position: "+noPosMatchStr);
        
    }
}
    

