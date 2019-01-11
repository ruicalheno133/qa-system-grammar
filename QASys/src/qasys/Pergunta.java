package qasys;

import java.util.List;

public class Pergunta {
    private String tipo;  // Tipo da Pergunta
    private String verbo; // Verbo da Pergunta
    private List<String> nomes; // Nomes da Pergunta
    
    public Pergunta (String tipo, String verbo, List nomes) {
        this.tipo = tipo;
        this.verbo = verbo;
        this.nomes = nomes;
    }
    
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        
        Pergunta p = (Pergunta) o;
        
        return this.tipo.equals(p.tipo)
                && this.verbo.equals(p.verbo) 
                && this.nomes.equals(p.nomes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Tipo: " + this.tipo + ", ");
        sb.append("Verbo: " + this.verbo + ", ");
        sb.append("Nomes: ");
        for (String nome : this.nomes)
            sb.append(nome + " ");
        
        return sb.toString();
    }
    
      public int hashCode() {
        int result = 17;
        result = 31 * result + this.tipo.hashCode();
        result = 31 * result + this.verbo.hashCode();
        result = 31 * result + this.nomes.hashCode();
        return result;
    }

}
