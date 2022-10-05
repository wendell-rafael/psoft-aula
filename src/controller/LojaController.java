package controller;

import model.Produto;
import service.LoteService;
import service.ProdutoService;

public class LojaController {
    private ProdutoService ps ;
    private LoteService ls;
    public LojaController() {
        this.ps = new ProdutoService();
        this.ls = new LoteService();
    }

    public Produto criarProduto(String nomeProduto, String fabricante, Double preco){
        return ps.criarProduto(nomeProduto,fabricante,preco);
    }

    public String listarProdutos(){
        return ps.listarProduto();
    }

    public void criarLote(Produto produto, int quantidade, String dataValidade){
        ls.criarLote(produto,quantidade,dataValidade);
    }

    public String listarLotes(){
        return ls.listarLote();
    }

}
