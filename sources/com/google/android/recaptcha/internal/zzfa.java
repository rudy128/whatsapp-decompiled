package com.google.android.recaptcha.internal;

import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.BE7;
import X.BE9;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzfa {
    public static final zzfa zza = new Object();

    public static final Map zza() {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[15];
        r2[0] = AnonymousClass1D6.A01(-4, zzl.zzz);
        r2[1] = AnonymousClass1D6.A01(-12, zzl.zzA);
        r2[2] = AnonymousClass1D6.A01(-6, zzl.zzv);
        r2[3] = AnonymousClass1D6.A01(-11, zzl.zzx);
        r2[4] = AnonymousClass1D6.A01(-13, zzl.zzB);
        BE9.A1E(-14, zzl.zzC, r2);
        BE9.A1F(-2, zzl.zzw, r2);
        r2[7] = AnonymousClass1D6.A01(-7, zzl.zzD);
        r2[8] = AnonymousClass1D6.A01(-5, zzl.zzE);
        r2[9] = AnonymousClass1D6.A01(-9, zzl.zzF);
        r2[10] = AnonymousClass1D6.A01(-8, zzl.zzP);
        r2[11] = AnonymousClass1D6.A01(-15, zzl.zzy);
        r2[12] = AnonymousClass1D6.A01(BE7.A0Z(), zzl.zzG);
        r2[13] = AnonymousClass1D6.A01(-3, zzl.zzI);
        r2[14] = AnonymousClass1D6.A01(-10, zzl.zzJ);
        LinkedHashMap A0C = AnonymousClass1D7.A0C(r2);
        if (Build.VERSION.SDK_INT >= 26) {
            A0C.put(-16, zzl.zzH);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            A0C.put(1, zzl.zzL);
            A0C.put(2, zzl.zzM);
            A0C.put(0, zzl.zzN);
            A0C.put(3, zzl.zzO);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            A0C.put(4, zzl.zzK);
        }
        return A0C;
    }
}
