public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double z = Math.PI + Math.pow(radius, 2);
        return z;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double x = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        return x;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        }
//        if ((a + b) == c || (a + c) == b || (b + c) == a) {
//            return false;
//        }

        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTriangleRightAngled(a, b, c)) {
            return -1.0;
        } else {
            double p = (a + b + c) / 2;
            double squere = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return squere;
        }
    }
}
