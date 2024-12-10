package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BEA;
import X.BEB;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzil extends zzgh implements zzjb, zzkm, RandomAccess {
    public static final zzil zza = new zzil(new float[0], 0, false);
    public float[] zzb;
    public int zzc;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzil)) {
                return super.equals(obj);
            }
            zzil zzil = (zzil) obj;
            int i = this.zzc;
            if (i == zzil.zzc) {
                float[] fArr = zzil.zzb;
                int i2 = 0;
                while (i2 < i) {
                    if (Float.floatToIntBits(this.zzb[i2]) == Float.floatToIntBits(fArr[i2])) {
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
            i = AnonymousClass000.A0C(i * 31, this.zzb[i2]);
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
        if (obj instanceof Float) {
            float A04 = AnonymousClass000.A04(obj);
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == A04) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= this.zzc) {
            return new zzil(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw BE6.A0j();
    }

    public zzil(float[] fArr, int i, boolean z) {
        super(z);
        this.zzb = fArr;
        this.zzc = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float A04 = AnonymousClass000.A04(obj);
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw BE6.A0l(zzf(i));
        }
        int i3 = i + 1;
        float[] fArr = this.zzb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i3, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = A04;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzjc.zza;
        if (collection == null) {
            throw null;
        } else if (!(collection instanceof zzil)) {
            return super.addAll(collection);
        } else {
            zzil zzil = (zzil) collection;
            int i = zzil.zzc;
            if (i == 0) {
                return false;
            }
            int i2 = this.zzc;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                float[] fArr = this.zzb;
                if (i3 > fArr.length) {
                    fArr = Arrays.copyOf(fArr, i3);
                    this.zzb = fArr;
                }
                System.arraycopy(zzil.zzb, 0, fArr, this.zzc, zzil.zzc);
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
        return Float.valueOf(this.zzb[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        BEA.A1D(fArr, this.zzc, i);
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw BE6.A0l("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float A04 = AnonymousClass000.A04(obj);
        zza();
        zzg(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = A04;
        return Float.valueOf(f);
    }

    public final void zze(float f) {
        zza();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzb = fArr2;
            fArr = fArr2;
        }
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr[i2] = f;
    }

    public zzil() {
        this(new float[10], 0, true);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(AnonymousClass000.A04(obj));
        return true;
    }
}
