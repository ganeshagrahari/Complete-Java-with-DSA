import java.util.Scanner;

public class operator12 {
    public static void main(String[] args) {



        // bit operatins ----->
        //Q--> get the 3rd bit(position =2) of a number n. (b=0101)
        //bit mask :1<<i
        //opeartion :AND

        /*int n = 5;
        int pos =3;
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("bit was zero!!");

        }
        else{
            System.out.println("bit was one !!");
        }*/


        /*int n = 5;
        int pos =1;
        int bitmask=1<<pos;
       

        int newnumber = bitmask | n;
        System.out.println(newnumber);*/


        /*int n = 5;
        int pos =2;
        int bitmask=1<<pos;
        int notbitmask = ~(bitmask);
       

        int newnumber = notbitmask & n;
        System.out.println(newnumber);*/

        Scanner sc = new Scanner(System.in);
        int oper =sc.nextInt();
        int n = 5;
        int pos =1;
        //int oper =1;(oper=1 :set nd oper=0: clear)update bit to 1 else update to 0
        int bitmask =1<<pos;
        if (oper ==1){
            //set 
            
            int newnumber=bitmask | n;
            System.out.println(newnumber);
        }
        else{
            int newbitmask= ~(bitmask);
            int newnumber =newbitmask & n;
            System.out.println(newnumber);

        }
        


        
    }
}
