package com.google.android.play.core.integrity;

import X.AnonymousClass000;

public final class b extends bq {
    public String a;
    public y b;

    public final bq a(y yVar) {
        this.b = yVar;
        return this;
    }

    public final bq b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw AnonymousClass000.A0s("Null token");
    }

    public final br c() {
        y yVar;
        String str = this.a;
        if (str != null && (yVar = this.b) != null) {
            return new br(str, yVar);
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
