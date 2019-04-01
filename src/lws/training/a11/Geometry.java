package lws.training.a11;

public class Geometry {

    public static void calculeteCuboid(double x, double y, double z) {
        double v = x * y * z;
        double a = 2 * x * y + 2 * x * z + 2 * y * z;
        double d = Math.sqrt((x*x) + (y*y) + (z*z));
        double kl = 4 * x + 4 * y + 4 * z;
        System.out.println("");
        System.out.println("Volumen des Quaders: " + v);
        System.out.println("Oberfläche des Quaders: " + a);
        System.out.println("Raumdiagonale des Quaders: " + d);
        System.out.println("Gesamtkantenlänge des Quaders: " + kl);
        System.out.println("");
    }

    public static void calculeteCylinder(double r, double h) {
        double v = Math.PI * (r * r) * h;
        double a = 2 * Math.PI * r * (r + h);
        System.out.println("");
        System.out.println("Volumen eines Zylinders: " + v);
        System.out.println("Oberfläche eines Zylinders: " + a);
        System.out.println("");
    }

    public static void calculeteBall(double r) {
        double u = Math.PI * 2 * r;
        double a = Math.PI * 4 * (r*2);
        double v = (4/3*Math.PI) * (r*r*r);
        System.out.println("");
        System.out.println("Umfang der Kugel: " + u);
        System.out.println("Fläche der Kugel: " + a);
        System.out.println("Volumen der Kugel: " + v);
        System.out.println("");
    }

}
