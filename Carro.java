public class Carro extends Veiculo{
    private String numPortas;

    public Carro (String ano, String marca,  String modelo, String numPortas){
        super(ano, modelo, marca);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Portas: " + numPortas);
    }

}

