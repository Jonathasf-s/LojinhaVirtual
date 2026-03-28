package CarrinhoCompras;

import Cliente.ClienteModel;
import Produtos.ProdutosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.Name;

import java.util.List;

@Entity
@Table(name = "TB_Pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarrinhoDeComprasModel {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long CarrinhoComparsId;

        @ManyToOne // relaçao entre a coluna do cliente e pedidos. um cliente pode fazer muitos pedidos
        @JoinColumn(name = "cliente_id")
        private ClienteModel cliente;

        @ManyToMany
        @JoinTable(name = "TB_Pedidos_Produtos", joinColumns = @JoinColumn(name = "Carrinho_id"), inverseJoinColumns = @JoinColumn(name = "Protudo_id"))
        private List<ProdutosModel> produtos;

        private String Pagamento;
}
