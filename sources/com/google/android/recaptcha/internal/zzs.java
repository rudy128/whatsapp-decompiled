package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;

public final class zzs extends C30431dv implements AnonymousClass1OS {
    public zzs(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new C30431dv(2, r4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1dv, com.google.android.recaptcha.internal.zzs] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C30431dv(2, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C30691eM.A01(obj);
        Thread.currentThread().setPriority(8);
        return C27621Wu.A00;
    }
}
