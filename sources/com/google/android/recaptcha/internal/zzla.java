package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import java.util.Iterator;

public final class zzla implements Iterator {
    public final /* synthetic */ zzle zza;
    public int zzb = -1;
    public boolean zzc;
    public Iterator zzd;

    public /* synthetic */ zzla(zzle zzle, zzkz zzkz) {
        this.zza = zzle;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i < this.zza.zzb.size()) {
            return this.zza.zzb.get(this.zzb);
        }
        return zza().next();
    }

    private final Iterator zza() {
        Iterator it = this.zzd;
        if (it != null) {
            return it;
        }
        Iterator A15 = AnonymousClass000.A15(this.zza.zzc);
        this.zzd = A15;
        return A15;
    }

    public final boolean hasNext() {
        if (this.zzb + 1 < this.zza.zzb.size()) {
            return true;
        }
        if (this.zza.zzc.isEmpty() || !zza().hasNext()) {
            return false;
        }
        return true;
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            if (this.zzb < this.zza.zzb.size()) {
                zzle zzle = this.zza;
                int i = this.zzb;
                this.zzb = i - 1;
                Object unused = zzle.zzl(i);
                return;
            }
            zza().remove();
            return;
        }
        throw AnonymousClass000.A0n("remove() was called before next()");
    }
}
