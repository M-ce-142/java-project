
class TablePrinter {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table of " + n + ": " + n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread extends Thread {

    TablePrinter obj;
    int num;

    MyThread(TablePrinter obj, int num) {
        this.obj = obj;
        this.num = num;
    }

    public void run() {
        obj.printTable(num);
    }
}

public class CO3_25 {

    public static void main(String[] args) {

        TablePrinter printer = new TablePrinter();

        MyThread t1 = new MyThread(printer, 5);
        MyThread t2 = new MyThread(printer, 7);

        t1.start();
        t2.start();
    }
}
