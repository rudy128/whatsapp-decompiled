package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.BE7;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;

public final class zzey extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzoe zzb;
    public final /* synthetic */ zzbb zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzey(zzez zzez, zzoe zzoe, zzbb zzbb, C30391dr r5) {
        super(2, r5);
        this.zza = zzez;
        this.zzb = zzoe;
        this.zzc = zzbb;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new zzey(this.zza, this.zzb, this.zzc, r6);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C30691eM.A01(obj);
        try {
            zzez zzez = this.zza;
            String zzb2 = zzez.zzj.zzb(this.zzb, zzez.zzp);
            zzez zzez2 = this.zza;
            AnonymousClass3MX.A1Q(new zzex(zzez2, zzb2, (C30391dr) null), zzez2.zzq.zzb);
        } catch (zzp e) {
            zzez zzez3 = this.zza;
            zzez3.zzi.zzb(this.zzc, e, (String) null);
            BE7.A0x(this.zza).BFO(e);
        }
        return C27621Wu.A00;
    }
}
