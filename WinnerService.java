import java.util.ArrayList;
import java.util.Scanner;

public class WinnerService {

		private ArrayList<Integer> storage;

	    public WinnerService() {
	        storage = new ArrayList<>();
	    }

	    public void addLotteryID(int lotteryID) {
	        storage.add(lotteryID);
	    }

	    public boolean checkNumber(int num) {
	        return storage.contains(num);
	    }

	    public static void main(String[] args) {
	        WinnerService winnerService = new WinnerService();
	        Scanner scanner = new Scanner(System.in);

	        // Simulating the addition of lottery IDs at midnight
	        winnerService.addLotteryID(100);  // Example lottery ID
	        winnerService.addLotteryID(200);  // Example lottery ID

	        System.out.print("Enter a number to check: ");
	        int numberToCheck = scanner.nextInt();

	        boolean isWinner = winnerService.checkNumber(numberToCheck);

	        if (isWinner) {
	            System.out.println("Congratulations! You are a winner.");
	        } else {
	            System.out.println("Sorry! You did not win.");
	        }

	        scanner.close();
	    }

	}


