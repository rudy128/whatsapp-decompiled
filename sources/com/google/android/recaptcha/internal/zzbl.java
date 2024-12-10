package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C17880vN;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.ContentValues;

public final class zzbl extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ zzbm zza;
    public final /* synthetic */ zzpd zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbm, zzpd zzpd, C30391dr r4) {
        super(2, r4);
        this.zza = zzbm;
        this.zzb = zzpd;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new zzbl(this.zza, this.zzb, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C27621Wu r0;
        C30691eM.A01(obj);
        zzbm zzbm = this.zza;
        zzpd zzpd = this.zzb;
        synchronized (zzbh.class) {
            if (zzbm.zze != null) {
                byte[] zzd = zzpd.zzd();
                String zzi = zzfy.zza.zzi(zzd, 0, zzd.length);
                long currentTimeMillis = System.currentTimeMillis();
                zzaz zzaz = zzbm.zze;
                ContentValues A08 = C17880vN.A08();
                A08.put("ss", zzi);
                C17880vN.A19(A08, "ts", currentTimeMillis);
                zzaz.getWritableDatabase().insert("ce", (String) null, A08);
                int zzb2 = zzbm.zze.zzb() - 500;
                if (zzb2 > 0) {
                    zzbm.zze.zza(C29431cG.A0v(zzbm.zze.zzd(), zzb2));
                }
                if (zzbm.zze.zzb() >= 20) {
                    zzbm.zzg();
                }
            }
            r0 = C27621Wu.A00;
        }
        return r0;
    }
}
