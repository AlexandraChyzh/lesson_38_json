package task_03;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class CatSave {
    public static void main(String[] args) {

        Cat cat = new Cat(5, "Weight", 8.28);
        System.out.println(cat);

        File file = new File("cat_json.txt");

        try {
            file.createNewFile();
            ObjectMapper mapper = new ObjectMapper();
//            mapper.writeValue(file, cat);
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(file, cat);


        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
