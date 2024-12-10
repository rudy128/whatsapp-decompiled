package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;

public final class zzex extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzex(zzez zzez, String str, C30391dr r4) {
        super(2, r4);
        this.zza = zzez;
        this.zzb = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new zzex(this.zza, this.zzb, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C30691eM.A01(obj);
        zzez.zzm(this.zza, this.zzb);
        return C27621Wu.A00;
    }
}
