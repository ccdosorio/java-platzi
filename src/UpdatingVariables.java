public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // bono $200
        salary += 200;
        System.out.println(salary);

        // pension: $50 descuento
        salary -= 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        // comida: $45
        salary += (30*2) - 45;
        System.out.println(salary);

        // Actualizando cadenas de texto
        String employeeName = "David Osorio";
        employeeName = employeeName + " Chacón";
        System.out.println(employeeName);
        employeeName = "Christian " + employeeName;
        System.out.println("Tú nombre es: " + employeeName);
    }
}
