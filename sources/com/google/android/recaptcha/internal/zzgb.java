package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C108975cc;

public abstract class zzgb {
    public static final long[][] zza = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long zza(long j, long j2) {
        boolean z = true;
        boolean A19 = C108975cc.A19(((j ^ j2) > 0 ? 1 : ((j ^ j2) == 0 ? 0 : -1)));
        long j3 = j + j2;
        if ((j ^ j3) < 0) {
            z = false;
        }
        zzgc.zza(A19 | z, "checkedAdd", j, j2);
        return j3;
    }

    public static long zzb(long j, long j2) {
        boolean z = true;
        boolean A1Q = AnonymousClass000.A1Q(((1 ^ j) > 0 ? 1 : ((1 ^ j) == 0 ? 0 : -1)));
        long j3 = -1 + j;
        if ((j ^ j3) < 0) {
            z = false;
        }
        zzgc.zza(A1Q | z, "checkedSubtract", j, 1);
        return j3;
    }
}
