class MyThraed1 extends Thread {
    @Override
    public void run() {
        int i =0;
        while (i<40000) {
            System.out.println("My thread1 is for cooking is running! ");
            System.out.println("I am happy !!");
            i++;

        }

    }

}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i =0;
        while (i<40000) {
            System.out.println("My thread2 for chatting is running! ");
            System.out.println("I am sad :( !");
            i++;

        }

    }

}

public class MultithredingThreadClass {
    public static void main(String agras[]) {
        MyThraed1 t1 = new MyThraed1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }

}
