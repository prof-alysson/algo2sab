package src.banco;

class BancoTeste{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        Conta conta = new Conta();
        conta.setTitular(cliente);

        conta.depositar(1000.0);
        conta.consultarSaldo();
        conta.sacar(800.0);
        conta.consultarSaldo();
        conta.depositar(100.0);
        conta.sacar(500.0);
        conta.consultarSaldo();
        conta.consultarTitular();
    }
}