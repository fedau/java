public class Runner {
    public static void main(String[] args) {
        Drink drink1 = new Coffee();
        Drink drink2 = new Tea();

        drink1.prepare();
        drink2.prepare();
    }
}
