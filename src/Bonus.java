public class Bonus {
    public static void main(String[] args) {
        int wallet = 100;
        int excuseMe = 1100;

        int bonus;
        if (excuseMe < 1000) {
            bonus = 0;
        } else {
            bonus = excuseMe / 100;
        }
        int great = wallet + excuseMe + bonus;
        System.out.println(great);
    }
}
