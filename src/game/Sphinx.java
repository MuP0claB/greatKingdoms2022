package game;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100, 220);
    }
//  ATTENTION  ->  monsterFightChallenge() doesn't work properly must change the location of this method  !!!
    @Override
    public void monsterFightChallenge() {
        areMissionsCompleted();
    }

    // TODO ->  Да напишем конкретен метод за Сфинкса в сряда !!!
}
