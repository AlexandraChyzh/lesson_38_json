package task_03;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CatLoad {
    public static void main(String[] args) {

        File file = new File("cat_json.txt");

        ObjectMapper mapper = new ObjectMapper();

        try {
            Cat cat = mapper.readValue(file, Cat.class);
            System.out.println(cat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
