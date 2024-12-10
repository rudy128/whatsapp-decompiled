package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.Timer;

public final class zzbk extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ zzbm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbk(zzbm zzbm, C30391dr r3) {
        super(2, r3);
        this.zza = zzbm;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new zzbk(this.zza, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzbk(this.zza, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C27621Wu r0;
        C30691eM.A01(obj);
        zzbm zzbm = this.zza;
        synchronized (zzbh.class) {
            zzaz zzaz = zzbm.zze;
            if (zzaz != null && zzaz.zzb() == 0) {
                Timer timer = zzbm.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzbm.zzb = null;
            }
            zzbm.zzg();
            r0 = C27621Wu.A00;
        }
        return r0;
    }
}
