package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BEB;
import X.C17880vN;
import com.facebook.common.dextricks.StringTreeSet;

public final class zzhe extends zzhh {
    public final byte[] zzc;
    public final int zzd;
    public int zze;

    public final int zza() {
        return this.zzd - this.zze;
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            C17880vN.A1T(A1a, this.zze, 0);
            AnonymousClass000.A1M(A1a, this.zzd);
            BE8.A1M(A1a, i2);
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", A1a), e);
        }
    }

    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    public final void zzb(byte b) {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.zze);
            throw new zzhf(BEB.A0b(this.zzd, A1a), e);
        }
    }

    public final void zzd(int i, boolean z) {
        zzq(i << 3);
        zzb(z ? (byte) 1 : 0);
    }

    public final void zze(int i, zzgw zzgw) {
        zzq((i << 3) | 2);
        zzq(zzgw.zzd());
        zzgw.zzi(this);
    }

    public final void zzf(int i, int i2) {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    public final void zzg(int i) {
        try {
            byte[] bArr = this.zzc;
            int A0C = BEB.A0C(bArr, this.zze, i);
            this.zze = A0C + 1;
            bArr[A0C] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.zze);
            throw new zzhf(BEB.A0b(this.zzd, A1a), e);
        }
    }

    public final void zzh(int i, long j) {
        zzq((i << 3) | 1);
        zzi(j);
    }

    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i2 = i + 1;
            int A0A = BE6.A0A(((int) j) & 255, bArr, i, i2);
            BE8.A0v(j, bArr, 8, i2);
            int i3 = A0A + 1;
            BE8.A0v(j, bArr, 16, A0A);
            int i4 = i3 + 1;
            BE8.A0v(j, bArr, 24, i3);
            int i5 = i4 + 1;
            BE8.A0v(j, bArr, 32, i4);
            int i6 = i5 + 1;
            BE8.A0v(j, bArr, 40, i5);
            int i7 = i6 + 1;
            BE8.A0v(j, bArr, 48, i6);
            this.zze = i7 + 1;
            BE8.A0v(j, bArr, 56, i7);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.zze);
            throw new zzhf(BEB.A0b(this.zzd, A1a), e);
        }
    }

    public final void zzj(int i, int i2) {
        zzq(i << 3);
        zzk(i2);
    }

    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs((long) i);
        }
    }

    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int zzb;
        int i = this.zze;
        try {
            int length = str.length();
            int A02 = BEB.A02(length * 3);
            int A022 = BEB.A02(length);
            if (A022 == A02) {
                int i2 = i + A022;
                this.zze = i2;
                zzb = zzma.zzb(str, this.zzc, i2, this.zzd - i2);
                this.zze = i;
                zzq((zzb - i) - A022);
            } else {
                zzq(zzma.zzc(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                zzb = zzma.zzb(str, bArr, i3, this.zzd - i3);
            }
            this.zze = zzb;
        } catch (zzlz e) {
            this.zze = i;
            zzC(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhf(e2);
        }
    }

    public final void zzo(int i, int i2) {
        zzq((i << 3) | i2);
    }

    public final void zzp(int i, int i2) {
        zzq(i << 3);
        zzq(i2);
    }

    public final void zzq(int i) {
        while ((i & -128) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = i2 + 1;
                BE7.A1T(bArr, i, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a, this.zze);
                throw new zzhf(BEB.A0b(this.zzd, A1a), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i3 = this.zze;
        this.zze = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void zzr(int i, long j) {
        zzq(i << 3);
        zzs(j);
    }

    public final void zzs(long j) {
        if (!zzhh.zzd || this.zzd - this.zze < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.zzc;
                    int i = this.zze;
                    this.zze = i + 1;
                    BE7.A1T(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1a = AnonymousClass8BR.A1a();
                    AnonymousClass000.A1L(A1a, this.zze);
                    throw new zzhf(BEB.A0b(this.zzd, A1a), e);
                }
            }
            byte[] bArr2 = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            int i4 = (int) j;
            byte[] bArr3 = this.zzc;
            int i5 = this.zze;
            this.zze = i5 + 1;
            long j2 = (long) i5;
            if (i3 == 0) {
                zzlv.zzn(bArr3, j2, (byte) i4);
                return;
            } else {
                zzlv.zzn(bArr3, j2, (byte) ((i4 & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                j >>>= 7;
            }
        }
    }

    public zzhe(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.zzc = bArr;
            this.zze = 0;
            this.zzd = i2;
            return;
        }
        Object[] A1a = AnonymousClass8BR.A1a();
        C17880vN.A1T(A1a, length, 0);
        C17880vN.A1T(A1a, 0, 1);
        BE8.A1M(A1a, i2);
        throw BE8.A0X("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1a);
    }
}
