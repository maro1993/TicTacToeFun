public class GameLogic {

    protected GameField[][] field;
    PlayerPosition[] playerPosition = new PlayerPosition[5];
    PlayerPosition[] pcPosition = new PlayerPosition[5];

    public GameLogic() {
        this.field = new GameField[3][3];
    }

    public void initField(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++) {
                field[x][y].setPc(false);
                field[x][y].setPosition_x(x);
                field[x][y].setPosition_y(y);
                field[x][y].setTicked(false);
            }
        }
    }

    public GameField[][] makeTic(int position_x, int position_y, boolean isTicked, boolean isPc){
        if(!(position_y > 2 || position_x > 2)) {
            field[position_x][position_y].setTicked(isTicked);
            field[position_x][position_y].setPc(isPc);
        }
        else
            System.out.println("illegal x or y position");
        return field;
    }



}
