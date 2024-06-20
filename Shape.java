abstract class Shape {
    private String dimension;
    public Shape(String dimension) {
        this.dimension = dimension;

    }
    public abstract double calculatePerimeter();

    public abstract double calculateArea();
    public abstract double calculateVolume();
}
