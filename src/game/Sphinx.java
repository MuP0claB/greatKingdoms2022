package game;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100, 220);
    }
//  ATTENTION  ->  monsterFightChallenge() doesn't work properly must change the location of this method  !!!

    @Override
    public void monsterFightChallenge() {
        areMissionsCompleted();

        while (GameData.currentHero.healthPoints > 0 && this.getMonsterPoints() > 0) {
            GameData.currentHero.healthPoints -= getMonsterDamage();

            // TODO check if HP < 30 option for run();
        }
    }

    // TODO ->  Да напишем конкретен метод за Сфинкса в сряда !!!
}
