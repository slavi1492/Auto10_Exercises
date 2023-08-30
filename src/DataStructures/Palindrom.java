package DataStructures;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to be checked:");
        String wordInput = input.nextLine().toLowerCase();
        char[] characterList = wordInput.toCharArray();
        int left =0;
        int right = characterList.length-1;
        boolean isPalindrome = false;
        while (left < right){
            if (characterList[left] != characterList[right]) {
                isPalindrome = false;
                break;
            }
            else {
                isPalindrome = true;
            }
            ++left;
            --right;

        }
        if (isPalindrome) System.out.println("The word is palindrom");
        else System.out.println("The word is not palindrom");


    }

}
