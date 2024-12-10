package X;

import java.util.ArrayList;

/* renamed from: X.0Po  reason: invalid class name and case insensitive filesystem */
public final class C04930Po {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public AnonymousClass0H8 A04 = new AnonymousClass0H8();
    public AnonymousClass0Kg A05;
    public boolean A06;
    public int A07;
    public int A08 = -1;
    public final AnonymousClass0VR A09;
    public final C04330Mt A0A = new C04330Mt();

    public static final void A01(C04930Po r7) {
        A03(r7, false);
        AnonymousClass0NZ r6 = r7.A09.A0B;
        if (r6.A07 > 0) {
            int i = r6.A05;
            C04330Mt r3 = r7.A0A;
            int i2 = -2;
            int i3 = r3.A00;
            if (i3 > 0) {
                i2 = r3.A01[i3 - 1];
            }
            if (i2 != i) {
                if (!r7.A06) {
                    A03(r7, false);
                    r7.A05.A00.A06(C010707a.A00);
                    r7.A06 = true;
                }
                if (i > 0) {
                    C02090Cr A022 = r6.A02(i);
                    r3.A01(i);
                    A03(r7, false);
                    r7.A05.A05(A022);
                    r7.A06 = true;
                }
            }
        }
    }

    public static final void A00(C04930Po r6) {
        int i = r6.A07;
        if (i > 0) {
            r6.A05.A02(i);
            r6.A07 = 0;
        }
        ArrayList arrayList = r6.A04.A00;
        if (!arrayList.isEmpty()) {
            AnonymousClass0Kg r4 = r6.A05;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            r4.A0E(objArr);
            arrayList.clear();
        }
    }

    public static final void A02(C04930Po r5) {
        int i = r5.A00;
        if (i > 0) {
            int i2 = r5.A08;
            if (i2 >= 0) {
                A00(r5);
                r5.A05.A03(i2, i);
                r5.A08 = -1;
            } else {
                int i3 = r5.A02;
                int i4 = r5.A01;
                A00(r5);
                r5.A05.A04(i3, i4, i);
                r5.A01 = -1;
                r5.A02 = -1;
            }
            r5.A00 = 0;
        }
    }

    public static final void A03(C04930Po r3, boolean z) {
        int i;
        AnonymousClass0NZ r0 = r3.A09.A0B;
        if (z) {
            i = r0.A05;
        } else {
            i = r0.A01;
        }
        int i2 = i - r3.A03;
        if (i2 < 0) {
            C05020Qb.A06("Tried to seek backward");
            throw null;
        } else if (i2 > 0) {
            r3.A05.A00(i2);
            r3.A03 = i;
        }
    }

    public final void A04() {
        ArrayList arrayList = this.A04.A00;
        if (!arrayList.isEmpty()) {
            arrayList.remove(AnonymousClass000.A0Q(arrayList));
        } else {
            this.A07++;
        }
    }

    public final void A05(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i < 0) {
            C05020Qb.A06(AnonymousClass001.A1I("Invalid remove index ", AnonymousClass000.A10(), i));
            throw null;
        } else if (this.A08 == i) {
            this.A00 += i2;
        } else {
            A02(this);
            this.A08 = i;
            this.A00 = i2;
        }
    }

    public final void A08(C16640sl r2, C22821Di r3) {
        this.A05.A08(r2, r3);
    }

    public final void A0A(C18090vk r2) {
        this.A05.A0D(r2);
    }

    public C04930Po(AnonymousClass0VR r2, AnonymousClass0Kg r3) {
        this.A09 = r2;
        this.A05 = r3;
    }

    public final void A06(C02090Cr r2, C06390Yd r3) {
        A00(this);
        A01(this);
        this.A05.A06(r2, r3);
    }

    public final void A07(C02090Cr r2, C06390Yd r3, C03450If r4) {
        A00(this);
        A01(this);
        this.A05.A07(r2, r3, r4);
    }

    public final void A09(Object obj, AnonymousClass1OS r3) {
        A00(this);
        this.A05.A0C(obj, r3);
    }
}
