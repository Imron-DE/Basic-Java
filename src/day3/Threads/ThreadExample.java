package day3.Threads;
/* THREAD(asyncronous) : untuk  menjalankan bebrapa tugas secara bersamaan dilatar belakang
 tanpa menggangu proses utamanya */
 class MyThread extends Thread {
    // overrride methode run dari thread
     @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread().getName() : untuk menampilkan nama thread yang sedang berjalan
            System.out.println(Thread.currentThread().getName() + " VALUE : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Error : Intterupted Thread");
            }
        }
    }
 }


public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // thread pertama
        thread1.interrupt(); // interupsi thread pertama ketika lagi jalan untuk menampilkan error
        thread2.start(); // thread kedua yang akan berjalan walaupun thread1 mati

    }
}