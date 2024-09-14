package src.banco;

class Conta {
    private Integer saldo = 0;
    private Cliente titular;

    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    public Double consultarSaldo(){
        return saldo.doubleValue() / 100;
    }
    public String consultarTitular(){
        return titular.getNome();
    }

    public void depositar(Double valor){
        Double valorEmCentavos = valor * 100; // convertendo o valor em centavos
        this.saldo += valorEmCentavos.intValue();
    }
    public void sacar(Double valor){
        Double valorEmCentavos = valor * 100;
        Integer valorInteiro = valorEmCentavos.intValue();
        if(valorInteiro <= this.saldo){
            this.saldo -= valorInteiro;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}