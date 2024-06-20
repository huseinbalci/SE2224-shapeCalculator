class Rectangle extends TwoDim{
    public Rectangle(int width, int height) {
        super(width, height, 0);
    }

    @Override
    public double calculatePerimeter() {
        return (getWidth() + getHeight()) * 2;
    }

    @Override
    public double calculateArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
