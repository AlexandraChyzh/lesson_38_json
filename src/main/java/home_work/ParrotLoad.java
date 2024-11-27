package home_work;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ParrotLoad {
    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("parrot.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            Object parrot = objectInputStream.readObject();
            System.out.println(parrot);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File file = new File("parrot_json.txt");
        ObjectMapper mapper = new ObjectMapper();

        try {

            Parrot parrot = mapper.readValue(file, Parrot.class);
            System.out.println(parrot);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
