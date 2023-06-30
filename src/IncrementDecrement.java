public class IncrementDecrement {
    public static void main(String[] args) {
        int lives  = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        lives--;
        System.out.println(lives); // 3

        lives++;
        System.out.println(lives); // 4

        // Prefija
        // Gana un regalo por ganar una vida
        //int gift = 100 + lives++; //post fijo
        int gift = 100 + ++lives; //pre fijo
        System.out.println(gift);
        System.out.println(lives); // 5

        int num = 5;

        ++num;

        System.out.println(num);

    }
}
