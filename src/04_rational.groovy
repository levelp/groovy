/**
 * Задача "Рациональная дробь"
 */
class Rational implements Comparable {
    long p, q

    long GCD(long a, long b) {
        b == 0L ? a : GCD(b, a % b)
    }

    Rational(p, q) {
        long d = GCD(p, q)
        this.p = p / d
        this.q = q / d
    }

    // a + b
    Rational plus(Rational b) {
        // TODO: реализовать
        new Rational(p * b.q + b.p * q, q * b.q)
    }
    // a - b
    Rational minus(Rational b) {
        // TODO: реализовать
        new Rational(p * b.q - b.p * q, q * b.q)
    }
    // a * b
    Rational multiply(Rational b) {
        // TODO: реализовать
        new Rational(p * b.p, q * b.q)
    }
    // a / b
    Rational div(Rational b) {
        // TODO: реализовать
        new Rational(p * b.q, q * b.p)
    }
    // a ** b
    Rational power(long b) {
        // TODO: реализовать
        new Rational(p**b, q**b)
    }

    // a == b   a.equals(b)
    // a != b  !a.equals(b)
    @Override
    boolean equals(Object o) {
        Rational r = (Rational) o;
        if (r == null) return false
        // p / q = r.p / r.q
        p * r.q == r.p * q
    }

    // a <=> b  a.compareTo(b)
    // a > b    a.compareTo(b) > 0
    // a >= b   a.compareTo(b) >= 0
    // a < b    a.compareTo(b) < 0
    // a <= b   a.compareTo(b) <= 0
    // Нужно: implements Comparable
    @Override
    int compareTo(r) {
        // Другой вариант: p * r.q - r.p * q
        p * r.q <=> r.p * q
    }

    @Override
    String toString() {
        p + "/" + q
    }
}

Rational a = new Rational(1, 2), b = new Rational(1, 3)
println "" + a + " + " + b + " = " + (a + b)

assert new Rational(1, 2) < new Rational(2, 2)
assert new Rational(1, 2) <= new Rational(2, 2)
assert new Rational(3, 2) > new Rational(1, 1)
assert new Rational(3, 2) >= new Rational(1, 1)
assert new Rational(1, 2) == new Rational(2, 4)
assert (new Rational(1, 2) <=> new Rational(2, 4)) == 0
