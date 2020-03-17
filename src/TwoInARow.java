/*
 *         |     |
 *   (0,2) |(1,2)|(2,2)
 *    _____|_____|_____
 *         |     |
 *   (0,1) |(1,1)|(2,1)
 *    _____|_____|_____
 *         |     |
 *   (0,0) |(1,0)|(2,0)
 *         |     |
 */
public enum TwoInARow {

    bottomLeftCenter(0,0,1,1, 2,2),
    topRightCenter(2,2,1,1, 0,0),
    bottomLeftTopRight(0,0,2,2, 1,1),

    topLeftCenter(0,2,1,1, 2,0),
    topLeftBottomRight(0,2,2,0,1,1),
    BottomRightCenter(2,0,1,1,0,2),

    BottomLeftTopLeft(0,0, 0, 2,0,1),
    BottomLeftEdgeLeft(0,0,0,1,0,2),
    TopLeftEdgeLeft(0,2,0,1,0,0),

    TopEdgeCenter(1,2,1,1,1,0),
    BottomEdgeCenter(1,0,1,1,1,2),
    TopEdgeBottomEdge(1,2,1,0,1,1),

    TopRightRightEdge(2,2,2,1,2,0),
    TopRightBottomRight(2,2,2,0,2,0),
    BottomRightRightEdge(2,0,2,1,2,2),

    TopLeftTopRight(0,2,2,2,1,2),
    TopLeftTopEdge(0,2,1,2,2,2),
    TopRightTopEdge(2,2,1,2,0,2),

    LeftEdgeCenter(0,1,1,1,2,1),
    RightEdgeCenter(2,1,1,1,0,1),
    LeftEdgeRightEdge(0,1,2,1,1,1),

    BottomLeftBottomEdge(0,0,1,0,2,0),
    BottomLeftBottomRight(0,0,2,0,1,0),
    BottomRightBottomEdge(2,0,1,0,0,0);

    int firstXPosition;
    int firstYPosition;
    int secondXPosition;
    int secondYPosition;
    int blockX;
    int blockY;

    public int getBlockX() {
        return blockX;
    }

    public void setBlockX(int blockX) {
        this.blockX = blockX;
    }

    public int getBlockY() {
        return blockY;
    }

    public void setBlockY(int blockY) {
        this.blockY = blockY;
    }

    public int getFirstYPosition() {
        return firstYPosition;
    }

    public void setFirstYPosition(int firstYPosition) {
        this.firstYPosition = firstYPosition;
    }

    public int getSecondXPosition() {
        return secondXPosition;
    }

    public void setSecondXPosition(int secondXPosition) {
        this.secondXPosition = secondXPosition;
    }

    public int getSecondYPosition() {
        return secondYPosition;
    }

    public void setSecondYPosition(int secondYPosition) {
        this.secondYPosition = secondYPosition;
    }

    public int getFirstXPosition() {
        return firstXPosition;
    }

    public void setFirstXPosition(int firstXPosition) {
        this.firstXPosition = firstXPosition;
    }

    TwoInARow(int firstXPosition, int firstYPosition, int secondXPosition, int secondYPosition, int blockX, int blockY) {
        this.firstXPosition = firstXPosition;
        this.firstYPosition = firstYPosition;
        this.secondXPosition = secondXPosition;
        this.secondYPosition = secondYPosition;
        this.blockX = blockX;
        this.blockY = blockY;
    }
}