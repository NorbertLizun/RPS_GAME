public class Terminal {


    public void greeting(HumanPlayer humanPlayer) {
        System.out.println("WELCOME IN RPS GAME!");
        System.out.println("What is you name?");
        String name = humanPlayer.name();
        System.out.println("Hello " + name + " Let's play!");

    }

    public void yourEnemy(Computer computer) {
        System.out.println("Your opponent " + computer.name());
        System.out.println("Prepare to Battle!");
    }

    public void chooseGun() {
        System.out.println("Choose your weapon:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");

    }










}
