package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;

public final class zze extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zza zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzoe zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zze(zza zza2, long j, zzoe zzoe, C30391dr r6) {
        super(2, r6);
        this.zzb = zza2;
        this.zzc = j;
        this.zzd = zzoe;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new zze(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object zzb2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i != 0) {
            zzb2 = ((C30671eK) obj).value;
        } else {
            zza zza2 = this.zzb;
            long j = this.zzc;
            zzoe zzoe = this.zzd;
            this.zza = 1;
            zzb2 = zza2.zzb(j, zzoe, this);
            if (zzb2 == r5) {
                return r5;
            }
        }
        return new C30671eK(zzb2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
