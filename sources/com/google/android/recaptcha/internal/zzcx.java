package com.google.android.recaptcha.internal;

import X.AnonymousClass11G;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C27621Wu;

public final class zzcx extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ zzcj zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcx(zzcj zzcj, String str, int i) {
        super(2);
        this.zza = zzcj;
        this.zzb = str;
        this.zzc = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        this.zza.zzh.zzb(this.zzb, C108975cc.A1b(obj2));
        int i = this.zzc;
        if (i != -1) {
            this.zza.zze.zzf(i, obj);
        }
        return C27621Wu.A00;
    }
}
