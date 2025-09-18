 class Produto {
   String nome;
   double preco;
   int quantidade;
   
   double valorTotalEstoque() {
     return preco * quantidade;
   }
     
   void adicionarProdutos( int quantidade) {
     this.quantidade += quantidade;
   }
   
   void removerProdutos( int quantidade) {
     this.quantidade -= quantidade;
   }
 }