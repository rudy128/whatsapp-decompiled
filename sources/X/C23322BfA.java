package X;

import java.util.Arrays;

/* renamed from: X.BfA  reason: case insensitive filesystem */
public final class C23322BfA extends C23323BfB implements Cloneable {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03;
    public C23311Bez A04;
    public C23310Bey A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;
    public int[] A0A;
    public C23321Bf9[] A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a8, code lost:
        if (r1.length != 0) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r11 == r10) goto L_0x00c1
            boolean r0 = r11 instanceof X.C23322BfA
            r8 = 0
            if (r0 == 0) goto L_0x00c0
            X.BfA r11 = (X.C23322BfA) r11
            long r3 = r10.A01
            long r1 = r11.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            long r3 = r10.A02
            long r1 = r11.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            int r1 = r10.A00
            int r0 = r11.A00
            if (r1 != r0) goto L_0x00c0
            X.Bf9[] r7 = r10.A0B
            X.Bf9[] r6 = r11.A0B
            if (r7 != 0) goto L_0x0070
            r5 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x006e
            r4 = 0
        L_0x002a:
            r3 = 0
            r2 = 0
        L_0x002c:
            if (r3 >= r5) goto L_0x0035
            r0 = r7[r3]
            if (r0 != 0) goto L_0x0035
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0035:
            if (r2 >= r4) goto L_0x003e
            r0 = r6[r2]
            if (r0 != 0) goto L_0x003e
            int r2 = r2 + 1
            goto L_0x0035
        L_0x003e:
            boolean r1 = X.C108975cc.A1C(r3, r5)
            boolean r0 = X.C108975cc.A1C(r2, r4)
            if (r1 == 0) goto L_0x005d
            if (r0 == 0) goto L_0x00c0
            byte[] r1 = r10.A07
            byte[] r0 = r11.A07
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00c0
            X.Bez r1 = r10.A04
            X.Bez r0 = r11.A04
            if (r1 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x0079
            return r8
        L_0x005d:
            if (r1 != r0) goto L_0x00c0
            r1 = r7[r3]
            r0 = r6[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c0
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x002c
        L_0x006e:
            int r4 = r6.length
            goto L_0x002a
        L_0x0070:
            int r5 = r7.length
            goto L_0x0027
        L_0x0072:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0079
            return r8
        L_0x0079:
            byte[] r1 = r10.A08
            byte[] r0 = r11.A08
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00c0
            long r3 = r10.A03
            long r1 = r11.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            byte[] r1 = r10.A09
            byte[] r0 = r11.A09
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00c0
            int[] r2 = r10.A0A
            int[] r1 = r11.A0A
            if (r2 == 0) goto L_0x00a5
            int r0 = r2.length
            if (r0 == 0) goto L_0x00a5
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x00aa
            return r8
        L_0x00a5:
            if (r1 == 0) goto L_0x00aa
            int r0 = r1.length
            if (r0 != 0) goto L_0x00c0
        L_0x00aa:
            X.Bey r1 = r10.A05
            X.Bey r0 = r11.A05
            if (r1 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00ba
            return r8
        L_0x00b3:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ba
            return r8
        L_0x00ba:
            boolean r1 = r10.A06
            boolean r0 = r11.A06
            if (r1 == r0) goto L_0x00c1
        L_0x00c0:
            return r8
        L_0x00c1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23322BfA.equals(java.lang.Object):boolean");
    }

    public C23322BfA() {
        if (C23321Bf9.A00 == null) {
            synchronized (C24720CHh.A00) {
                if (C23321Bf9.A00 == null) {
                    C23321Bf9.A00 = new C23321Bf9[0];
                }
            }
        }
        this.A0B = C23321Bf9.A00;
        byte[] bArr = CHC.A00;
        this.A07 = bArr;
        this.A04 = null;
        this.A08 = bArr;
        this.A03 = 180000;
        this.A09 = bArr;
        this.A0A = CHC.A01;
        this.A05 = null;
        this.A06 = false;
        this.A00 = -1;
    }

    public final /* synthetic */ Object clone() {
        int length;
        try {
            C23322BfA bfA = (C23322BfA) super.A05();
            C23321Bf9[] bf9Arr = this.A0B;
            if (bf9Arr != null && (length = bf9Arr.length) > 0) {
                bfA.A0B = new C23321Bf9[length];
                int i = 0;
                while (true) {
                    C23321Bf9[] bf9Arr2 = this.A0B;
                    if (i >= bf9Arr2.length) {
                        break;
                    }
                    C23321Bf9 bf9 = bf9Arr2[i];
                    if (bf9 != null) {
                        C23321Bf9[] bf9Arr3 = bfA.A0B;
                        bf9.clone();
                        bf9Arr3[i] = null;
                    }
                    i++;
                }
            }
            C23311Bez bez = this.A04;
            if (bez != null) {
                bfA.A04 = bez;
            }
            int[] iArr = this.A0A;
            if (iArr != null && iArr.length > 0) {
                bfA.A0A = (int[]) iArr.clone();
            }
            C23310Bey bey = this.A05;
            if (bey != null) {
                bfA.A05 = bey;
            }
            return bfA;
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public final int hashCode() {
        int length;
        int i;
        int i2 = 1237;
        int A062 = ((BE6.A06(BE8.A09(this.A02, BE8.A09(this.A01, (C17890vO.A0U(this).hashCode() + 527) * 31)) * 31 * 31, this.A00) * 31) + 1237) * 31;
        C23321Bf9[] bf9Arr = this.A0B;
        if (bf9Arr == null) {
            length = 0;
        } else {
            length = bf9Arr.length;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            C23321Bf9 bf9 = bf9Arr[i4];
            if (bf9 != null) {
                i3 = AnonymousClass000.A0O(bf9, i3 * 31);
            }
        }
        int A063 = BE6.A06(BE8.A09(this.A03, BE6.A06((((((A062 + i3) * 31) + Arrays.hashCode(this.A07)) * 31) + AnonymousClass001.A0k(this.A04)) * 31, Arrays.hashCode(this.A08)) * 31 * 31 * 31) * 31, Arrays.hashCode(this.A09)) * 31;
        int[] iArr = this.A0A;
        if (iArr == null || iArr.length == 0) {
            i = 0;
        } else {
            i = Arrays.hashCode(iArr);
        }
        int A0k = (((A063 + i) * 31 * 31) + AnonymousClass001.A0k(this.A05)) * 31;
        if (this.A06) {
            i2 = 1231;
        }
        return (A0k + i2) * 31;
    }
}
