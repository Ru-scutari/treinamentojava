import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

        List <String> exemplo = new ArrayList<>();

        exemplo.add("Maria");
        exemplo.add("João");
        exemplo.add("Alex");
        exemplo.add("Ana");

        exemplo.add(2, "Raquel");

        System.out.println(exemplo.size());

        exemplo.removeIf(nome -> nome.charAt(0) == 'J');

        for (String nome: exemplo){
            System.out.println(nome);
        }

        System.out.println("Index Of: " + exemplo.indexOf("Ana"));
        System.out.println("Index Of: " + exemplo.indexOf("Marco"));

        List<String> resultado = exemplo.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());

        for (String nome: resultado){
            System.out.println(nome);
        }

        List<String> resultado2 = Collections.singletonList(exemplo.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null));

        for (String nome: resultado2){
            System.out.println(nome);
        }

    }
}
