import Combustivel.combustivel;

public class Balao {

    int id;
    String registro;
    String cor ;
    String tipo;
    double  altura;
    double peso;
    String porte;
    int capaPessoas;

    public String voar(combustivel gaspropano){
        return "voando com" + gaspropano;
    }
}
