public class Triangle {
    Point p1;
    Point p2;
    Point p3;

    Triangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setPoint(int pointNumber, Point newPoint)
    {
        //Yandere Dev time lmao
        if (pointNumber == 1)
        {
            this.p1 = newPoint;
        }
        else if (pointNumber == 2)
        {
            this.p2 = newPoint;
        }
        else if (pointNumber == 3)
        {
            this.p3 = newPoint;
        }
        else
        {
            System.out.println("That point doesn't exist though");
        }
    }

    public Point getPoint(int pointNumber)
    {
        //Yandere Dev time lmao
        if (pointNumber == 1)
        {
            return this.p1;
        }
        else if (pointNumber == 2)
        {
            return this.p2;
        }
        else if (pointNumber == 3)
        {
            return this.p3;
        }
        else
        {
            return null;
        } 
    }

    private double getDistance(Point point1, Point point2)
    {
        double ySqr = Math.pow(point2.getY() - point1.getY(), 2);
        double xSqr = Math.pow(point2.getX() - point1.getX(), 2);

        return Math.sqrt(ySqr + xSqr);
    }

    private Point getMidpoint(Point point1, Point point2)
    {
        return new Point((point1.getX() + point2.getX())/2, (point1.getY() + point2.getY())/2);
    }

    public double getPerimeter()
    {
        double d1 = getDistance(this.p1, this.p2);
        double d2 = getDistance(this.p2, this.p3);
        double d3 = getDistance(this.p3, this.p1);
        
        return d1+d2+d3;
    }

    public double getArea()
    {
        Point thingy = getMidpoint(this.p2, this.p3);
        
        double base = getDistance(this.p2, this.p3);
        double height = getDistance(this.p1, thingy);

        return (base * height)/2;
    }
}
