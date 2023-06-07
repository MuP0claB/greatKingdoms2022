package game;

public class StoryTelling {
    //TODO Да създадем метод за описание на героите.
    public static void sphinxRiddleStory(int num) {
        switch (num) {
            case 1:
                System.out.println("Which creature has one voice and yet becomes four-footed and two-footed and three-footed?");
                break;
            case 2:
                System.out.println("There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. Who are the two sisters?");
                break;

        }
    }

    public static void mountainHeroInfo() {
        System.out.println("\"In the mountainous world, there existed a hero named Marco, who was blessed with a superpower - hyper ventilation.\"\n" +
                "\"Hyper ventilation helps King Marco to be more enduring and increases his vitality.\"\n" +
                "\"King Marco climbed the High Mountain not by chance, in search of the local monster - the Sasquatch, which had captivated the process.\"\n" +
                "\"While ascending, he saw an old shepherd in the distance. It was not a random encounter.\"\n" +
                "\"The wise shepherd reveals the location of the monster, but first, Marco must pass through 2 trials to gather pieces of the map.\""
        );
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");

    }

    public static void seaHeroInfo() {
        System.out.println("After arriving on the island, Triton The Great gets acquainted with the locals, who tell him about the legend of the terrifying monster inhabiting the island, named DAGON.\n" +
                "They also share the story of the princess of the island, who was abducted by the monster along with the treasure.\n" +
                "The hero decides to help the locals and rescue the princess.\n" +
                "In order to find out the princess's whereabouts, he needs to gather all 3 pieces of the map.\n" +
                "For the first 2 parts, he must complete 2 missions. The last piece of the map is with the monster,\n" +
                "which he must defeat in order to obtain the final part of the map.");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");

    }

    public static void madInfo() {
        System.out.println("After arriving in the desert, the hero Mad Max encounters the local inhabitants who tell him about the legend of the fearsome monster - the Sphinx.\n" +
                "They share the story of the desert princess, who was captured by the Sphinx along with the precious treasure of the desert.\n" +
                "The hero promises to help the local inhabitants and free the princess.\n" +
                "To discover the location of the princess, Mad Max must gather the two parts of the mysterious map.\n" +
                "The hero have been blessed with the ability to turn invisible.\n" +
                "After successfully completing these missions, the location of the monster will be  revealed.");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void princess1() {
        System.out.println("I'm eternally grateful for saving my life, noble hero. My name is Victoria. " +
                "Please help me to return safety to my castle and you will have whatever you require");
        System.out.println("\032[31m< - > < - > < - > < - >\032[0m");
        System.out.println("After they returned to the castle, Victoria's father rewarded Marco with land,gold and title");

    }

    public static void princess2() {
        System.out.println("You have my deepest thanks, great hero. I am the princess of the island - Melissa." +
                "Triton defeated the creature and rescued the princess. " +
                "Their joy was shared by the entire kingdom, and Triton was hailed as a true hero. " +
                "Together, Triton and Melissa brought peace and prosperity to the realm, and their love story became a symbol of hope for all.");

    }

    public static void princess3() {
        System.out.println("Mad Max emerged victorious, rescuing LolaFerrari and bringing light back to the kingdom." +
                " The grateful princess bestowed upon him a crown, and they lived happily ever after, their love story" +
                " becoming a legend that would be told for generations. ");
    }

    public static void printWinStory(){

        switch(GameData.currentHero.location.getPrincessName()){
            case VICTORIA -> princess1();
            case MELISSA -> princess2();
            case LOLA_FERRARI -> princess3();
        }

    }


    public static void printIntroduction(Hero hero) {
        switch (hero) {
            case SEA_HERO -> seaHeroInfo();
            case LA_AREA_HERO -> madInfo();
            case MOUNTAIN_HERO -> mountainHeroInfo();
        }
    }

}

