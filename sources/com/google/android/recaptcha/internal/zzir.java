package com.google.android.recaptcha.internal;

import X.AnonymousClass000;

public final class zzir extends zzic {
    public final zzke zza;
    public final zziq zzb;

    public zzir(zzke zzke, Object obj, zzke zzke2, zziq zziq, Class cls) {
        if (zzke == null) {
            throw AnonymousClass000.A0k("Null containingTypeDefaultInstance");
        } else if (zziq.zzb != zzmb.MESSAGE) {
            this.zza = zzke;
            this.zzb = zziq;
        } else {
            throw AnonymousClass000.A0k("Null messageDefaultInstance");
        }
    }
}
