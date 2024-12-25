public class pattern05 {
    public static void main(String[] args) {
        //Reactangle printing:------->
       /*  for(int i=1;i<=4;i++){
            
            for(int j=1;j<=5;j++){
                
                System.out.print("*");

            }
            System.out.println();
        }*/

        //hollow reactangle:----->
        /*int n =4;
        int m=5;
        for(int i =1;i<=n;i++){
            for (int j=1;j<=m;j++){
                //cell ->(i,j)
                if(i==1 || j==1 ||i ==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }*/

        //half pyramid:---->

       /*   k int n=4;
       
        //outer loop
        for(int i=1;i<=n;i++){
        //inner:-
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }*/

        /*int n =4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /*  int n=4;
        for(int i=1;i<=n;i++){
            //inner loop -> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop -> stars print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }*/



        /*int n =5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        /*int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=n-i+1;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }*/


        /*int n=5;
        int number=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number++;//number= number+1
            }
            System.out.println();
        }*/

        //ternary operator
        int a = 10;
        int b =20;
        int max=(a>b)?a:b;
        System.out.println(max);


        
    }
}
