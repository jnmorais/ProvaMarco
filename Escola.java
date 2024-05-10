package ProvaMarco;

public class Escola {

    public String Vernota(int nota) {
        if (nota < 0){
            throw new IllegalArgumentException ("Nota inválida");
        }else if (nota < 4){
            return "Reprovado";
        } else if (nota < 6) {
            return "Em recuperação";
        }  else if (nota >= 6) {
            return "Passou de ano";
        }
        return "";
    }
}
