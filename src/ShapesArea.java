public class ShapesArea {
    public void startTriangle() {
        System.out.println("Háromszög területe");
        String baseStr = Console.input("Alap: ");
        String heightStr = Console.input("Magasság: ");
        if (validateTriangle(baseStr, heightStr)) {
            startTriangleCalc(baseStr, heightStr);
        }
    }

    private void startTriangleCalc(String baseStr, String heightStr) {
        Triangle triangle = new Triangle();
        triangle.base = Double.parseDouble(baseStr);
        triangle.height = Double.parseDouble(heightStr);
        triangle.calcArea();
        String format = "Háromszög területe: %f\n";
        System.out.printf(format, triangle.getArea());
    }

    private boolean validateTriangle(String baseStr, String heightStr) {
        boolean validTriangle = true;
        validTriangle = Validator.isValidInput(baseStr);
        validTriangle = Validator.isValidInput(heightStr);
        return validTriangle;
    }

    public void startCircle() {
        System.out.println("Kör területe");
        String radiusStr = Console.input("Sugár: ");
        if (validateCircle(radiusStr)) {
            startCircleCalc(radiusStr);
        }
    }

    private void startCircleCalc(String radiusStr) {
        Circle circle = new Circle();
        circle.radius = Double.parseDouble(radiusStr);
        circle.calcArea();
        String format = "Kör területe: %f\n";
        System.out.printf(format, circle.getArea());
    }

    private boolean validateCircle(String radiusStr) {
        boolean validCircle = true;
        validCircle = Validator.isValidInput(radiusStr);
        return validCircle;
    }

    public void startRectangle() {
        System.out.println("Téglalap területe");
        String aSideStr = Console.input("A oldal: ");
        String bSideStr = Console.input("B oldal: ");
        if (validateRectangle(aSideStr, bSideStr)) {
            startRectangleCalc(aSideStr, bSideStr);
        }
    }

    private void startRectangleCalc(String aSideStr, String bSideStr) {
        Rectangle rectangle = new Rectangle();
        rectangle.aSide = Double.parseDouble(aSideStr);
        rectangle.bSide = Double.parseDouble(bSideStr);
        rectangle.calcArea();
        String format = "Téglalap területe: %f\n";
        System.out.printf(format, rectangle.getArea());
    }

    private boolean validateRectangle(String aSideStr, String bSideStr) {
        boolean validRectangle = true;
        validRectangle = Validator.isValidInput(aSideStr);
        validRectangle = Validator.isValidInput(bSideStr);
        return validRectangle;
    }

}
