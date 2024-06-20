abstract class ThreeDim extends Shape {
    private int edge;
    private int radius;

    public ThreeDim(int edge, int radius) {
        super("3D");
        this.edge = edge;
        this.radius = radius;
    }

    public int getEdge() {
        return edge;
    }

    public int getRadius() {
        return radius;
    }
}
