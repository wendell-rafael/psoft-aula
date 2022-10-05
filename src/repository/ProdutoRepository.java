package repository;

import model.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
    private Map<String,Produto> mapaDeProdutos;

    public ProdutoRepository() {
        this.mapaDeProdutos = new HashMap<>();
    }

    public void criarProduto(Produto produto) {
        this.mapaDeProdutos.put(produto.getNome(), produto);
    }

    public Map<String, Produto> listarProdutos(){
        return this.mapaDeProdutos;
    }
}
