
import controller.LojaController;
import model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LojaController lc = new LojaController();
        Produto produtoA = cadastrarProduto("cola-cola 2l", "coca-cola campina grande", 7.0, lc);
        Produto produtob = cadastrarProduto("cola-cola 1,5l", "coca-cola arapiraca", 5.0, lc);
        listaProdutos(lc);
        cadastrarLote(produtoA, 4,"20/10/2022",lc);
        cadastrarLote(produtob, 9,"22/11/2022",lc);
        listarLotes(lc);
    }

    private static void listarLotes(LojaController lc) {
        System.out.println(lc.listarLotes());
    }

    private static void listaProdutos(LojaController lc) {
        System.out.println(lc.listarProdutos());
    }

    private static void cadastrarLote(Produto produto, int quantidade, String dataValidade, LojaController lc) {
        lc.criarLote(produto,quantidade,dataValidade);
    }

    private static Produto cadastrarProduto(String nome, String fabricante, Double preco, LojaController lc) {
        return lc.criarProduto(nome,fabricante,preco);
    }
}