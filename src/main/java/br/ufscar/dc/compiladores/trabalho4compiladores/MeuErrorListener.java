package br.ufscar.dc.compiladores.trabalho4compiladores;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;


public class MeuErrorListener extends BaseErrorListener {
    // armazena todos os erros sintaticos gerados
    private final List<SyntaxError> errors = new ArrayList<>();
    
    public List<SyntaxError> getErrors() {
        return errors;
    }
    
    @Override
        public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            
            //Os erros gerados são armazenado em uma lista de SyntaxError( classe que sobrescreve RecognitionException)
            this.errors.add(new SyntaxError(msg, recognizer, recognizer.getInputStream(), ((Parser)recognizer).getContext(), (Token) offendingSymbol));

             
        }
    } 
