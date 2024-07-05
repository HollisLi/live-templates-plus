// Copyright 2000-2023 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.github.hollis;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import com.sun.jna.platform.win32.Sspi;
import org.jetbrains.annotations.NotNull;

/**
 * Java Context
 *
 * @author Hollis
 * @since 2024-07-05 15:01
 */
final class JavaContext extends TemplateContextType {

    JavaContext() {
        super("Java");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".java");
    }

}