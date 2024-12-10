package com.google.android.recaptcha.internal;

import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass1OY;
import X.AnonymousClass3MX;
import X.C23791Hq;
import X.C23871Hy;
import X.C30391dr;
import X.C30431dv;
import X.DWA;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzt {
    public static final zzr zza = new Object();
    public final AnonymousClass1OX zzb = AnonymousClass1OW.A01();
    public final AnonymousClass1OX zzc;
    public final AnonymousClass1OX zzd;

    public final AnonymousClass1OX zza() {
        return this.zzd;
    }

    public final AnonymousClass1OX zzb() {
        return this.zzb;
    }

    public final AnonymousClass1OX zzc() {
        return this.zzc;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1dv, X.1OS] */
    public zzt() {
        AnonymousClass1OY A02 = AnonymousClass1OW.A02(new C23791Hq(Executors.newScheduledThreadPool(1, new DWA(new AtomicInteger()))));
        AnonymousClass3MX.A1Q(new C30431dv(2, (C30391dr) null), A02);
        this.zzc = A02;
        this.zzd = AnonymousClass1OW.A02(C23871Hy.A01);
    }
}
