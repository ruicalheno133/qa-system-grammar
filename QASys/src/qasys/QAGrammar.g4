/*
 *
 * Q & A System
 * Gramáticas na Compreensão de Software 
 *
 * Domínio: Filmes (com foco na saga Harry Potter)
 *
 * Autores: Bruno Carvalho (a76987)
 *          Rui Calheno (a78085)         
 *
 * Data: 26.11.2018
 *
 */

grammar QAGrammar;

@header {
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
}

@members {   
    HashMap<Pergunta, String> db = new HashMap<>();
    Infinitivos infinitivos = new Infinitivos();
          
    void adicionaEntrada (Pergunta pergunta, String resposta){
        db.put(pergunta, resposta);
    }
          
    String obtemResposta (Pergunta pergunta){
        String resposta = db.get(pergunta);
        if (resposta == null) 
            return "Pergunta não consta na base de conhecimento.";
        else return resposta;
    }
              
    void imprimirResposta(String tipo, String verbo, List<String> nomes, String resposta){
        System.out.print("Pergunta: ");
        System.out.print(tipo + " " + verbo + " ");
        for (String nome : nomes)
            System.out.print(nome + " ");
        System.out.println("?");
        System.out.println("Resposta: " + resposta);                                                                             
    }                                       
}

qas: infinitivos db perguntas?; 

infinitivos: 'INFINITIVOS:' listaAssociacoes;

listaAssociacoes: (associacao ';' {
        infinitivos.addInfinitivo($associacao.infinit, $associacao.listaVerbos);
    })+ ;

associacao returns [String infinit, List<String> listaVerbos]
    @init {
        $associacao.listaVerbos = new ArrayList<>();
    }: 
        infinitivo=TEXT {$associacao.infinit = $infinitivo.text;} '-' 
        (verbos=TEXT {
            $associacao.listaVerbos.add($verbos.text);
        })+ ;

db : 'DB:' entrada+;

entrada: '{' tipo verbo nomes resposta '}' 
         {
            Pergunta p = new Pergunta($tipo.texto, $verbo.texto, $nomes.lista);
            
            adicionaEntrada(p, $resposta.texto);
         };

tipo returns [String texto]: 
    'TIPO:' TEXT {$tipo.texto = $TEXT.text;};

verbo returns [String texto]: 
    'VERBO:' TEXT {$verbo.texto = $TEXT.text;};

nomes returns [List<String> lista]: 
    'NOMES:' listaNomes {$nomes.lista = $listaNomes.lista; };
            
listaNomes returns [List<String> lista]
    @init {
    $listaNomes.lista = new ArrayList<String>();
    }:                                
        n1=TEXT 
        {
            $listaNomes.lista.add($n1.text);
        } 
        (n2=TEXT 
        {
            $listaNomes.lista.add($n2.text);
        })*;

resposta returns [String texto]: 
    'RESPOSTA:' STR {$resposta.texto = $STR.text;};

perguntas: 'PERGUNTAS:' (pergunta '?')*;

pergunta: tipoP=TEXT '-' verboP=TEXT '-' listaNomes
    {
        String infinitivo = infinitivos.getInfinitivo($verboP.text);
        Pergunta pergunta = new Pergunta($tipoP.text, infinitivo, $listaNomes.lista);
        String resposta = obtemResposta(pergunta);
        imprimirResposta($tipoP.text, $verboP.text, $listaNomes.lista, resposta);
    }; 

/* Analisador Léxico */

STR:    (('\''|'\"') ~('\''|'\"')* ('\''|'\"')); 

TEXT: [a-zA-Z0-9áéíóúàèìòùãõç]+;

SEPARADOR: ('\r'? '\n' | ' ' | '\t')+  -> skip;