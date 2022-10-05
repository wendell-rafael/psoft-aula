package service;
import model.Produto;
import repository.ProdutoRepository;

import java.util.Map;

public class ProdutoService {
    private ProdutoRepository pr;
    public ProdutoService() {
        this.pr =  new ProdutoRepository();
    }

    public Produto criarProduto(String nomeProduto, String fabricante, Double preco) {
        Produto produto = new Produto(nomeProduto,fabricante,preco);
        pr.criarProduto(produto);
        return produto;
    }
    
    public String listarProduto(){
        Map<String, Produto> produtos = pr.listarProdutos();
        String resultado = "";
        for (Produto p:
             produtos.values()) {
            resultado += p.toString() + "\n";
        }
        return resultado.trim();
    }
}
