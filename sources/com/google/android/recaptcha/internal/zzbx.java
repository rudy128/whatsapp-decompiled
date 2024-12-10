package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzbx extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ zzca zzd;
    public /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcj, List list, zzca zzca, C30391dr r5) {
        super(2, r5);
        this.zzb = zzcj;
        this.zzc = list;
        this.zzd = zzca;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        zzbx zzbx = new zzbx(this.zzb, this.zzc, this.zzd, r6);
        zzbx.zze = obj;
        return zzbx;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i == 0) {
            AnonymousClass1OX r5 = (AnonymousClass1OX) this.zze;
            zzfh zzfh = new zzfh();
            zzfh.zze();
            while (true) {
                int i2 = this.zzb.zzd;
                if (i2 < 0 || i2 >= this.zzc.size() || !AnonymousClass1OW.A05(r5)) {
                    zzfh.zzf();
                    zzfh.zza(TimeUnit.MICROSECONDS);
                } else {
                    try {
                        this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zzd), this.zzb);
                    } catch (Exception e) {
                        zzca zzca = this.zzd;
                        zzcj zzcj = this.zzb;
                        this.zza = 1;
                        if (zzca.zzh(e, zzcj, this) == r4) {
                            return r4;
                        }
                    }
                }
            }
            zzfh.zzf();
            zzfh.zza(TimeUnit.MICROSECONDS);
        }
        return C27621Wu.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
