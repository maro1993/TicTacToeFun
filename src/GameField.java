public class GameField {

    private int position_x;
    private int position_y;
    private boolean isPc;
    private boolean isTicked;

    public GameField(int position_x, int position_y, boolean isPc, boolean isTicked) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.isPc = isPc;
        this.isTicked = isTicked;
    }

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

    public boolean isPc() {
        return isPc;
    }

    public void setPc(boolean pc) {
        isPc = pc;
    }

    public boolean isTicked() {
        return isTicked;
    }

    public void setTicked(boolean ticked) {
        isTicked = ticked;
    }
}
