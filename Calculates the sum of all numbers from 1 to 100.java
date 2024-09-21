import java.util.concurrent.*;
public class Question {
public static void main(String[] args) {
int n = 100;
int numThreads = 4;
ExecutorService executor = Executors.newFixedThreadPool(numThreads);
CompletionService<Long> completionService = new ExecutorCompletionService<>(executor);
int segmentSize = n / numThreads;
int remaining = n % numThreads;
int start = 1;
for (int i = 0; i < numThreads; i++) {
int end = start + segmentSize - 1 + (i < remaining ? 1 : 0);
completionService.submit(new SumCalculator(start, end));
start = end + 1;
} long totalSum =0;
try {
for (int i = 0; i < numThreads; i++) {
totalSum += completionService.take().get();
}
} catch (InterruptedException | ExecutionException e) {
e.printStackTrace();
}
executor.shutdown();
System.out.println("Sum of numbers from 1 to " + n + " is: " + totalSum);
}
}
class SumCalculator implements Callable<Long> {
private int start;
private int end;
public SumCalculator(int start, int end) {
this.start = start;
this.end = end;
}
public Long call() {
long sum = 0;
for (int i = start; i <= end; i++) {
sum += i;
} return sum;
}
}
