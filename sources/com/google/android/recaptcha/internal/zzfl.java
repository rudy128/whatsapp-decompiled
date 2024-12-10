package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BEA;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public final class zzfl extends zzfp implements Serializable {
    public final int zza;
    public final Queue zzb;

    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    public final Queue zzd() {
        return this.zzb;
    }

    public static zzfl zza(int i) {
        return new zzfl(i);
    }

    public final boolean add(Object obj) {
        if (obj != null) {
            if (this.zza != 0) {
                if (size() == this.zza) {
                    this.zzb.remove();
                }
                this.zzb.add(obj);
            }
            return true;
        }
        throw null;
    }

    public zzfl(int i) {
        if (i >= 0) {
            this.zzb = new ArrayDeque(i);
            this.zza = i;
            return;
        }
        throw AnonymousClass000.A0k(zzfi.zza("maxSize (%s) must >= 0", BEA.A1b(i)));
    }

    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i = size - this.zza;
            zzff.zzb(AnonymousClass000.A1Q(i), "number to skip cannot be negative");
            it = new zzfr(collection, i).iterator();
        } else {
            it = collection.iterator();
        }
        return zzfs.zza(this, it);
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
