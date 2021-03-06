public class ContaCorrente  extends Conta implements Tributavel{
    public ContaCorrente (int agencia, int numero){
        super(agencia,numero);

    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }

    @Override
    public boolean saca(double valor) {
        double valoraSacar = valor + 0.2;
        return super.saca(valoraSacar);
    }

    @Override
    public double getValorImposto() {
        return 42;
    }
}
