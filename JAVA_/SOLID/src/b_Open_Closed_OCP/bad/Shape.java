package b_Open_Closed_OCP;

/*
We should design our code in a way that
allows us to add new features without
changing the existing code

 The Shape class violates the OCP
 because it requires modification
 whenever a new shape is added.
 */

class Shape_bad {
    private String type;

    public Shape_bad(String type) {
        this.type = type;
    }

    public double calculateArea(double radius, double width, double height) {
        if (type.equals("circle")) {
            // Calculate circle area
            return Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            // Calculate rectangle area
            return width * height;
        }
        return 0.0; // Default return
    }
}

