package DataStructures;

import java.util.LinkedList;
import java.util.Scanner;

public class ListInReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter element of the list");
        LinkedList<String> userList = new LinkedList<>();
        String elementEntry;
        boolean isEnd = false;
        while (!(isEnd))
        {
            System.out.println("Enter element or enter \"end\" if you are done:");
            elementEntry = input.nextLine();
            if (elementEntry.equals("end")){
                isEnd = true;
            }
            else {
                userList.add(elementEntry);
            }
        }
        LinkedList<String> reverseUserList = new LinkedList<>();
        for (int i =0; i< userList.size(); ++i){
            reverseUserList.add(userList.get(userList.size()-1-i));
        }

        System.out.println(reverseUserList);
        }


}
