
import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class PClassicS2018p1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the string --> ");
        reverse(keyboard.nextLine());
    }
    
    public static void reverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);

        }
        System.out.println(result);
    }
}
