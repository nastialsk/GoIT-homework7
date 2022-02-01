abstract class Shape {
    private final String figureName;
    protected int x, y, z;

    protected Shape(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }

    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}

interface Scalable {
    void zoomIn(int a, int b, int c);

    void zoomOut(int a, int b, int c);
}
class Circle extends Shape implements Scalable {
    private static final String figureName = "Circle";

    public Circle() {
        super(figureName);
    }

    @Override
    public String getFigureName() {
        System.out.println("Name of the shape is " + figureName);
        return figureName;
    }

    @Override
    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    @Override
    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}

class Rectangle extends Shape implements Scalable {
    private static final String figureName = "Rectangle";

    public Rectangle() {
        super(figureName);
    }

    @Override
    public String getFigureName() {
        System.out.println("Name of the shape is " + figureName);
        return figureName;
    }

    @Override
    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    @Override
    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}

class RightTriangle extends Shape implements Scalable {
    private static final String figureName = "Right Triangle";

    public RightTriangle() {
        super(figureName);
    }

    @Override
    public String getFigureName() {
        System.out.println("Name of the shape is " + figureName);
        return figureName;
    }

    @Override
    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    @Override
    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}

class Heptagon extends Shape implements Scalable {
    private static final String figureName = "Heptagon";

    public Heptagon() {
        super(figureName);
    }

    @Override
    public String getFigureName() {
        System.out.println("Name of the shape is " + figureName);
        return figureName;
    }

    @Override
    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    @Override
    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}

class Quad extends Shape implements Scalable {
    private static final String figureName = "Quad";

    public Quad() {
        super(figureName);
    }

    @Override
    public String getFigureName() {
        System.out.println("Name of the shape is " + figureName);
        return figureName;
    }

    @Override
    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    @Override
    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}

class FinalOutput {
    public static void main(String[] args) {
        Shape figure1 = new Quad();
        Shape figure2 = new Heptagon();
        Shape figure3 = new Circle();
        Shape figure4 = new RightTriangle();
        Shape figure5 = new Rectangle();
        
        System.out.println(figure1.getFigureName());
        System.out.println(figure2.getFigureName());
        System.out.println(figure3.getFigureName());
        System.out.println(figure4.getFigureName());
        System.out.println(figure5.getFigureName());
        
    }
}
