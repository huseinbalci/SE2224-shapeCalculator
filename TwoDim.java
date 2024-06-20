abstract class TwoDim extends Shape{
    private int width;
    private int height;
    private int radius;
    public TwoDim(int width, int height, int radius) {
        super("2D");
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }


}
