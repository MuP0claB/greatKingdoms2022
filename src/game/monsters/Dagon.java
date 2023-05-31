package game.monsters;

public class Dagon extends Monster {

    public Dagon() {
        super("Dagon", 100, 220);
    }

    public void fightWithDagon() {
        System.out.println("Welcome to the battle with Dagon!");
        System.out.println("Fight !");

        fightWithMonster();
    }
}
