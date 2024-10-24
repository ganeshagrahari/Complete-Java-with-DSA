//QUESTIONS-->
//A>write a program in java to input a string and reverse it?
//B>Write a program in java to input a string and check it if it is a palendrome string or not eg.-> level and radar!
//C> Write a program in java to input a string and count number of vowels and consonants in the string.
//D>Write a program in java ro input a string and convert it in uppercase 
//E> write a program in java to find longest word in a string.
//f> write a program in java to find all substring of a string:-->

import java.util.Scanner;

public class classwork_23_09_2024 {

    public static void main(String[] args) {
      /*   //to input a string:--->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String!!");

        String st= sc.nextLine();
        // For reverse the string:---->
        StringBuffer rev=new StringBuffer(st);
        rev.reverse();
        System.out.println(rev);

        //Same application:--->
        StringBuilder revl = new StringBuilder(st);
        revl.reverse();
        System.out.println(revl);

        String reverse=" ";
        for(int i=0;i<st.length();i++){
            reverse=st.charAt(i)+reverse;
        }
        System.out.println(reverse);*/


//Q----2

       /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string!!");
        String st= sc.nextLine();

        //reverse:-->
        String revl="";
        for(int i=0;i<st.length();i++){
            revl=st.charAt(i)+revl;

        }

        System.out.println(revl);

        //check-->
        if(revl.equalsIgnoreCase(st)){
            System.out.println("String is palindrome!!");

        }
        else{
            System.out.println();
        }
*/
//Q------>3
       /*Scanner sc =new Scanner(System.in);
       System.out.println("Enter your String!!");
       String st=sc.nextLine();
       char ch;
       int vowel_count=0;
       int consonant_count=0;
       st=st.toLowerCase();
       for(int i=0;i<st.length();i++){
         ch =st.charAt(i);
         if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u' ){
            vowel_count++;
         }
         else if(ch>='a' && ch<='z'){
            consonant_count++;
         }
        
       }
       System.out.println("vowels are :"+vowel_count);
       System.out.println("consonants are: "+consonant_count);*/

//Q---4:-->
           /* Scanner sc =new Scanner(System.in);
            System.out.println("Enter your String!!");
            String st=sc.nextLine();
            char ch;
            st=st.toUpperCase();
            System.out.println(st);

            */

   //Q---5:--->
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter your String!!");
            String st=sc.nextLine();

            //Spliting the string  in to words:-
            String[] words=st.split( " ");

            //finding the longest word:--->
            
            




        
    }
}