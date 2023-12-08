public class VolumeCalculator{

    //cube
    public double calVolume(double side){
        return side*side*side;
    }

    //cuboid
    public double calVolume(double length, double width, double height) {
        return length * width * height;
    }

    //cylinder
    public double calVolume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    //sphere
    public double calVolume(double radius) {
        return (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
    }

    //cone
    public double calVolume(double radius, double height, String shape) {
        if (shape.equalsIgnoreCase("cone")) {
            return (1.0 / 3.0) * 3.14 * radius * radius * height;
        } else {
            System.out.println("Unknown shape.");
            return 0.0;
        }
    }
}
    

public static void main(String[] args) {
        VolumeCalculator cal = new VolumeCalculator();

        double cubeVolume = cal.calVolume(5);
        System.out.println(cubeVolume);

        double cuboidVolume = cal.calVolume(3, 4, 5);
        System.out.println(cuboidVolume);

        double cylinderVolume = cal.calVolume(2, 4);
        System.out.println(cylinderVolume);

        double sphereVolume = cal.calVolume(3);
        System.out.println(sphereVolume);

        double coneVolume = cal.calVolume(2, 5, "cone");
        System.out.println(coneVolume);
}