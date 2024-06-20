class Sphere extends ThreeDim{
    public Sphere(int radius) {
        super(0, radius);
    }

    @Override
    public double calculatePerimeter() {
        return getRadius() * Math.PI * 2;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return (4/3) * Math.PI * Math.pow(getRadius(), 3);
    }
}
