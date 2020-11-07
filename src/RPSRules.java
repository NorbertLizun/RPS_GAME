public class RPSRules {
    private final int[][] rules =  {
            {1,3,2},
            {2,1,3},
            {3,2,1}
    };
    private int whoWin;

    public int getWinner() {
        return this.whoWin;
    }


    public int whoWin(HumanPlayer humanPlayer, Computer computer) {
        int x = rules[humanPlayer.choice() -1][computer.choice() -1];
        if (x == 3) {
            computer.addPoint();
            return whoWin = 2;
        } else if (x == 1) {
            return whoWin = 1;
        } else {
            humanPlayer.addPoint();
            return whoWin = 3;
        }
    }

}
