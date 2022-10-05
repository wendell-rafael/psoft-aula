package repository;

import model.Lote;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
    private Map<Integer,Lote> mapaDeLotes;
    public LoteRepository() {
        mapaDeLotes = new HashMap<>();
    }

    public void criarLote(Lote lote) {
        mapaDeLotes.put(lote.hashCode(),lote);
    }

    public Map<Integer, Lote> listarLotes(){
        return mapaDeLotes;
    }
}
