public class Point2d { // двумерный класс точки
    private double xCoord; // координата х
    private double yCoord; // координата у

    public Point2d ( double x, double y) { // конструктор инициализации
        xCoord = x;
        yCoord = y;
    }
    public Point2d () { // конструктор по умолчанию
        this(0, 0); //Вызовите конструктор с двумя параметрами и определите источник.
    }

    public double getX () { // Возвращение координаты X
        return xCoord;
    }
    public double getY () { // Возвращение координаты Y
        return yCoord;
    }
    public void setX ( double val) { // Установка значения координаты X.
        xCoord = val;
    }
    public void setY ( double val) { // Установка значения координаты Y.
        yCoord = val;
    }

}