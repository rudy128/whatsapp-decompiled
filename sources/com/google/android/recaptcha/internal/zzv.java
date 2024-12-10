package com.google.android.recaptcha.internal;

import X.AnonymousClass8BR;
import java.util.concurrent.ConcurrentHashMap;

public final class zzv {
    public static final zzv zza = new Object();
    public static final ConcurrentHashMap zzb = AnonymousClass8BR.A17();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new Object();
        }
        zzu zzu = (zzu) obj;
        zzu.zza++;
        zzu.zzb += j;
        zzu.zzc = Math.max(j, zzu.zzc);
        concurrentHashMap.put(valueOf, zzu);
    }
}
