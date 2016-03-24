class Point2D {
    double x, y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point2D plus(Point2D p) {
        new Point2D(this.x + p.x, this.y + p.y);
    }

}

Point2D p = new Point2D(1, 2)
Point2D p2 = new Point2D(3, 4)
Point2D p3 = p + p2 + p
println("$p3.x $p3.y")