package com.google.android.recaptcha.internal;

import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.BE6;
import X.BE7;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C31751g4;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class zzca implements zzbu {
    public static final zzbv zza = new Object();
    public final AnonymousClass1OX zzb;
    public final zzcl zzc;
    public final zzee zzd;
    public final Map zze;
    public final Map zzf;

    /* access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcj, C30391dr r5) {
        Object A00 = AnonymousClass1OW.A00(r5, new zzbx(zzcj, list, this, (C30391dr) null));
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A00;
    }

    /* access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcj, C30391dr r5) {
        Object A00 = AnonymousClass1OW.A00(r5, new zzby(exc, zzcj, this, (C30391dr) null));
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A00;
    }

    /* access modifiers changed from: private */
    public final void zzi(zzpr zzpr, zzcj zzcj) {
        zzfh zzfh = new zzfh();
        zzfh.zze();
        int i = zzcj.zzd;
        zzdd zzdd = (zzdd) this.zze.get(Integer.valueOf(zzpr.zzf));
        if (zzdd != null) {
            int i2 = zzpr.zzg;
            zzpq[] zzpqArr = (zzpq[]) zzpr.zzh.toArray(new zzpq[0]);
            zzdd.zza(i2, zzcj, (zzpq[]) Arrays.copyOf(zzpqArr, zzpqArr.length));
            int i3 = zzcj.zzd;
            if (i == i3) {
                zzcj.zzd = i3 + 1;
            }
            zzfh.zzf();
            long zza2 = zzfh.zza(TimeUnit.MICROSECONDS);
            int zzk = zzpr.zzk();
            if (zzk != 1) {
                zzv.zza(zzk - 2, zza2);
                C29431cG.A0g(", ", "", "", zzpr.zzh, new zzbw(this));
                return;
            }
            throw BE7.A0X();
        }
        throw BE6.A0V((Throwable) null, 5, 2);
    }

    public final void zza(String str) {
        AnonymousClass3MX.A1Q(new zzbz(new zzcj(this.zzc), this, str, (C30391dr) null), this.zzb);
    }

    public zzca(AnonymousClass1OX r2, zzcl zzcl, zzee zzee, Map map) {
        this.zzb = r2;
        this.zzc = zzcl;
        this.zzd = zzee;
        this.zze = map;
        this.zzf = zzcl.zzb.zzc;
    }
}
