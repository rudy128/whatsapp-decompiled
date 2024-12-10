package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.BE7;
import X.C108935cY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;

public final class zzew extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzez zzb;
    public final /* synthetic */ zzoe zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzez, zzoe zzoe, C30391dr r4) {
        super(2, r4);
        this.zzb = zzez;
        this.zzc = zzoe;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new zzew(this.zzb, this.zzc, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i == 0) {
            zzez zzez = this.zzb;
            zzez.zzi.zza(zzez.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzb.zzj(this.zzc.zzj)));
            zzez zzez2 = this.zzb;
            zzfh zzfh = zzez2.zzn;
            zzfh.zzd();
            zzfh.zze();
            zzez.zzl(zzez2, this.zzc);
            BE7.A0x(this.zzb).hashCode();
            C108935cY A0x = BE7.A0x(this.zzb);
            this.zza = 1;
            if (A0x.BCp(this) == r2) {
                return r2;
            }
        }
        return new C30671eK(C27621Wu.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
