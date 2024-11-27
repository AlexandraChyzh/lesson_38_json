package task_01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class CatLoad {
    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("cat.txt");
            DataInputStream in = new DataInputStream(inputStream)) {

            String catString = in.readUTF();
            System.out.println(catString);

            String[] parts = catString.split(";");
            System.out.println(Arrays.toString(parts));

            int age = Integer.parseInt(parts[0]);
            String color = parts[1];
            double weight = Double.parseDouble(parts[2]);

            Cat cat = new Cat(age, color, weight);
            System.out.println(cat);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
