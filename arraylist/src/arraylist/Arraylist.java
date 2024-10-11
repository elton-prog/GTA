
package arraylist;
import java.util.ArrayList;
import java .util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String>hostel=new ArrayList<>();
        hostel.add("maseno");
        hostel.add("Nyambundi");
        hostel.add("Niles");
        hostel.add("kilimanjaro");
        //iterate through all elements and print them
        System.out.print("current elements in the array list:");
        for (String element:hostel){
            System.out.println("element");
        }
        //insert an element at the first position
        String newElement="Nyawita";
        hostel.add(0,newElement);
        System.out.println("After inserting "+newElement+"at the first position:");
        System.out.println(hostel);
        //retrieve an element at a specified index
        Scanner x=new Scanner(System.in);
        System.out.println("Enter an index to retrieve the element(0 to 4)");
        int indexToRetrieve=x.nextInt();
        if(indexToRetrieve>=0 & indexToRetrieve<hostel.size()){
            String retrievedElement=hostel.get(indexToRetrieve);
            System.out.println("Element at index"+indexToRetrieve+":"+retrievedElement);
        }else{
            System.out.println("invalid index!");
        }
        //update an arrayelement at a specified index
        System.out.print("Enter an index to update the element(0 to 4):");
        int indexToUpdate = x.nextInt();
        if (indexToUpdate>=0 & indexToUpdate<hostel.size()){
            System.out.print("Enter new value:");
            String newValue=x.next();
            hostel.set(indexToUpdate, newValue);
            System.out.println("Update ArrayList:"+hostel);
        }else{
            System.out.println("invalid index!");
        }
        //Remove the third element if it exists
        if (hostel.size()>=3){
            hostel.remove(2);
            System.out.println("After removing the thrid element:");
            System.out.println(hostel);
        }else{
            System.out.println("Not enough elements to remove th third one!");
        }
        //close the scanner
        x.close();
    }
}
