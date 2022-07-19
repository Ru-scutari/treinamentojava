import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {


        String[] lines = new String[]{"Eu vou", "Agora", "Me preparar para a aula"};

        String path = "C:\\Users\\011448631\\Desktop\\teste1.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
