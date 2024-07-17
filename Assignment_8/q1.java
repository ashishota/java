class OddEvenThread extends Thread {
    int start, end;
    public OddEvenThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        if (start % 2 == 0) {
            start++;
        }
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }
}
public class q1 {
    public static void main(String[] args) {
        int m = 1, n = 10;
        OddEvenThread oddThread = new OddEvenThread(m, n);
        oddThread.start();
        if (m % 2 == 1) {
            m++;
        }
        for (int i = m; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}




