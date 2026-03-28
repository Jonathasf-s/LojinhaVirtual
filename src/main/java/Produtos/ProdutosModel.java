package Produtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_Produtos")

public class ProdutosModel {

   @Id   // o banco de dados vai reconhecer como o ID
   @GeneratedValue(strategy = GenerationType.IDENTITY) // Vai gerar os IDs automaticamente
   private Long ProdutosId;

   @Column(name = "nomeDoProduto") // criaçao da coluna no banco de dados e o nome da coluna
   private String ProdutosNome;

   @Column(name = "ValorDoProduto")
   private double ProdutosValor;
}
