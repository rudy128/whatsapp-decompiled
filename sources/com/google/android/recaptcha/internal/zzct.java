package com.google.android.recaptcha.internal;

import X.BE9;
import X.C200410p;
import X.C29351c6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzct implements zzdd {
    public static final zzct zza = new Object();

    public static final boolean zzb(List list) {
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(Boolean.valueOf(((zzpq) it.next()).zzN()));
        }
        if (!A0D.contains(false)) {
            return true;
        }
        return false;
    }

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzb(C200410p.A0Q(zzpqArr))) {
            for (zzpq zzi : zzpqArr) {
                zzcj.zze.zzb(zzi.zzi());
            }
            return;
        }
        throw BE9.A0S(5);
    }
}
