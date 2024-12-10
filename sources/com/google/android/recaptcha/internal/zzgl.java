package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BEA;
import X.BEB;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzgl extends zzgh implements zzjb, zzkm, RandomAccess {
    public static final zzgl zza = new zzgl(new boolean[0], 0, false);
    public boolean[] zzb;
    public int zzc;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzgl)) {
                return super.equals(obj);
            }
            zzgl zzgl = (zzgl) obj;
            int i = this.zzc;
            if (i == zzgl.zzc) {
                boolean[] zArr = zzgl.zzb;
                int i2 = 0;
                while (i2 < i) {
                    if (this.zzb[i2] == zArr[i2]) {
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
            boolean z = this.zzb[i2];
            Charset charset = zzjc.zza;
            int i4 = 1237;
            if (z) {
                i4 = 1231;
            }
            i = i3 + i4;
        }
        return i;
    }

    public final int size() {
        return this.zzc;
    }

    private final String zzf(int i) {
        return BEB.A0f(AnonymousClass000.A10(), i, this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw BE6.A0l(zzf(i));
        }
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean A1Y = AnonymousClass000.A1Y(obj);
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == A1Y) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= this.zzc) {
            return new zzgl(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw BE6.A0j();
    }

    public zzgl(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzb = zArr;
        this.zzc = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean A1Y = AnonymousClass000.A1Y(obj);
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw BE6.A0l(zzf(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.zzb;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzb, i, zArr2, i3, this.zzc - i);
            this.zzb = zArr2;
        }
        this.zzb[i] = A1Y;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzjc.zza;
        if (collection == null) {
            throw null;
        } else if (!(collection instanceof zzgl)) {
            return super.addAll(collection);
        } else {
            zzgl zzgl = (zzgl) collection;
            int i = zzgl.zzc;
            if (i == 0) {
                return false;
            }
            int i2 = this.zzc;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.zzb;
                if (i3 > zArr.length) {
                    zArr = Arrays.copyOf(zArr, i3);
                    this.zzb = zArr;
                }
                System.arraycopy(zzgl.zzb, 0, zArr, this.zzc, zzgl.zzc);
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
        zzg(i);
        return Boolean.valueOf(this.zzb[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        BEA.A1D(zArr, this.zzc, i);
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw BE6.A0l("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        zza();
        zzg(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        zArr[i] = A1Y;
        return Boolean.valueOf(z);
    }

    public final void zze(boolean z) {
        zza();
        int i = this.zzc;
        boolean[] zArr = this.zzb;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzb = zArr2;
            zArr = zArr2;
        }
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zArr[i2] = z;
    }

    public zzgl() {
        this(new boolean[10], 0, true);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(AnonymousClass000.A1Y(obj));
        return true;
    }
}
