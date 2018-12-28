/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qasys;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author calheno
 */
public class QASystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		String filename = "qa.txt";
		CharStream input;
		try {
			input = CharStreams.fromFileName(filename);
		} catch (IOException e1) {
			System.err.println("ERRO: Ficheiro não existe.");
			return;
		}

		QAGrammarLexer lexer = new QAGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		QAGrammarParser parser = new QAGrammarParser(tokens);
		ParseTree tree = parser.qas();
		System.out.println("árvore: " + tree.toStringTree(parser));
    }
    
    
    
}
