public class stringbuilder11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.append("world");
        System.out.println(sb);

        //System.out.println(sb.charAt(0));

        //set char at index :------------>
        /*sb.setCharAt(0, 'p');
        System.out.println(sb);*/

        //insert fxn--------->
        /*sb.insert(0, 's');
        System.out.println(sb);*/


        //delete fxn --------->
        /*sb.delete(2,3);
        System.out.println(sb);*/
        /*sb.append("i");
        sb.append("s");
        System.out.println(sb);
        System.out.println(sb.length());*/


        //q----->reverse the string------------------------->

        /*for(int i =0; i<sb.length()/2;i++){
            int front = i;
            int back =sb.length()-1-i;

            char frontchar =sb.charAt(front);
            char backchar = sb.charAt(back);
            
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

    }*/
    
}
}
