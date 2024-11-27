package task_01;

import java.io.*;

public class CatSave {
    public static void main(String[] args) {

        Cat cat = new Cat(3, "Black",4.56);
        System.out.println(cat);

        String catString = String.format("%d;%s;%.3f", cat.getAge(),
                cat.getColor(), cat.getWeight());

        System.out.println(catString);

        File file = new File("cat.txt");
        try(OutputStream out = new FileOutputStream(file);
            DataOutputStream dataOut = new DataOutputStream(out)) {

            dataOut.writeUTF(catString);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
