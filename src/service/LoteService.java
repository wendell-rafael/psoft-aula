package service;

import model.Lote;
import model.Produto;
import repository.LoteRepository;

import java.util.Map;

public class LoteService {
    private LoteRepository lr;
    public LoteService() {
        lr = new LoteRepository();
    }

    public void criarLote(Produto produto, int quantidade, String dataValidade){
        Lote lote = new Lote(produto,quantidade,dataValidade);
        lr.criarLote(lote);
    }

    public String listarLote(){
        Map<Integer, Lote> lotes = lr.listarLotes();
        String resultado = "";
        for (Lote l:
                lotes.values()) {
            resultado += l.toString() + "\n";
        }
        return resultado.trim();
    }
}
