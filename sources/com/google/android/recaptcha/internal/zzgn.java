package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;

public final class zzgn extends zzgp {
    public final /* synthetic */ zzgw zza;
    public int zzb = 0;
    public final int zzc;

    public zzgn(zzgw zzgw) {
        this.zza = zzgw;
        this.zzc = zzgw.zzd();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1U(this.zzb, this.zzc);
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return ((zzgt) this.zza).zza[i];
        }
        throw BE6.A14();
    }
}
