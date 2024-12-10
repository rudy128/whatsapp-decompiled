package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C17890vO;

public abstract class zzfm implements Iterable {
    public final zzfe zza = zzfd.zza;

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('[');
        boolean z = true;
        for (Object append : this) {
            if (!z) {
                A10.append(", ");
            }
            A10.append(append);
            z = false;
        }
        return C17890vO.A0c(A10, ']');
    }
}
