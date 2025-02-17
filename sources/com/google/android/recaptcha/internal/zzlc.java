package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class zzlc extends AbstractSet {
    public final /* synthetic */ zzle zza;

    public final Iterator iterator() {
        return new zzla(this.zza, (zzkz) null);
    }

    public /* synthetic */ zzlc(zzle zzle, zzlb zzlb) {
        this.zza = zzle;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
