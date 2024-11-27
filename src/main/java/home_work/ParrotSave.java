package home_work;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ParrotSave {
    public static void main(String[] args) {

        Parrot parrot = new Parrot("Ара", "розовый", 100, 5);
        System.out.println(parrot);

        File file = new File("parrot.txt");

        try(OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(parrot);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Parrot parrot1 = new Parrot("Гоша", "сиреневый", 55, 99);
        System.out.println(parrot1);

        File file1 = new File("parrot_json.txt");

        try {

            file1.createNewFile();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(file1, parrot1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
