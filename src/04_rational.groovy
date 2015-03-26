/**
 * Задача "Рациональная дробь"
 */
class Rational {
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
        new Rational(p * b.q + b.p * q, q * b.q)
    }
    // a - b
    Rational minus(Rational b) {
        // TODO: реализовать

    }
    // a * b
    Rational multiply(Rational b) {
        // TODO: реализовать

    }
    // a / b
    Rational div(Rational b) {
        // TODO: реализовать

    }
    // a ** b
    Rational power(Rational b) {
        // TODO: реализовать

    }

    @Override
    String toString() {
        p + "/" + q
    }
}

Rational a = new Rational(1, 2), b = new Rational(1, 3)
println "" + a + " + " + b + " = " + (a + b)