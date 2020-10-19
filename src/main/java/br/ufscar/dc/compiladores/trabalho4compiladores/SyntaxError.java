package br.ufscar.dc.compiladores.trabalho4compiladores;

import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class SyntaxError extends RecognitionException {
    // classe utilizada para sobreescrever a RecognitionExpection e adicionar o offendingToken
    public SyntaxError(String message, Recognizer<?, ?> recognizer, IntStream input, ParserRuleContext ctx, Token offendingToken) {
        super(message,recognizer, input, ctx);
        this.setOffendingToken(offendingToken);

    }
}
