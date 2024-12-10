package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import android.content.Context;

public final class q implements x {
    public Context a;

    public q() {
        throw null;
    }

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        if (context != null) {
            this.a = context;
            return this;
        }
        throw null;
    }

    public final s b() {
        Context context = this.a;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new s(context, (r) null);
        }
        throw AnonymousClass000.A0n(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
