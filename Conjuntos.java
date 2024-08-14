import java.util.Set;
import java.util.HashSet;

public class Conjuntos {

    static Set<Integer> uniao (Set<Integer> conjunto1, Set<Integer> conjunto2) {

        Set<Integer> resultado = new HashSet<>();

        for(int i : conjunto1) {
            resultado.add(i);
        }

        for(int i : conjunto2) {
            resultado.add(i);
        }
        
        return resultado;
    }

    static Set<Integer> interseccao (Set<Integer> conjunto1, Set<Integer> conjunto2) {

        Set<Integer> resultado = new HashSet<>();

        for(int i : conjunto1) {
            for(int j : conjunto2) {
                if(i == j) resultado.add(i);
            }
        }

        return resultado;
    }

    static Set<Integer> diferenca (Set<Integer> conjunto1, Set<Integer> conjunto2) {

        Set<Integer> resultado = new HashSet<>();

        for(int i : conjunto1) {
            resultado.add(i);
        }

        for(int i : conjunto2) {
            resultado.remove(i);
        }


        return resultado;
    }
}