public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 74;
        double height = 1.9;
        double index = service.calculate(weightKg, height);
        int indexInt = (int) index;
        System.out.println(indexInt);
    }
}
