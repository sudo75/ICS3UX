import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("./students.txt"));

        int total = 0;
        int students = 0;

        while (reader.hasNextLine()) {
            String name = reader.nextLine();
            int grade = Integer.parseInt(reader.nextLine());

            total += grade;
            students++;

            System.out.println(name);
            System.out.println(grade);
        }

        int avg = (int) Math.round((double) total / (double) students);

        System.out.println("Average: " + avg + "%");
    }
}
