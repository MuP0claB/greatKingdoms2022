package game.monsters;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100, 220);
    }

    public int getMonsterPoints() {
        return super.getMonsterPoints();
    }

    public void fightWithSphinx () {
        System.out.println("Welcome to the battle with Sphinx!");
        System.out.println("Fight !");

        super.fightWithMonster();
    }
}
