package X;

import java.util.ArrayList;

/* renamed from: X.0NZ  reason: invalid class name */
public final class AnonymousClass0NZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public boolean A06;
    public final int A07;
    public final int[] A08;
    public final Object[] A09;
    public final int A0A;
    public final C06390Yd A0B;

    public final void A08() {
        this.A06 = true;
        this.A0B.A09(this);
    }

    public static final Object A00(AnonymousClass0NZ r4, int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return r4.A09[iArr[i2 + 4] + C04780Ot.A00(i3 >> 30)];
        }
        return null;
    }

    public final int A01() {
        int i = 1;
        if (this.A04 == 0) {
            int[] iArr = this.A08;
            int i2 = this.A01;
            if (!C04780Ot.A03(iArr, i2)) {
                i = AnonymousClass000.A0R(iArr, i2 * 5);
            }
            this.A01 = i2 + AnonymousClass000.A0S(iArr, i2);
            return i;
        }
        C05020Qb.A06("Cannot skip while in an empty region");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.0Cr, java.lang.Object] */
    public final C02090Cr A02(int i) {
        ArrayList A062 = this.A0B.A06();
        int A012 = C04780Ot.A01(A062, i, this.A07);
        if (A012 >= 0) {
            return (C02090Cr) A062.get(A012);
        }
        ? obj = new Object();
        obj.A00 = i;
        A062.add(-(A012 + 1), obj);
        return obj;
    }

    public final Object A04() {
        int i = this.A01;
        if (i >= this.A00) {
            return 0;
        }
        int[] iArr = this.A08;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return AnonymousClass0MH.A00;
        }
        Object[] objArr = this.A09;
        int length = iArr.length;
        if (i2 < length) {
            length = C04780Ot.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A05() {
        int i;
        if (this.A04 > 0 || (i = this.A02) >= this.A03) {
            return AnonymousClass0MH.A00;
        }
        Object[] objArr = this.A09;
        this.A02 = i + 1;
        return objArr[i];
    }

    public final Object A06(int i) {
        int[] iArr = this.A08;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return AnonymousClass0MH.A00;
        }
        Object[] objArr = this.A09;
        int length = iArr.length;
        if (i2 < length) {
            length = C04780Ot.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A07(int i, int i2) {
        int i3;
        int[] iArr = this.A08;
        int A022 = C04780Ot.A02(iArr, i);
        int i4 = i + 1;
        if (i4 < this.A07) {
            i3 = iArr[(i4 * 5) + 4];
        } else {
            i3 = this.A0A;
        }
        int i5 = A022 + i2;
        if (i5 < i3) {
            return this.A09[i5];
        }
        return AnonymousClass0MH.A00;
    }

    public final void A09() {
        int A0S;
        if (this.A04 != 0) {
            return;
        }
        if (this.A01 == this.A00) {
            int[] iArr = this.A08;
            int i = iArr[(this.A05 * 5) + 2];
            this.A05 = i;
            if (i < 0) {
                A0S = this.A07;
            } else {
                A0S = i + AnonymousClass000.A0S(iArr, i);
            }
            this.A00 = A0S;
            return;
        }
        C05020Qb.A06("endGroup() not called at the end of a group");
        throw null;
    }

    public final void A0A() {
        if (this.A04 == 0) {
            this.A01 = this.A00;
        } else {
            C05020Qb.A06("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
    }

    public final void A0B() {
        int i;
        if (this.A04 <= 0) {
            int i2 = this.A05;
            int i3 = this.A01;
            int[] iArr = this.A08;
            int i4 = i3 * 5;
            if (iArr[i4 + 2] == i2) {
                this.A05 = i3;
                this.A00 = iArr[i4 + 3] + i3;
                int i5 = i3 + 1;
                this.A01 = i5;
                this.A02 = C04780Ot.A02(iArr, i3);
                if (i3 >= this.A07 - 1) {
                    i = this.A0A;
                } else {
                    i = iArr[(i5 * 5) + 4];
                }
                this.A03 = i;
                return;
            }
            throw AnonymousClass000.A0k("Invalid slot table detected");
        }
    }

    public final void A0C(int i) {
        int i2;
        if (this.A04 == 0) {
            this.A01 = i;
            int i3 = this.A07;
            if (i < i3) {
                i2 = this.A08[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.A05 = i2;
            if (i2 < 0) {
                this.A00 = i3;
            } else {
                this.A00 = i2 + AnonymousClass000.A0S(this.A08, i2);
            }
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        C05020Qb.A06("Cannot reposition while in an empty region");
        throw null;
    }

    public AnonymousClass0NZ(C06390Yd r3) {
        this.A0B = r3;
        this.A08 = r3.A0G();
        int A002 = r3.A00();
        this.A07 = A002;
        this.A09 = r3.A0H();
        this.A0A = r3.A01();
        this.A00 = A002;
    }

    public final C06390Yd A03() {
        return this.A0B;
    }

    public String toString() {
        int i;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SlotReader(current=");
        int i2 = this.A01;
        A10.append(i2);
        A10.append(", key=");
        int i3 = this.A00;
        if (i2 < i3) {
            i = this.A08[i2 * 5];
        } else {
            i = 0;
        }
        A10.append(i);
        A10.append(", parent=");
        A10.append(this.A05);
        A10.append(", end=");
        return AnonymousClass001.A1L(A10, i3);
    }
}
