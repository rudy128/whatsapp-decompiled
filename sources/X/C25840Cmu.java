package X;

import java.util.Arrays;

/* renamed from: X.Cmu  reason: case insensitive filesystem */
public final class C25840Cmu {
    public static final C25840Cmu A05;
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02 = true;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Cmu] */
    static {
        ? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C25840Cmu)) {
                C25840Cmu cmu = (C25840Cmu) obj;
                int i = this.A00;
                if (i == cmu.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = cmu.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = cmu.A04;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i;
        int i2;
        int i3;
        int i4 = this.A01;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A00; i6++) {
            int i7 = this.A03[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0I = BE8.A0I(this.A04, i6);
                i = C25876Cnk.A04(i8);
                i2 = C23450BhF.A02(A0I);
                i3 = i + i2;
            } else if (i9 == 1) {
                i3 = C25876Cnk.A04(i8) + 8;
            } else if (i9 == 2) {
                i3 = C23450BhF.A03((DSO) this.A04[i6], i8);
            } else if (i9 == 3) {
                i = C25876Cnk.A04(i8) << 1;
                i2 = ((C25840Cmu) this.A04[i6]).A00();
                i3 = i + i2;
            } else if (i9 == 5) {
                i3 = C25876Cnk.A04(i8) + 4;
            } else {
                throw new IllegalStateException(new C23485Bhp());
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw C17880vN.A0y();
    }

    public final void A02(E9H e9h) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    DKF.A02(e9h, i3, C17880vN.A05(obj));
                } else if (i4 == 1) {
                    DKF.A01(e9h, i3, C17880vN.A05(obj));
                } else if (i4 == 2) {
                    ((DKF) e9h).A00.A0B((DSO) obj, i3);
                } else if (i4 == 3) {
                    C23450BhF bhF = ((DKF) e9h).A00;
                    int i5 = i3 << 3;
                    bhF.A05(i5 | 3);
                    ((C25840Cmu) obj).A02(e9h);
                    bhF.A05(i5 | 4);
                } else if (i4 == 5) {
                    DKF.A00(e9h, i3, AnonymousClass000.A0M(obj));
                } else {
                    throw AnonymousClass8BR.A0x(new C23485Bhp());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = (i + 527) * 31;
        int[] iArr = this.A03;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.A04;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = AnonymousClass000.A0O(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }
}
