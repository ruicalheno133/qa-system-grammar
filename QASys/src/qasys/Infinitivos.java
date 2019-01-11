package qasys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Infinitivos {
    private Map<String, List<String>> infinitivos;
    
    public Infinitivos() {
        this.infinitivos = new HashMap<>();
    }
    
    public void addInfinitivo (String infinitivo, List<String> verbos) {
        this.infinitivos.put(infinitivo, verbos);
    }
    
    public String getInfinitivo (String verbo) {
        for(Map.Entry<String, List<String>> entrada : this.infinitivos.entrySet()) {
            if (entrada.getValue().contains(verbo)) {
                return entrada.getKey();
            }
        }
        
        return null;
    }
    
}
