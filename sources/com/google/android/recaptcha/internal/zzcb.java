package com.google.android.recaptcha.internal;

import X.AnonymousClass1YF;
import X.BE7;
import X.C108955ca;
import X.C18070vi;
import X.C29431cG;
import java.util.Set;

public final class zzcb {
    public static final zzcb zza = new Object();
    public static Set zzb;
    public static Set zzc;
    public static Long zzd;
    public static int zze;

    public static final boolean zzc(String str, Set set) {
        String str2 = "";
        for (Object A0m : AnonymousClass1YF.A0R(str, new char[]{'.'})) {
            String A0m2 = BE7.A0m(str2, A0m);
            if (set.contains(A0m2)) {
                return true;
            }
            str2 = A0m2.concat(".");
        }
        return false;
    }

    public static final void zza(zznz zznz) {
        zznx zznx = zznz.zze;
        if (zznx == null) {
            zznx = zznx.zzb;
        }
        zzb = C29431cG.A12(zznx.zzd);
        zznx zznx2 = zznz.zzf;
        if (zznx2 == null) {
            zznx2 = zznx.zzb;
        }
        zzc = C29431cG.A12(zznx2.zzd);
    }

    public static final boolean zzb(String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = C108955ca.A0m();
            }
            zze++;
        } else if (!set.isEmpty()) {
            Set set2 = zzc;
            C18070vi.A0z(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzc(str, set2)) {
                return false;
            }
            return zzc(str, set);
        }
        return true;
    }
}
