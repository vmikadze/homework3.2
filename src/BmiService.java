public class BmiService {
    public double calculate(double weightKg, double height) {
        double result;
        result = weightKg / (height * height);
        return result;
    }
}
