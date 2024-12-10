package com.google.android.recaptcha.internal;

import X.BE6;
import X.C17880vN;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzjl extends zzgh implements zzjm, RandomAccess {
    @Deprecated
    public static final zzjm zza;
    public static final zzjl zzb;
    public final List zzc;

    static {
        zzjl zzjl = new zzjl(false);
        zzb = zzjl;
        zza = zzjl;
    }

    public static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgw) {
            return ((zzgw) obj).zzn(zzjc.zzb);
        }
        return BE6.A0q(zzjc.zzb, (byte[]) obj);
    }

    public final int size() {
        return this.zzc.size();
    }

    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    /* renamed from: zzg */
    public final String get(int i) {
        String A0q;
        boolean zze;
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgw) {
            zzgw zzgw = (zzgw) obj;
            A0q = zzgw.zzn(zzjc.zzb);
            zze = zzgw.zzj();
        } else {
            byte[] bArr = (byte[]) obj;
            A0q = BE6.A0q(zzjc.zzb, bArr);
            zze = zzma.zze(bArr);
        }
        if (zze) {
            this.zzc.set(i, A0q);
        }
        return A0q;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjl(int i) {
        super(true);
        ArrayList A0z = C17880vN.A0z(i);
        this.zzc = A0z;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzjm) {
            collection = ((zzjm) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzj(this.zzc.set(i, obj));
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= size()) {
            ArrayList A0z = C17880vN.A0z(i);
            A0z.addAll(this.zzc);
            return new zzjl(A0z);
        }
        throw BE6.A0j();
    }

    public final zzjm zze() {
        if (zzc()) {
            return new zzlq(this);
        }
        return this;
    }

    public final void zzi(zzgw zzgw) {
        zza();
        this.zzc.add(zzgw);
        this.modCount++;
    }

    public zzjl(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public zzjl() {
        this(10);
    }

    public zzjl(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }
}
