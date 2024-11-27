package task_02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class CatLoad {
    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("cat.obc");
            ObjectInputStream in = new ObjectInputStream(inputStream)) {

            Object cat = in.readObject();
            System.out.println(cat);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
