public class ContaCorrente  extends Conta{
    public ContaCorrente (int agencia, int numero){
        super(agencia,numero);

    }

    @Override
    public boolean saca(double valor) {
        double valoraSacar = valor + 0.2;
        return super.saca(valoraSacar);
    }
}
