public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println("Спасибо за покупку билета и приятного полёта!");
        System.out.println(service.calculate(25_491) + " — ваши бонусные мили.");

        System.out.println();
        System.out.println("Спасибо за покупку билета и приятного полёта!");
        System.out.println(service.calculate(481_516_234) + " — ваши бонусные мили.");

        System.out.println();
        System.out.println("Спасибо за покупку билета и приятного полёта!");
        System.out.println(service.calculate(10_000) + " — ваши бонусные мили.");

        System.out.println();
        System.out.println("Спасибо за покупку билета и приятного полёта!");
        System.out.println(service.calculate(24_081_991) + " — ваши бонусные мили.");
    }
}