package com.kodeir.plugin.cls;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Sergei "Kodeir" Riabinin on 10/03/17.
 */
public class SimpleElementType extends IElementType {

    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }

}
