package X;

import java.util.List;

/* renamed from: X.0V0  reason: invalid class name */
public final class AnonymousClass0V0 implements C15690r2 {
    public int A00;
    public boolean A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass0OM A07;
    public final Object A08;
    public final List A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int A0C;
    public final long A0D;
    public final C16330s5 A0E;
    public final C16340s6 A0F;
    public final C24246By4 A0G;
    public final Object A0H;
    public final boolean A0I;

    public /* synthetic */ AnonymousClass0V0(AnonymousClass0OM r15, C16330s5 r16, C16340s6 r17, C24246By4 by4, Object obj, Object obj2, List list, AnonymousClass1Y1 r22, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        this(r15, r16, r17, by4, obj, obj2, list, i, i4, j, z, z2);
    }

    public final long A00(int i) {
        int[] iArr = this.A0B;
        int i2 = i * 2;
        return C7A.A00(iArr[i2], iArr[i2 + 1]);
    }

    public final void A01(int i, int i2, int i3) {
        int i4;
        this.A00 = i;
        boolean z = this.A0A;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A02 = i5;
        List list = this.A09;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AnonymousClass0XJ r8 = (AnonymousClass0XJ) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0B;
            if (z) {
                C16330s5 r2 = this.A0E;
                if (r2 != null) {
                    iArr[i7] = r2.BC0(this.A0G, r8.A01, i2);
                    iArr[i7 + 1] = i;
                    i4 = r8.A00;
                } else {
                    throw AnonymousClass000.A0k("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                C16340s6 r1 = this.A0F;
                if (r1 != null) {
                    iArr[i8] = r1.BBy(r8.A00, i3);
                    i4 = r8.A01;
                } else {
                    throw AnonymousClass000.A0k("null verticalAlignment when isVertical == false");
                }
            }
            i += i4;
        }
    }

    public final void A02(AnonymousClass0QZ r11) {
        int A0H2;
        if (this.A02 != Integer.MIN_VALUE) {
            List list = this.A09;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0XJ r5 = (AnonymousClass0XJ) list.get(i);
                long A002 = A00(i);
                AnonymousClass0OM r0 = this.A07;
                r0.A01.get(this.A08);
                C22821Di A003 = AnonymousClass0MG.A00();
                if (this.A0I) {
                    boolean z = this.A0A;
                    int A0G2 = AnonymousClass000.A0G(A002);
                    if (z) {
                        A0H2 = (this.A02 - AnonymousClass000.A0H(A002)) - r5.A00;
                    } else {
                        A0G2 = (this.A02 - A0G2) - r5.A01;
                        A0H2 = AnonymousClass000.A0H(A002);
                    }
                    A002 = C7A.A00(A0G2, A0H2);
                }
                long j = this.A0D;
                long A004 = C7A.A00(AnonymousClass001.A0M(A002, j), AnonymousClass001.A0L(A002, j));
                if (this.A0A) {
                    AnonymousClass0QZ.A05(r5, A003, 0.0f, A004);
                } else {
                    r11.A0D(r5, A003, A004);
                }
            }
            return;
        }
        throw AnonymousClass000.A0k("position() should be called first");
    }

    public AnonymousClass0V0(AnonymousClass0OM r8, C16330s5 r9, C16340s6 r10, C24246By4 by4, Object obj, Object obj2, List list, int i, int i2, long j, boolean z, boolean z2) {
        int i3;
        int i4;
        this.A04 = i;
        this.A09 = list;
        this.A0A = z;
        this.A0E = r9;
        this.A0F = r10;
        this.A0G = by4;
        this.A0I = z2;
        this.A0C = i2;
        this.A0D = j;
        this.A08 = obj;
        this.A0H = obj2;
        this.A07 = r8;
        this.A02 = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AnonymousClass0XJ r2 = (AnonymousClass0XJ) list.get(i7);
            boolean z3 = this.A0A;
            if (z3) {
                i3 = r2.A00;
            } else {
                i3 = r2.A01;
            }
            i5 += i3;
            if (!z3) {
                i4 = r2.A00;
            } else {
                i4 = r2.A01;
            }
            i6 = Math.max(i6, i4);
        }
        this.A05 = i5;
        int i8 = i5 + this.A0C;
        this.A06 = i8 < 0 ? 0 : i8;
        this.A03 = i6;
        this.A0B = new int[(this.A09.size() * 2)];
    }
}
