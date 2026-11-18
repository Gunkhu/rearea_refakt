public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alakzatok területe");
        startCalc();
    }
    private static void startCalc(){
        ShapesArea shapesArea = new ShapesArea();
        shapesArea.startTriangle();
        shapesArea.startCircle();
        shapesArea.startRectangle();
    }
}
