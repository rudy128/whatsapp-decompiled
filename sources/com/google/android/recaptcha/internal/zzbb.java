package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C18070vi;

public final class zzbb {
    public final zzne zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze = null;

    public zzbb(zzne zzne, String str, String str2, String str3, String str4) {
        this.zza = zzne;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final zzne zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbb) {
            zzbb zzbb = (zzbb) obj;
            if (zzbb.zza != this.zza || !C18070vi.A18(zzbb.zzb, this.zzb) || !C18070vi.A18(zzbb.zzc, this.zzc) || !C18070vi.A18(zzbb.zzd, this.zzd)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.zza, 5);
        A1b[1] = this.zzb;
        A1b[2] = this.zzc;
        A1b[3] = this.zzd;
        return AnonymousClass000.A0P((Object) null, A1b, 4);
    }
}
