package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;

public final class zzb extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zza zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(zza zza2, String str, long j, C30391dr r6) {
        super(2, r6);
        this.zzb = zza2;
        this.zzc = str;
        this.zzd = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new zzb(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object zza2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i != 0) {
            zza2 = ((C30671eK) obj).value;
        } else {
            zza zza3 = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zza2 = zza3.zza(str, j, this);
            if (zza2 == r5) {
                return r5;
            }
        }
        return new C30671eK(zza2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
