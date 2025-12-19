import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<String> s = new ArrayList<>();//Type of ArrayList

        s.add("Hello ");
        s.add("what's up bro");//Adding Strings to the List

        System.out.println();//It can be used to skip a line. System.out.print(); prints in a straight line whereas with println it also skips a line

        System.out.println(s);

        List<String> x = new ArrayList<>();

        x.add("I am learning Data Structures \n");//Adding String to the List

        int [] arr = {10,78,25,69};//Declaration and Initialization

        Arrays.sort(arr);//Sorting the Array

        System.out.println(x.add("Like this " +  Arrays.toString(arr)));//Prompt that the user is learning

        for(int i : arr){
            System.out.print(i + ",\t");//foreach loop printing the sorted array and providing a format!!!
        }


    }
}