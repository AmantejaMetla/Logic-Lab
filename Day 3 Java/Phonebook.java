import java.util.*;

public class Phonebook {
    static String[] names = new String[100];
    static String[] phones = new String[100];
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            String[] p = line.split(" ");
            if (p[0].equals("ADD")) {
                names[size] = p[1];
                phones[size++] = p[2];
            }
            else if (p[0].equals("DEL")) {
                for (int i = 0; i < size; i++)
                    if (names[i].equals(p[1])) {
                        names[i] = names[size-1];
                        phones[i] = phones[size-1];
                        size--;
                    }
            }
            else if (p[0].equals("FIND")) {
                for (int i = 0; i < size; i++)
                    if (names[i].toLowerCase().contains(p[1].toLowerCase()))
                        System.out.println("Found: " + names[i] + "(" + phones[i] + ")");
            }
            else if (p[0].equals("LIST")) {
                for (int i = 0; i < size; i++)
                    System.out.println(names[i] + "(" + phones[i] + ")");
            }
            else break;
        }
        System.out.println("Goodbye.");
    }
}
