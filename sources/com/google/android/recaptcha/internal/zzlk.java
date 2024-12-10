package com.google.android.recaptcha.internal;

import X.BE6;

public final class zzlk extends RuntimeException {
    public zzlk(zzke zzke) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzje zza() {
        return BE6.A0Y(getMessage());
    }
}
