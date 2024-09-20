import java.util.concurrent.Semaphore;
public class Question {
public static void main(String[] args) {
Semaphore uppercaseSemaphore = new Semaphore(1);
Semaphore lowercaseSemaphore = new Semaphore(0);
Thread uppercaseThread = new Thread(() -> {
try {
for (char c = 'A'; c <= 'Z'; c++) {
uppercaseSemaphore.acquire();
System.out.print(c);
lowercaseSemaphore.release();
}
} catch (InterruptedException e) {
e.printStackTrace();
}
});
Thread lowercaseThread = new Thread(() -> {
try {
for (char c = 'a'; c <= 'z'; c++) {
lowercaseSemaphore.acquire();
System.out.print(c+" ");
uppercaseSemaphore.release();
}
System.out.println("");
} catch (InterruptedException e) {
e.printStackTrace();
}
});
uppercaseThread.start();
lowercaseThread.start();
try {
uppercaseThread.join();
lowercaseThread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
