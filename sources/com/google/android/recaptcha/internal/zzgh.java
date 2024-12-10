package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass04E;
import X.BE8;
import X.BEB;
import X.C17880vN;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzgh extends AbstractList implements zzjb {
    public boolean zza;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    int i = 0;
                    while (i < size) {
                        if (BE8.A1Y(get(i), list, i)) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final void zza() {
        if (!this.zza) {
            throw C17880vN.A0y();
        }
    }

    public zzgh(boolean z) {
        this.zza = z;
    }

    public void add(int i, Object obj) {
        throw AnonymousClass04E.createAndThrow();
    }

    public boolean addAll(int i, Collection collection) {
        zza();
        return super.addAll(i, collection);
    }

    public void clear() {
        zza();
        super.clear();
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass000.A0O(get(i2), i * 31);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zza();
        return BEB.A1a(obj, this);
    }

    public final boolean removeAll(Collection collection) {
        zza();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zza();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        throw AnonymousClass04E.createAndThrow();
    }

    public boolean add(Object obj) {
        zza();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zza();
        return super.addAll(collection);
    }

    public Object remove(int i) {
        throw AnonymousClass04E.createAndThrow();
    }
}
