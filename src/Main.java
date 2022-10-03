public class Main {
    public static void main(String[] args){
        Produto p = new Produto("coca cola 2l", "Coca cola",5.50);
        Lote l = new Lote(4,"20/10/22",p);
        System.out.println(p.getPreco()); // preço do produto
        System.out.println(l.getDataV()); // validade do lote
        System.out.println(l.getProduto().getPreco()); // acessando nome do produto atraves do lote
        System.out.println("oi");
    }
}
