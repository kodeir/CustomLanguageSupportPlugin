package com.kodeir.plugin.cls;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by Sergei "Kodeir" Riabinin on 12/03/17.
 */
public class SimpleLexerAdapter extends FlexAdapter {

    public SimpleLexerAdapter() {
        super(new SimpleLexer((Reader) null));
    }

}
