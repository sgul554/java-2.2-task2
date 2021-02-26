public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.65, 82.5);
        System.out.println(bmi);
    }
}
