//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tank player1 = new Tank(100, 45);//создание первого танка
        Tank player2 = new Tank(100, 45);// второго

        System.out.println("Бой!\n");
         do {
             System.out.print("Игрок 1 ");
             player2.def(player2.getHp(), player1.getDamage()); //оборона первого
             System.out.println("Игрок 1: " + player1.getHp() + ".\tИгрок 2: " + player2.getHp() + ".");
            if (player2.getHp() <= 0)
                System.out.println("Победил первый игрок");
            else {
                System.out.print("Игрок 2 ");
                player1.def(player1.getHp(), player2.getDamage());//оборона второго
                System.out.println("Игрок 1: " + player1.getHp() + ".\tИгрок 2: " + player2.getHp() + ".");
                if (player1.getHp() <= 0)
                    System.out.println("Победил второй игрок");
            }
        }while (player1.getHp() > 0 && player2.getHp() > 0);
    }
}