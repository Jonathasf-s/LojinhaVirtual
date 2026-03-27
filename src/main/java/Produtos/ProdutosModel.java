package Produtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProdutosModel {

   @Id   // o banco de dados vai reconhecer como o ID
   @GeneratedValue(strategy = GenerationType.IDENTITY) // Vai gerar os IDs automaticamente
   private Long ProdutosID;

   @Column(name = "nomeDoProduto") // criaçao da coluna no banco de dados e o nome da coluna
   private String ProdutosNome;

   @Column(name = "ValorDoProduto")
   private double ProdutosValor;
}
