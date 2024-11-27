package task_02;

import java.io.*;

public class CatSave {
    public static void main(String[] args) {

        Cat cat = new Cat(7, "Gray", 6.23);
        System.out.println(cat);
        File file = new File("cat.obc");

        try(OutputStream outputStream = new FileOutputStream(file);
                ObjectOutputStream out = new ObjectOutputStream(outputStream)) {

            out.writeObject(cat);

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
