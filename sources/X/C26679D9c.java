package X;

import java.util.Arrays;

/* renamed from: X.D9c  reason: case insensitive filesystem */
public abstract class C26679D9c implements C28650ECj {
    public int A00;
    public final int A01;
    public final D3X A02;
    public final int[] A03;
    public final D48[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26679D9c d9c = (C26679D9c) obj;
            if (this.A02 != d9c.A02 || !Arrays.equals(this.A03, d9c.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = identityHashCode;
        return identityHashCode;
    }

    public C26679D9c(D3X d3x, int[] iArr) {
        int i;
        int length = iArr.length;
        C26056CrS.A03(AnonymousClass000.A1R(length));
        C26056CrS.A01(d3x);
        this.A02 = d3x;
        this.A01 = length;
        D48[] d48Arr = new D48[length];
        this.A04 = d48Arr;
        for (int i2 = 0; i2 < length; i2++) {
            d48Arr[i2] = d3x.A02[iArr[i2]];
        }
        Arrays.sort(d48Arr, new DUR(4));
        int i3 = this.A01;
        int[] iArr2 = new int[i3];
        this.A03 = iArr2;
        for (int i4 = 0; i4 < i3; i4++) {
            D48 d48 = this.A04[i4];
            char c = 0;
            while (true) {
                D48[] d48Arr2 = d3x.A02;
                if (c >= 1) {
                    i = -1;
                    break;
                } else if (d48 == d48Arr2[c]) {
                    i = 0;
                    break;
                } else {
                    c = 1;
                }
            }
            iArr2[i4] = i;
        }
    }
}
