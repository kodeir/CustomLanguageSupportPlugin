package com.kodeir.plugin.cls;

import com.intellij.lang.Language;

/**
 * Created by Sergei "Kodeir" Riabinin on 10/03/17.
 */
public class SimpleLanguage extends Language {

    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    //why private constructor?
    private SimpleLanguage() {
        super("Simple");
    }

}
