import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTCP {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Socket cliente = new Socket("10.0.0.2", 12000);
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        saida.print(input.nextLine());
        saida.close();
        cliente.close();
        input.close();
    }

}
