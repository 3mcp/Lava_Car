public abstract class Veiculo {
    private String ano;
    private String modelo;
    private String marca;

    public Veiculo (String ano, String modelo, String marca){
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void exibirInfo(){
        System.out.println("Ano: " + ano + "\nmarca: " + marca + "\nmodelo:" + modelo);
    }



}
