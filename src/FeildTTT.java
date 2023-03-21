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

    void printField() {
        System.out.println("   1  2  3");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < size; j++) {
                System.out.print("[ ]");

            }
            System.out.println();
        }
    }

    public void arrayField(int userRow, int userColumn, char use) {

        System.out.println("   1  2  3");
        for (int row = 0; row < size; row++) {
            System.out.print(row + 1 + " ");
            for (int column = 0; column < size; column++) {
                if (row == userRow && column == userColumn) {
                    field[userRow][userColumn] = use;
                }
                System.out.print("[" + field[row][column] + "]");
            }
            System.out.println();
        }

    }


    boolean validation(int row, int col) {
        if (field[row][col] != ' ' &&
                row >= 0 && row <= 3 &&
                col >= 0 && col <= 3) {
            return false;
        }
        return true;
    }


    boolean checkWin(char use) {
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




