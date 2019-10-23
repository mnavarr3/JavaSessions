import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[] args){

        //creating array list to store names and grades
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Double> gradeList = new ArrayList<Double>();

        //adding names to the array list
        nameList.add("Peggy");
        nameList.add("Catherine");
        nameList.add("Bill");

        //add grade
        gradeList.add(new Double(100));

        //displaying the size of the ArrayList
        System.out.println("The arraylist has " + nameList.size() + " objects stored in it.");

        //display items in nameList
        for(int index=0; index <nameList.size(); index++ ) {
            System.out.println(nameList.get(index));
        }

        //display items in nameList and indecies
        for(int index=0; index <nameList.size(); index++ ){
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        }
        //now remove item at index 1
        nameList.remove(1);

        //replace the item at index 1
        nameList.set(1, "Becky");

        System.out.println("The item at index 1 was removed. Here are the items now.");

        for(int index=0; index <nameList.size(); index++ ){
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        }

    }


}
