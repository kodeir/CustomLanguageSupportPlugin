package com.kodeir.plugin.cls.psi;

import com.intellij.psi.tree.IElementType;
import com.kodeir.plugin.cls.SimpleLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Sergei "Kodeir" Riabinin on 10/03/17.
 */
public class SimpleTokenType extends IElementType {

    public SimpleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }

}
