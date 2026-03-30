package catolica.lojinhavirtual.Pagamento;

public class PagamentoService {


    private static final PagamentoService instancia = new PagamentoService();


    private PagamentoService() {
        System.out.println("Sistema de Pagamento Singleton Inicializado.");
    }


    public static PagamentoService getInstancia() {
        return instancia;
    }


    public boolean processar(double valor, String metodo) {
        System.out.println("Processando R$ " + valor + " via " + metodo);
        return true;
    }
}
