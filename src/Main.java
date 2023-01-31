public class Main {
    public static void main(String[] args) {

        BodyMassIndexService service = new BodyMassIndexService();
        int weight = 80; // вес в килограммах
        double height = 1.8; //рост в метрах
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println("ваш индекс массы тела - " + bodyMassIndex);

    }
}