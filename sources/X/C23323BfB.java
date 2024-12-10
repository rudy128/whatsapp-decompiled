package X;

import java.util.Arrays;

/* renamed from: X.BfB  reason: case insensitive filesystem */
public abstract class C23323BfB extends C26031Cqr {
    public int A04() {
        int length;
        int i;
        C23322BfA bfA = (C23322BfA) this;
        int i2 = 0;
        long j = bfA.A01;
        if (j != 0) {
            i2 = 0 + C26133Csw.A00(j) + 1;
        }
        C23321Bf9[] bf9Arr = bfA.A0B;
        int i3 = 0;
        if (bf9Arr != null && bf9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C23321Bf9[] bf9Arr2 = bfA.A0B;
                if (i4 >= bf9Arr2.length) {
                    break;
                }
                C23321Bf9 bf9 = bf9Arr2[i4];
                if (bf9 != null) {
                    int A04 = bf9.A04();
                    bf9.A00 = A04;
                    i2 += BEB.A02(A04) + A04 + 1;
                }
                i4++;
            }
        }
        byte[] bArr = bfA.A07;
        byte[] bArr2 = CHC.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            int length2 = bArr.length;
            i2 += BEB.A02(length2) + length2 + 1;
        }
        if (!Arrays.equals(bfA.A08, bArr2)) {
            int length3 = bfA.A08.length;
            i2 += BEB.A02(length3) + length3 + 1;
        }
        C23311Bez bez = bfA.A04;
        if (bez != null) {
            boolean z = C23301Bep.A01;
            int i5 = bez.zzjq;
            if (i5 == -1) {
                i5 = BE9.A0R(bez).CTi(bez);
                bez.zzjq = i5;
            }
            i2 += BEB.A02(i5) + i5 + 1;
        }
        int i6 = bfA.A00;
        if (i6 != 0) {
            i2 += BEB.A02(i6) + 1;
        }
        long j2 = bfA.A03;
        if (j2 != 180000) {
            i2 += 1 + C26133Csw.A00((j2 >> 63) ^ (j2 << 1));
        }
        long j3 = bfA.A02;
        if (j3 != 0) {
            i2 += 2 + C26133Csw.A00(j3);
        }
        byte[] bArr3 = bfA.A09;
        if (!Arrays.equals(bArr3, bArr2)) {
            int length4 = bArr3.length;
            i2 += 2 + BEB.A02(length4) + length4;
        }
        int[] iArr = bfA.A0A;
        if (iArr != null && (length = iArr.length) > 0) {
            int i7 = 0;
            do {
                int i8 = iArr[i3];
                if (i8 >= 0) {
                    i = BEB.A02(i8);
                } else {
                    i = 10;
                }
                i7 += i;
                i3++;
            } while (i3 < length);
            i2 = i2 + i7 + (length * 2);
        }
        C23310Bey bey = bfA.A05;
        if (bey != null) {
            boolean z2 = C23301Bep.A01;
            int i9 = bey.zzjq;
            if (i9 == -1) {
                i9 = BE9.A0R(bey).CTi(bey);
                bey.zzjq = i9;
            }
            i2 += C26164Ctd.A03(i9, 2);
        }
        if (bfA.A06) {
            return i2 + 3;
        }
        return i2;
    }

    public C23323BfB A05() {
        return (C23323BfB) super.A02();
    }
}
