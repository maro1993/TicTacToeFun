/*
*AiLogic class: Reactive strategy
*
* description: there are 3 opening in total (not nine as you would expect).
* corner / center / edge (corners and edges are equivalent on all sides of the grid)
* This Ai class implements the perfect counter strategy to each of the three player openings.
* Ai will always play reactive and the player will always start. The outcome should always be a draw
* at minimum
*
*/

import java.util.Random;

public class AiLogic extends GameLogic{

    //GameField[][] field;
    int PlayerMoveCounter = 0;

    public AiLogic(GameField[][] field) {
        this.field = field;
    }

    public void checkGameState(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y<3; y++){
                if(field[x][y].isTicked() && !(field[x][y].isPc())){
                    PlayerMoveCounter++;
                    playerPosition[PlayerMoveCounter-1].setPositionX(field[x][y].getPosition_x());
                    playerPosition[PlayerMoveCounter-1].setPositionY(field[x][y].getPosition_y());
                }
            }
        }
        switch(PlayerMoveCounter) {
            case 1:
                //Methode beim first Tick des Spielers
                reactToFirstMove();
                break;
            case 2:
                //Methode beim second Tick des Spielers
                reactToSecondMove();
                break;
            case 3:
                //Methode beim third Tick des Spielers
                reactToThirdMove();
                break;
            case 4:
                //Methode beim third Tick des Spielers
                reactToFourthMove();
                break;
            case 5:
                //Methode beim third Tick des Spielers
                reactToFifthMove();
                break;
        }
    }

    /*
    * check the Gamefield for corner/edge/center start
    * react accordingly to https://en.wikipedia.org/wiki/Tic-tac-toe
    *         |     |
    *      a  |  b  |  -
    *    _____|_____|_____
    *         |     |
    *      -  |  c  |  -
    *    _____|_____|_____
    *         |     |
    *      -  |  -  |  -
    *         |     |
    *
    * a = corner
    * b = edge
    * c = center
    */
    public GameField[][] reactToFirstMove(){
        for(PositionDetails f : PositionDetails.values()){
            if(f.position_x == playerPosition[0].getPositionX() && f.position_y == playerPosition[0].getPositionY()){
                if(f.toString().contains("corner") || f.toString().contains("edge")) {
                    makeTic(1,1,true,true);
                    return field;
                }
                else if(f.toString().contains("center")){
                    Random number = new Random();
                    int choice = number.nextInt(4);
                    for(PositionDetails g : PositionDetails.values()) {
                        if(g.getIndex() == choice && g.position.toString().contains("corner")) {
                            makeTic(g.getPosition_x(),g.getPosition_y(), true, true);
                            return field;
                        }
                    }
                }
            }
        }
        return field;
    }

    /*
     * check the Gamefield for second player move
     * react accordingly to https://en.wikipedia.org/wiki/Tic-tac-toe
     *         |     |
     *   (0,2) |(1,2)|(2,2)
     *    _____|_____|_____
     *         |     |
     *   (0,1) |(1,1)|(2,1)
     *    _____|_____|_____
     *         |     |
     *   (0,0) |(1,0)|(2,0)
     *         |     |
     *
     * If the human player chooses positions (x + 1 / x - 1 / y + 1 / y - 1 ) from his old position
     * the PC needs to block. Otherwise the game ends with the next move. If the human goes for an other strategy that
     * doesn't need  to be reacted to immediately the PC is following his own strategy which is ideally creating a fork
     * ToDo: Alle diagonalen Positionen durchgehen auch die unsinnigen wie zwei edge Kreuze
     */

    public void reactToSecondMove(){
        for(TwoInARow f : TwoInARow.values()){
            if((f.firstXPosition == playerPosition[0].getPositionX() &&
                 f.firstYPosition == playerPosition[0].getPositionY() &&
                  f.secondXPosition == playerPosition[1].getPositionX() &&
                    f.secondYPosition == playerPosition[1].getPositionY()) ||
                     (f.firstXPosition == playerPosition[1].getPositionX() &&
                       f.firstYPosition == playerPosition[1].getPositionY() &&
                        f.secondXPosition == playerPosition[0].getPositionX() &&
                         f.secondYPosition == playerPosition[0].getPositionY())){
                field = makeTic(f.blockX, f.blockY, true, true);
            }
         }
    }

    public void reactToThirdMove(){


    }

    private void reactToFourthMove() {
        //...
    }

    private void reactToFifthMove() {
        //...
    }



}
