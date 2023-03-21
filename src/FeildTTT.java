public class FeildTTT {

	int size = 3;
	char[][] field = new char[size][size];
	boolean gameOver = false;



	void initialField() {
		for (int stroka = 0; stroka < size; stroka++) {
			for (int stolbec = 0; stolbec < size; stolbec++) {
				field[stroka][stolbec] = ' ';
			}

		}
	}

void prinField(){
	System.out.println("   1  2  3");
	for (int i = 0; i < size; i++) {
		System.out.print(i + 1 + " ");
		for (int j = 0; j < size; j++) {
			System.out.print("[ ]");

		}
		System.out.println();
	}
}
	public void arrayField(int userStrok, int userStolb, char use) {

		System.out.println("   1  2  3");
		for (int stroka = 0; stroka < size; stroka++) {
			System.out.print(stroka + 1 + " ");
			for (int stolbec = 0; stolbec < size; stolbec++) {
				if (stroka == userStrok && stolbec == userStolb) {
					field[userStrok][userStolb] = use;
				}
				System.out.print("[" + field[stroka][stolbec] + "]");
			}
			System.out.println();
		}

	}


	boolean proverka(int str, int slb) {
		if (field[str][slb] != ' ') {
			return false;
		}
		if (str < 0 && str > 3) {
			return false;
		}
		if (slb < 0 && slb > 3) {
			return false;
		}
		return true;
	}

	boolean gameOver(char use) {
		if (field[0][0] == use && field[0][1] == use && field[0][2] == use) {
			return gameOver = true;
		} else if (field[1][0] == use && field[1][1] == use && field[1][2] == use) {
			return gameOver = true;
		} else if (field[2][0] == use && field[2][1] == use && field[2][2] == use) {
			return gameOver = true;
		} else if (field[0][0] == use && field[1][0] == use && field[2][0] == use) {
			return gameOver = true;
		} else if (field[0][1] == use && field[1][1] == use && field[2][1] == use) {
			return gameOver = true;
		} else if (field[0][2] == use && field[1][2] == use && field[2][2] == use) {
			return gameOver = true;
		} else if (field[0][0] == use && field[1][1] == use && field[2][2] == use) {
			return gameOver = true;
		} else if (field[2][0] == use && field[1][1] == use && field[0][2] == use) {
			return gameOver = true;
		}

		return false;
	}
}




