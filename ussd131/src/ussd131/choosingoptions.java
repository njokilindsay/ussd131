package ussd131;
import java.util.Scanner;
public class choosingoptions {

	public static void main(String[] args) {
		System.out.println("0:Sh20 (30mins, 3hrs)");
		System.out.println("1:Sh10 (15Mins, 1hr)");
		System.out.println("2:Sh20 (15Mins, midnight)");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20");
		System.out.println("5:Okoa 10");
		System.out.println("6:Okoa 5");
		System.out.println("7:Okoa 20(900MB, 1hr)");
		System.out.println("8:Okoa Internet");
		System.out.println("98:More");
		Scanner number= new Scanner(System.in);		
		int option= number.nextInt();	
		switch(option) {
		case 0:
			System.out.println("Existing Unpaid Okoa:0");
			System.out.println("New Okoa request:20");
			System.out.println("TOTAL DEBT will be:20\n1:Accept\n2:Decline\n0:Back");
			Scanner input= new Scanner(System.in);		
			int choice= input.nextInt();	
			if(choice==1) {
				System.out.println("Kindly wait as we process your request");
			}
			else if(choice==2) {
				System.out.println("Thank you for using Safaricom.");	
			}
			else {
				System.out.println("0:Sh20(30mins,3hrs)");
				System.out.println("1:Sh10(15mins,1hr)");
				System.out.println("2:Sh20(15mins,midnight)");
				System.out.println("3:Okoa 50");
				System.out.println("4:Okoa 20");
				System.out.println("5:Okoa 10");
				System.out.println("6:Okoa 5");
				System.out.println("7:Okoa 20(900MB,1hr)");
				System.out.println("8:Okoa Internet");
				System.out.println("98:More");
			}
			break;
		case 1:
			System.out.println("TOTAL DEBT will be:10\n1:Accept\n2:Decline\n0:Back");
			break;
		case 2:
			System.out.println("TOTAL DEBT will be:20\n1:Accept\n2:Decline\n0:Back");
			break;
		case 3:
			System.out.println("TOTAL DEBT will be:50\n1:Accept\n2:Decline\n0:Back");
			break;
		case 4:
			System.out.println("TOTAL DEBT will be:20\n1:Accept\n2:Decline\n0:Back");
			break;
		case 5:
			System.out.println("TOTAL DEBT will be:10\n1:Accept\n2:Decline\n0:Back");
			break;
		case 6:
			System.out.println("TOTAL DEBT will be:5\n1:Accept\n2:Decline\n0:Back");
			break;
		case 7:
			System.out.println("TOTAL DEBT will be:20\n1:Accept\n2:Decline\n0:Back");
			break;
		case 8:
			System.out.println("Okoa bundles:");
			break;
		case 98:
			System.out.println("9:Okoa Minutes\n10:Okoa SMS\n11:Lipa Okoa\n#Check Balance\n0:Back");
		default:
			System.out.println("Invalid choice.Try again");
		}

	}

}
