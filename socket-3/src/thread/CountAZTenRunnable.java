package thread;

import java.util.concurrent.CyclicBarrier;

public class CountAZTenRunnable implements Runnable {
    private static final int TOTAL_THREADS = 26; // aからzまでの26スレッド
    private static CyclicBarrier barrier = new CyclicBarrier(TOTAL_THREADS);
    private char threadChar;

    public CountAZTenRunnable(char threadChar) {
        this.threadChar = threadChar;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                // すべてのスレッドがここで数を出力し、次の同期ポイントまで待機します。
                System.out.println(threadChar + "" + (i + 1));
                barrier.await(); // 他のスレッドを待つ
            }
        } catch (Exception e) {
            System.err.println("Thread " + threadChar + " interrupted: " + e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_THREADS; i++) {
            char c = (char) ('a' + i);
            Runnable runnable = new CountAZTenRunnable(c);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
