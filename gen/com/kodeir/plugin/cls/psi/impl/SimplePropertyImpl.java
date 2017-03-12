// This is a generated file. Not intended for manual editing.
package com.kodeir.plugin.cls.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kodeir.plugin.cls.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kodeir.plugin.cls.psi.*;

public class SimplePropertyImpl extends ASTWrapperPsiElement implements SimpleProperty {

  public SimplePropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

}
