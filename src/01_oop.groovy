/**
 * Объектно-ориентированное программирование
 */

import static org.testng.Assert.assertEquals

/**
 * Точка на плоскости
 */
class Point {
    double x, y;

    Point(x, y) {
        this.x = x
        this.y = y
    }

    @Override
    String toString() {
        return "(" + x + "; " + y + ")"
    }

    // Перегрузка оператора '+'
    Point plus(Point p) {
        return new Point(x + p.x, y + p.y)
    }

    // Перегрузка оператора '-'
    Point minus(Point p) {
        return new Point(x - p.x, y - p.y)
    }

    /**
     * Равенство объектов
     * @param o Объект для сравнения
     * @return объекты равны?
     */
    @Override
    boolean equals(Object o) {
        Point p = (Point) o
        if (p == null)
            return false
        return x.equals(p.x) && y.equals(p.y)
    }
}

Point a = new Point(1, 2)
println "a.x = $a.x"
println "a.y = $a.y"

Point b = new Point(2.1, 3)
Point sum = a + b
println "$a + $b = $sum"
// (1.0; 2.0) + (2.1; 3.0) = (3.1; 5.0)

assertEquals(a.x + b.x, sum.x)
assertEquals(a.y + b.y, sum.y)

Point sub = a - b
println "$a - $b = $sub"
// (1.0; 2.0) - (2.1; 3.0) = (-1.1; -1.0)
assertEquals(a.x - b.x, sub.x)
assertEquals(a.y - b.y, sub.y)

assertEquals(new Point(a.x - b.x, a.y - b.y), a - b)
