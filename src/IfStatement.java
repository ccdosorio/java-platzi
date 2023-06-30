public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSend = 3;

        if (isBluetoothEnabled) {
            // Send File
            fileSend++;
            System.out.println("Archivo enviado");
        } else {
            fileSend--;
            System.out.println("Por favor enciende tu bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSend);
    }

}
