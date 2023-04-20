public class Point3d extends Point2d { // трехмерный класс точки, наследует двумерный
    private double zCoord; // координата z

    public Point3d(double x, double y, double z) { // конструктор инициализации
        super(x, y); // инициализируются с помощью суперкласса (родителя)
        zCoord = z;
    }
    public Point3d() { // конструктор по умолчанию
        this(1, 2, 3);
    } // по умолчанию

    public double getZ() { // получение координаты Z
        return zCoord;
    }
    public void setZ(double val) { // установление значения координаты Z.
        zCoord = val;
    }

    //метод для сравнения значений двух объектов
    public boolean comparison(Point3d pon) {
        return (this.getX() == pon.getX() && this.getY() == pon.getY() && zCoord == pon.getZ());
    }

    // метод вычисляет расстояние между двумя точками по формуле d = sqrt ( (xb-xa)^2 +(yb-ya)^2 +(zb-za)^2 )
    public double distanceTo(Point3d pon){
        return Math.sqrt( Math.pow((this.getX() - pon.getX()),2) + Math.pow((this.getY() - pon.getY()),2) + Math.pow((this.getZ() - pon.getZ()),2) );
    }
}
