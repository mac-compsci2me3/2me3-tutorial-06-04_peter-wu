public class Drawing {
    
    private static Drawing instance;

    
    private Drawing() {}

    public static Drawing getInstance() {
        if (instance == null) {
            instance = new Drawing();
        }
        return instance;
    }


    public void drawShape(Shape shape) {
        String shapeType = shape.getClass().getSimpleName();  
      

        // Print the details of the shape
        System.out.println("Drawing a " + shapeType + " with color: " + shape.getColor() + " and area: " + shape.calculateArea());
}

}