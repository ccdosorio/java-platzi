public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Lite":
                System.out.println("Seleccionaste Lite Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Nigth Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            default:
                System.out.println("Opcion incorecta");
        }
    }
}
