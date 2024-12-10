package com.google.android.play.core.integrity;

import X.AnonymousClass000;

public final class a extends ap {
    public String a;
    public y b;

    public final ap a(y yVar) {
        this.b = yVar;
        return this;
    }

    public final ap b(String str) {
        this.a = str;
        return this;
    }

    public final aq c() {
        y yVar;
        String str = this.a;
        if (str != null && (yVar = this.b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        if (str == null) {
            A10.append(" token");
        }
        if (this.b == null) {
            A10.append(" integrityDialogWrapper");
        }
        throw AnonymousClass000.A0n("Missing required properties:".concat(A10.toString()));
    }
}
