package src.banco;



class BancoTeste{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        Conta conta = new Conta();
        conta.setTitular(cliente);

        conta.depositar(1000.0);
        System.out.println("Saldo de R$ "+ conta.consultarSaldo().toString());
        conta.sacar(800.0);
        System.out.println("Saldo de R$ "+ conta.consultarSaldo().toString());
        conta.depositar(100.0);
        conta.sacar(500.0);
        System.out.println("Saldo de R$ "+ conta.consultarSaldo().toString());
        System.out.println("Dona(o) da Conta é "+ conta.consultarTitular());

        conta.sacar(138.32);
        System.out.println("Saldo de R$ "+ conta.consultarSaldo().toString());
        conta.parcelarCompra(100.00, 3);

        conta.parcelarCompra(232.43, 4);

        ;
    }
}