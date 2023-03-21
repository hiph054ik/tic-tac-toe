import java.util.Scanner;

public class GameTTT {
    Scanner scan = new Scanner(System.in);
    char userMarker;
    int userRow;
    int userColumn;


    void turn() {
        FeildTTT field = new FeildTTT();
        System.out.println("Добро пожаловать в игру крестики нолики,\n" +
                "приятной игры!");

        field.printField();

        while (!field.gameOver) {
            field.initialField();
            System.out.println("Первый игрок выбирете Х или 0");
            userMarker = scan.next().charAt(0);
            if (userMarker != 'x' && userMarker != '0') {
                System.out.println("Вы выбрали не тот символ,\nзначит будете играть за Х!");
                userMarker = 'x';
                System.out.println(userMarker + " ваш ход");
            }
            do {
                userRow = setRow();
                userColumn = setCol();
                while (!field.validation(userRow, userColumn)) {
                    System.out.println("Это место занято");
                    userRow = setRow();
                    userColumn = setCol();
                }
                field.arrayField(userRow, userColumn, userMarker);
                field.checkWin(userMarker);
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
        }
    }

    public int setRow() {
        System.out.println("Выбирете номер строки: ");
        return scan.nextInt() - 1;
    }

    public int setCol() {
        System.out.println("Выбирете номер столбца: ");
        return scan.nextInt() - 1;
    }
}

