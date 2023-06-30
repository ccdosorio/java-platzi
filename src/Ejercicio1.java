public class Ejercicio1 {
    public static void main(String[] args) {
        final String MY_NAME = "Christian Osorio";
        final String NAME_MOTHER = "Gloria Chacón";
        final String NAME_MIDDLE_BROTHER = "Jorge Osorio";
        final String NAME_SISTER = "Jenifer Osorio";
        final String NAME_OLDER_BROTHER = "Winstong Osorio";
        final String NAME_NEPHEW = "Rodrigo Emiliano";

        int myAge = 22;
        int ageMother = 56;
        int ageMiddleBrother = 29;
        int ageSister = 31;
        int ageOlderBrother = 30;
        int ageNephew = 3;

        char c = 'z';
        int i = 250;
        double d = 301.067;
        int i2 = 100;
        int i3 = 737;
        double d2 = 298.638;

        System.out.println("****************");
        System.out.println("* EJERCICIO 1: *");
        System.out.println("****************");
        System.out.println("Hola a todos 🚀 ! Mi nombre es " + MY_NAME + " y tengo " + myAge + " años, soy de Guatemala. 🇬🇹");
        System.out.println("Les presento a mi familia: 😀");
        System.out.println("Mi mamá es " + NAME_MOTHER + " y tiene " + ageMother + " años edad.");
        System.out.println("Mi hermano mediano es " + NAME_MIDDLE_BROTHER + " y tiene " + ageMiddleBrother + " años edad.");
        System.out.println("Mi hermana es " + NAME_SISTER + " y tiene " + ageSister + " años edad.");
        System.out.println("Mi hermano mayor es " + NAME_OLDER_BROTHER + " y tiene " + ageOlderBrother + " años edad.");
        System.out.println("Y el más pequeño de la familia 👶🏻: Mi sobrino " + NAME_NEPHEW + " y tiene " + ageNephew + " años de edad.");

        System.out.println("****************");
        System.out.println("* EJERCICIO 2: *");
        System.out.println("****************");

        int c1 = c;
        System.out.println(c1);

        long iL = i;
        short iS = (short) iL;
        System.out.println(iL);
        System.out.println(iS);

        long dL = (long) d;
        System.out.println(dL);

        float iF = (float) (i2 + 500.66);
        System.out.println(iF);

        byte iB = (byte) (i3*100);
        System.out.println(iB);

        long iL2 = (long) (d2 / 25);
        System.out.println(iL2);



    }
}
