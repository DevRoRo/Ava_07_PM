import java.util.List;

public class Sanitizar {

    static List<String> filtro;

    static String censurar (String s) {
        return censurar(s, 1);
    }

    static String censurar (String s, int indiceCensura) {

        String resultado = s;

        String censura ="";

        for (int j = 0; j<filtro.size(); j++) {

            for (int i = 0; i < (filtro.get(j).length()); i++) {
                if (i<filtro.get(j).length()-indiceCensura) {
                censura += '*';
                } else {
                    censura += filtro.get(j).charAt(i);
                }
            }

            resultado = resultado.replace(filtro.get(j), censura);
    
            censura = "";
        }

        return resultado;

    }
}
