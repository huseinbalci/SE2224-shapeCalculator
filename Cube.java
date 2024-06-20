class Cube extends ThreeDim{
    public Cube(int edge) {
        super(edge, 0);
    }

    @Override
    public double calculatePerimeter() {
        return getEdge() * 12;
    }

    @Override
    public double calculateArea() {
        return Math.pow(getEdge(), 2) * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getEdge(), 3);
    }
}
