package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import android.content.Context;

public final class u implements av {
    public Context a;

    public u() {
        throw null;
    }

    public /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        if (context != null) {
            this.a = context;
            return this;
        }
        throw null;
    }

    public final aw b() {
        Context context = this.a;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new w(context, (v) null);
        }
        throw AnonymousClass000.A0n(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
