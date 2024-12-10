package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BEB;

public abstract class zzih {
    public static final zzif zza = new Object();
    public static final zzif zzb;

    public static zzif zzb() {
        return zza;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.android.recaptcha.internal.zzif] */
    static {
        zzif zzif;
        try {
            zzif = (zzif) BEB.A0a("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            zzif = null;
        }
        zzb = zzif;
    }

    public static zzif zza() {
        zzif zzif = zzb;
        if (zzif != null) {
            return zzif;
        }
        throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
    }
}
