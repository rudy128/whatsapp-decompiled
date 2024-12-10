package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1YF;
import X.C40151uF;

public final class zzu implements Comparable {
    public int zza;
    public long zzb;
    public long zzc;

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }

    public final String toString() {
        String A0L = AnonymousClass1YF.A0L(String.valueOf(this.zzb / ((long) this.zza)), 10);
        String A0L2 = AnonymousClass1YF.A0L(String.valueOf(this.zzc), 10);
        String A0L3 = AnonymousClass1YF.A0L(String.valueOf(this.zzb), 10);
        String A0L4 = AnonymousClass1YF.A0L(String.valueOf(this.zza), 5);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("avgExecutionTime: ");
        A10.append(A0L);
        A10.append(" us| maxExecutionTime: ");
        A10.append(A0L2);
        A10.append(" us| totalTime: ");
        A10.append(A0L3);
        return AnonymousClass001.A1H(" us| #Usages: ", A0L4, A10);
    }

    /* renamed from: zza */
    public final int compareTo(zzu zzu) {
        return C40151uF.A00(Long.valueOf(this.zzb), Long.valueOf(zzu.zzb));
    }
}
