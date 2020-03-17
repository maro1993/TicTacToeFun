import java.util.ArrayList;
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
public enum PositionDetails {

    corner1(0,0, PositionType.corner, 1, new int[]{1, 2}),

    corner2(2,0, PositionType.corner, 2, new int[]{1, 3}),

    corner3(0,2, PositionType.corner, 3, new int[]{2, 4}),

    corner4(2,2, PositionType.corner, 4, new int[]{4, 3}),

    edge1(1,0, PositionType.edge, 1, null),

    edge2(0,1, PositionType.edge, 2, null),

    edge3(2,1, PositionType.edge,3, null ),

    edge4(1,2, PositionType.edge, 4, null),

    center(1,1, PositionType.center, 1, null);

    int position_x;
    int position_y;
    PositionType position;
    int index;
    int[] neighbour;

    public int getPosition_x() {
        return position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public PositionType getPosition() {
        return position;
    }

    public int getIndex() {
        return index;
    }

    PositionDetails(int position_x, int position_y, PositionType position, int index, int[] neighbour) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.position =  position;
        this.index = index;
        this.neighbour = neighbour;
    }
}
