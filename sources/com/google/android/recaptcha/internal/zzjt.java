package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.BE6;
import X.BEA;
import X.BEB;
import X.C17880vN;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzjt extends zzgh implements zzja, zzkm, RandomAccess {
    public static final zzjt zza = new zzjt(new long[0], 0, false);
    public long[] zzb;
    public int zzc;

    public static zzjt zzf() {
        return zza;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzjt)) {
                return super.equals(obj);
            }
            zzjt zzjt = (zzjt) obj;
            int i = this.zzc;
            if (i == zzjt.zzc) {
                long[] jArr = zzjt.zzb;
                int i2 = 0;
                while (i2 < i) {
                    if (this.zzb[i2] == jArr[i2]) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            int i3 = i * 31;
            long j = this.zzb[i2];
            Charset charset = zzjc.zza;
            i = AnonymousClass001.A0J(j, i3);
        }
        return i;
    }

    public final int size() {
        return this.zzc;
    }

    private final String zzh(int i) {
        return BEB.A0f(AnonymousClass000.A10(), i, this.zzc);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw BE6.A0l(zzh(i));
        }
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long A05 = C17880vN.A05(obj);
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == A05) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= this.zzc) {
            return new zzjt(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw BE6.A0j();
    }

    public zzjt(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long A05 = C17880vN.A05(obj);
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw BE6.A0l(zzh(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i3, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = A05;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzjc.zza;
        if (collection == null) {
            throw null;
        } else if (!(collection instanceof zzjt)) {
            return super.addAll(collection);
        } else {
            zzjt zzjt = (zzjt) collection;
            int i = zzjt.zzc;
            if (i == 0) {
                return false;
            }
            int i2 = this.zzc;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                long[] jArr = this.zzb;
                if (i3 > jArr.length) {
                    jArr = Arrays.copyOf(jArr, i3);
                    this.zzb = jArr;
                }
                System.arraycopy(zzjt.zzb, 0, jArr, this.zzc, zzjt.zzc);
                this.zzc = i3;
                this.modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
    }

    public final boolean contains(Object obj) {
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Long.valueOf(this.zzb[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzi(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        BEA.A1D(jArr, this.zzc, i);
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw BE6.A0l("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long A05 = C17880vN.A05(obj);
        zza();
        zzi(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = A05;
        return Long.valueOf(j);
    }

    public final long zze(int i) {
        zzi(i);
        return this.zzb[i];
    }

    public final void zzg(long j) {
        zza();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
            jArr = jArr2;
        }
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr[i2] = j;
    }

    public zzjt() {
        this(new long[10], 0, true);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(C17880vN.A05(obj));
        return true;
    }
}
