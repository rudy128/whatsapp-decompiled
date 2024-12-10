package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass04E;

public abstract class zzge implements zzkd {
    public abstract zzge zza();

    public abstract zzge zzb(zzgf zzgf);

    public /* bridge */ /* synthetic */ Object clone() {
        throw AnonymousClass04E.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ zzkd zzc(zzke zzke) {
        if (zzY().getClass().isInstance(zzke)) {
            zzb((zzgf) zzke);
            return this;
        }
        throw AnonymousClass000.A0k("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
