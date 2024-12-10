package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import java.util.Map;

public final class zzjh implements Map.Entry {
    public final Map.Entry zza;

    public /* synthetic */ zzjh(Map.Entry entry, zzjg zzjg) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        this.zza.getValue();
        return null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzke) {
            this.zza.getValue();
            throw AnonymousClass000.A0s("zzc");
        }
        throw AnonymousClass000.A0k("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzjj zza() {
        this.zza.getValue();
        return null;
    }
}
