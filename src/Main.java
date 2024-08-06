import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("./users.txt");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя пользователя: ");
        fileWriter.write("Имя: " + sc.next());

        System.out.println("Введите возраст пользователя: ");
        fileWriter.write("\nВозраст: " + sc.nextInt());

        fileWriter.close();

        FileReader fileReader = new FileReader("./users.txt");
        Scanner scReadFile = new Scanner(fileReader);

        while(scReadFile.hasNextLine()) {
            System.out.println(scReadFile.nextLine());
        }

        fileReader.close();
    }
}