package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;

public final class zzbz extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ zzca zzc;
    public final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbz(zzcj zzcj, zzca zzca, String str, C30391dr r5) {
        super(2, r5);
        this.zzb = zzcj;
        this.zzc = zzca;
        this.zzd = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new zzbz(this.zzb, this.zzc, this.zzd, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        if (i == 0) {
            C30691eM.A01(obj);
            this.zzb.zza = new zzz();
            zzpf zza2 = this.zzc.zzd.zza(zzpn.zzg(zzfy.zzb.zzj(this.zzd)));
            zzca zzca = this.zzc;
            zzjb zzjb = zza2.zzd;
            zzcj zzcj = this.zzb;
            this.zza = 1;
            if (zzca.zzg(zzjb, zzcj, this) == r4) {
                return r4;
            }
        } else if (i != 1) {
            C30691eM.A01(obj);
        } else {
            try {
                C30691eM.A01(obj);
            } catch (Exception e) {
                zzca zzca2 = this.zzc;
                zzcj zzcj2 = this.zzb;
                this.zza = 2;
                if (zzca2.zzh(e, zzcj2, this) == r4) {
                    return r4;
                }
            }
        }
        return C27621Wu.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbz) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
