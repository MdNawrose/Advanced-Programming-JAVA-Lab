import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TicketBookingSystem {
    private Queue<String> ticketRequests;
public TicketBookingSystem() {
        ticketRequests = new LinkedList<>();
    } public void addBookingRequest(String customerName) {
        ticketRequests.offer(customerName);
        System.out.println("Booking request added for " + customerName);
    }  public void processBookings() {
        while (!ticketRequests.isEmpty()) {
            String customerName = ticketRequests.poll();
            System.out.println("Booking processed for " + customerName);
        }  }  public void displayBookingStatus() {
        if (ticketRequests.isEmpty()) {
            System.out.println("No pending bookings.");
  } else {
            System.out.println("Pending bookings:");
            for (String customerName : ticketRequests) {
                System.out.println(customerName);
            } }   } public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        Scanner scanner = new Scanner(System.in);
        int numRequests;
  System.out.print("Enter the number of booking requests: ");
        numRequests = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
         for (int i = 1; i <= numRequests; i++) {
            System.out.print("Enter customer name for booking request " + i + ": ");
            String customerName = scanner.nextLine();
            bookingSystem.addBookingRequest(customerName);
        }  bookingSystem.displayBookingStatus();
 bookingSystem.processBookings();
      bookingSystem.displayBookingStatus();
   scanner.close();
    }
}
