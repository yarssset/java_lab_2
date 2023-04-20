public class Lab1 {
    public static void main(String[] args) {
        Point3d firstpoint = new Point3d();
        Point3d secondpoint = new Point3d(4,5,6);
        Point3d thirdpoint = new Point3d(7,8,9);
        //System.out.println(firstpoint.getX() + " " + firstpoint.getY() + " " + firstpoint.getZ());
        if (firstpoint.comparison(secondpoint) || secondpoint.comparison(thirdpoint) || thirdpoint.comparison(firstpoint))
            {System.out.println("Одна из точек равна другой");}
        else
            {System.out.println("Площадь треугольника: " + computeArea(firstpoint,secondpoint,thirdpoint));}
    }
    // статический метод вычисляет площадь треугольника по площади Герона
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double AB = a.distanceTo(b);
        double BC = b.distanceTo(c);
        double CA = c.distanceTo(a);
        double p = (AB + BC + CA) / 2;
        // sqrt ( p(p-a)(p-b)(p-c) )
        return Math.sqrt( p*(p-AB)*(p-BC)*(p-CA) );
    }
}
