package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BU;

public abstract class zzgc {
    public static void zza(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("overflow: ");
            A10.append(str);
            A10.append("(");
            A10.append(j);
            A10.append(", ");
            A10.append(j2);
            throw new ArithmeticException(AnonymousClass8BU.A0q(A10));
        }
    }

    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
