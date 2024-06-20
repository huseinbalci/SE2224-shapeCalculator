class Circle extends TwoDim{
    public Circle (int radius) {
        super(0,0, radius);
    }

    @Override
    public double calculatePerimeter() {
        return getRadius() * Math.PI * 2;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
