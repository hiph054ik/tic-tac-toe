import java.util.Scanner;

public class GameTTT {
	Scanner scan = new Scanner(System.in);
	char userMarker;


	void turn() {
		FeildTTT field = new FeildTTT();
		int x = 0;
		System.out.println("Welcom to the game X0");
		field.prinField();
		while (field.gameOver != true && x < 9) {
			field.initialField();
			System.out.println("Please enter marker x or 0: ");
			userMarker = scan.next().charAt(0);
			if (userMarker != 'x' && userMarker != '0') {
				userMarker = 'x';
				System.out.println("is marker " + userMarker);
			}
			do {
				int userStrok;
				int userStolb;
				if (userMarker == '0') {
					System.out.println(userMarker + " you yurn.");
				} else {
					System.out.println(userMarker + " yuo turne");
				}
				System.out.println("Stroka: ");
				int userStrok1 = scan.nextInt();
				userStrok = userStrok1 - 1;
				System.out.println("Stolbec: ");
				int userStolb1 = scan.nextInt();
				userStolb = userStolb1 - 1;
				field.proverka(userStrok, userStolb);
				if (field.proverka(userStrok, userStolb) == false) {
					System.out.println(" Eto mesto zanyato");
					System.out.println("Stroka: ");
					userStrok1 = scan.nextInt();
					userStrok = userStrok1 - 1;
					System.out.println("Stolbec: ");
					userStolb1 = scan.nextInt();
					userStolb = userStolb1 - 1;
				}
				field.arrayField(userStrok, userStolb, userMarker);
				field.gameOver(userMarker);
				if (userMarker == 'x') {
					userMarker = '0';
				} else {
					userMarker = 'x';
				}

			} while (!field.gameOver);


			if (userMarker == '0') {
				System.out.println("Game over X Win");
			} else {
				System.out.println("Game over 0 Win");
			}
			x++;
		}
	}
}

