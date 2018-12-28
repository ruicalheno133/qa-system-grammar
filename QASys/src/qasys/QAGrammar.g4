/*
 *
 * Q & A Systems
 * Gramáticas na Compreensão de Software 
 *
 * Domínio: Filmes (com foco na saga Harry Potter)
 *
 * Autores: Rui Calheno (a78085)
 *          Bruno Carvalho
 *
 * Data: 26.11.2018
 *
 */

grammar QAGrammar;

@header {
    import java.util.HashMap;
}

@members {   
          HashMap<Pergunta, String> db = new HashMap<>();
          
          void adicionaEntrada (Pergunta pergunta, String resposta){
              db.put(pergunta, resposta);
          }
          
          String obtemResposta (Pergunta pergunta){
              String resposta = db.get(pergunta);
              if (resposta == null) return "Pergunta não consta na base de conhecimento.";
              else return resposta;
          }
          
          void imprimeDB () {
            for(Pergunta key: db.keySet()){
                System.out.println(key);
                System.out.println("Resposta: " + db.get(key));
            }
           
          }
                                          
}

qas: db questoes?; 

db : entrada entrada*
    {
        //imprimeDB(); 
    };

entrada returns [Pergunta p, String r]: 
         '{' tipo verbo nomes resposta '}' 
         {
            Pergunta p = new Pergunta($tipo.texto, $verbo.texto, $nomes.lista);
            
            adicionaEntrada(p, $resposta.texto);
         };

tipo returns [String texto]: 'TIPO: ' STR {$tipo.texto = $STR.text;};

verbo returns [String texto]: 'VERBO: ' STR {$verbo.texto = $STR.text;};

nomes returns [List<String> lista]: 
            'NOMES: ' listaNomes {$nomes.lista = $listaNomes.lista; };
            
listaNomes returns [List<String> lista]:                                
          n1=STR 
          {
           $listaNomes.lista = new ArrayList<String>();
           $listaNomes.lista.add($n1.text);
          } 
          (',' n2=STR 
          {
           $listaNomes.lista.add($n2.text);
          })*;

resposta returns [String texto]: 'RESPOSTA: ' STR {$resposta.texto = $STR.text;};

questoes: questao*;

questao: t=STR '-' v=STR '-' listaNomes
         {
          Pergunta pergunta = new Pergunta($t.text, $v.text, $listaNomes.lista);
          String resposta = obtemResposta(pergunta);
          System.out.println("Pergunta:\n" + pergunta + "\nResposta: " + resposta); 
         };

nomesQuestao returns [List<String> texto] :n1=STR {$nomesQuestao.texto = new ArrayList<String>();$nomesQuestao.texto.add($n1.text);} 
                                    (',' n2=STR {$nomesQuestao.texto.add($n2.text);})* ;


/* Analisador Léxico */

//STR:    (('\''|'\"') ~('\''|'\"')* ('\''|'\"')); 

STR: [a-zA-Z0-9]+;

JSON: [a-zA-Z]+'.json';

SEPARADOR: ('\r'? '\n' | ' ' | '\t')+  -> skip;