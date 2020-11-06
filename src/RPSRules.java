public class RPSRules {
    private final int[][] rules =  {
            {1,3,2},
            {2,1,3},
            {3,2,1}
    };





    public void whoWin(HumanPlayer humanPlayer, Computer computer) {
        int x = rules[humanPlayer.choice() -1][computer.choice()- 1];
        if (x == 3) {
            System.out.println("PLAYER WYGRAŁ");
            humanPlayer.addPoint();
        } else if (x == 1) {
            System.out.println("remis");
        } else {
            System.out.println("PC WIN");
            computer.addPoint();
        }
    }

}
