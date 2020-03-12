public enum PositionDetails {

    corner1(0,0, PositionType.corner, 1),

    corner2(2,0, PositionType.corner, 2),

    corner3(0,2, PositionType.corner, 3),

    corner4(2,2, PositionType.corner, 4),

    edge1(1,0, PositionType.edge, 1),

    edge2(0,1, PositionType.edge, 2),

    edge3(2,1, PositionType.edge,3 ),

    edge4(1,2, PositionType.edge, 4),

    center(1,1, PositionType.center, 1);

    int position_x;
    int position_y;
    PositionType position;
    int index;

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

    PositionDetails(int position_x, int position_y, PositionType position, int index) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.position =  position;
        this.index = index;
    }
}
