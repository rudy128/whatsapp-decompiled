package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.0X8  reason: invalid class name */
public final class AnonymousClass0X8 implements C16870tM {
    public final float A00;
    public final AnonymousClass0tB A01;
    public final boolean A02;

    public static final int A00(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.A03(j));
    }

    public static final int A01(AnonymousClass0tB r7, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z) {
        float BE0;
        int max;
        boolean A1R = AnonymousClass000.A1R(i2);
        if (!A1R || z) {
            BE0 = r7.BE0() + r7.BDk();
        } else {
            BE0 = 16.0f * 2.0f;
        }
        float f2 = BE0 * f;
        if (!A1R || !z) {
            max = Math.max(i2, Math.max(i, i7));
        } else {
            f2 += (float) i2;
            max = Math.max(i, i7);
        }
        int A022 = Constraints.A02(j);
        int[] iArr = {i4, i5, i6, C22339B3q.A01(f2 + ((float) max))};
        int i9 = 0;
        do {
            i3 = Math.max(i3, iArr[i9]);
            i9++;
        } while (i9 < 4);
        return Math.max(A022, i3 + i8);
    }

    public int BjA(C17740v9 r2, List list, int i) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(list, 1);
        return A02(r2, list, C14610pI.A00, i);
    }

    public int BjD(C17740v9 r2, List list, int i) {
        C18070vi.A0d(list, 1);
        return A03(list, C14620pJ.A00, i);
    }

    public C16820tH BjZ(C17530uo r50, List list, long j) {
        Object obj;
        AnonymousClass0XJ r5;
        int i;
        Object obj2;
        AnonymousClass0XJ r9;
        int i2;
        Object obj3;
        AnonymousClass0XJ r14;
        int i3;
        Object obj4;
        int i4;
        Object obj5;
        AnonymousClass0XJ r6;
        int i5;
        Object obj6;
        AnonymousClass0XJ r23;
        Object obj7;
        AnonymousClass0XJ r0;
        int i6;
        int i7;
        C17530uo r48 = r50;
        C18070vi.A0d(r48, 0);
        List<C17500ul> list2 = list;
        C18070vi.A0d(list2, 1);
        AnonymousClass0tB r31 = this.A01;
        C17530uo r02 = r48;
        int CG9 = r02.CG9(r31.BE0());
        int CG92 = r02.CG9(r31.BDk());
        int i8 = 0;
        long j2 = j;
        long A04 = Constraints.A04(0, 0, 0, 0, 10, j2);
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(C02610Er.A00((C17500ul) obj), "Leading")) {
                break;
            }
        }
        C17500ul r52 = (C17500ul) obj;
        if (r52 != null) {
            r5 = r52.Bjb(A04);
            if (r5 != null) {
                i8 = r5.A01;
                i = r5.A00;
            }
            i = 0;
        } else {
            r5 = null;
            i = 0;
        }
        int max = Math.max(0, i);
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C18070vi.A18(C02610Er.A00((C17500ul) obj2), "Trailing")) {
                break;
            }
        }
        C17500ul r92 = (C17500ul) obj2;
        if (r92 != null) {
            r9 = r92.Bjb(C26229CvL.A04(-i8, 0, 2, A04));
            if (r9 != null) {
                i2 = r9.A01;
            }
            i2 = 0;
        } else {
            r9 = null;
            i2 = 0;
        }
        int i9 = i8 + i2;
        int max2 = Math.max(max, AnonymousClass000.A0J(r9));
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (C18070vi.A18(C02610Er.A00((C17500ul) obj3), "Prefix")) {
                break;
            }
        }
        C17500ul r10 = (C17500ul) obj3;
        if (r10 != null) {
            r14 = r10.Bjb(C26229CvL.A04(-i9, 0, 2, A04));
            if (r14 != null) {
                i3 = r14.A01;
            }
            i3 = 0;
        } else {
            r14 = null;
            i3 = 0;
        }
        int i10 = i9 + i3;
        int max3 = Math.max(max2, AnonymousClass000.A0J(r14));
        Iterator it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (C18070vi.A18(C02610Er.A00((C17500ul) obj4), "Suffix")) {
                break;
            }
        }
        C17500ul r11 = (C17500ul) obj4;
        AnonymousClass0XJ r102 = null;
        if (r11 == null || (r102 = r11.Bjb(C26229CvL.A04(-i10, 0, 2, A04))) == null) {
            i4 = 0;
        } else {
            i4 = r102.A01;
        }
        int max4 = Math.max(max3, AnonymousClass000.A0J(r102));
        int i11 = -(i10 + i4);
        long A05 = C26229CvL.A05(i11, -CG92, A04);
        Iterator it5 = list2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            if (C18070vi.A18(C02610Er.A00((C17500ul) obj5), "Label")) {
                break;
            }
        }
        C17500ul r12 = (C17500ul) obj5;
        if (r12 != null) {
            r6 = r12.Bjb(A05);
            if (r6 != null) {
                i5 = r6.A00;
            }
            i5 = 0;
        } else {
            r6 = null;
            i5 = 0;
        }
        int i12 = i5 + CG9;
        long A052 = C26229CvL.A05(i11, (-i12) - CG92, Constraints.A04(0, 0, 0, 0, 11, j2));
        for (C17500ul r13 : list2) {
            if (C18070vi.A18(C02610Er.A00(r13), "TextField")) {
                AnonymousClass0XJ Bjb = r13.Bjb(A052);
                long A042 = Constraints.A04(0, 0, 0, 0, 14, A052);
                Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it6.next();
                    if (C18070vi.A18(C02610Er.A00((C17500ul) obj6), "Hint")) {
                        break;
                    }
                }
                C17500ul r132 = (C17500ul) obj6;
                if (r132 != null) {
                    r23 = r132.Bjb(A042);
                } else {
                    r23 = null;
                }
                long A043 = C26229CvL.A04(0, -Math.max(max4, Math.max(AnonymousClass000.A0J(Bjb), AnonymousClass000.A0J(r23)) + i12 + CG92), 1, A04);
                int i13 = 0;
                int i14 = 0;
                long A044 = Constraints.A04(0, 0, 0, 0, 11, A043);
                Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it7.next();
                    if (C18070vi.A18(C02610Er.A00((C17500ul) obj7), "Supporting")) {
                        break;
                    }
                }
                C17500ul r8 = (C17500ul) obj7;
                if (r8 != null) {
                    r0 = r8.Bjb(A044);
                    if (r0 != null) {
                        i6 = r0.A00;
                    }
                    i6 = 0;
                } else {
                    r0 = null;
                    i6 = 0;
                }
                if (r5 != null) {
                    i14 = r5.A01;
                }
                if (r9 != null) {
                    i13 = r9.A01;
                }
                int i15 = i14;
                int i16 = i13;
                int A002 = A00(i15, i16, AnonymousClass000.A0K(r14), AnonymousClass000.A0K(r102), Bjb.A01, AnonymousClass000.A0K(r6), AnonymousClass000.A0K(r23), j2);
                int i17 = Bjb.A00;
                if (r6 != null) {
                    i7 = r6.A00;
                } else {
                    i7 = 0;
                }
                AnonymousClass0tB r33 = r31;
                int A012 = A01(r33, r48.BQU(), i17, i7, AnonymousClass000.A0J(r5), AnonymousClass000.A0J(r9), AnonymousClass000.A0J(r14), AnonymousClass000.A0J(r102), AnonymousClass000.A0J(r23), i6, j2, AnonymousClass000.A1P((this.A00 > 1.0f ? 1 : (this.A00 == 1.0f ? 0 : -1))));
                int i18 = A012 - i6;
                for (C17500ul r7 : list2) {
                    if (C18070vi.A18(C02610Er.A00(r7), "Container")) {
                        int i19 = 0;
                        if (A002 != Integer.MAX_VALUE) {
                            i19 = A002;
                        }
                        int i20 = 0;
                        if (i18 != Integer.MAX_VALUE) {
                            i20 = i18;
                        }
                        return r48.BhL(AnonymousClass1D7.A0I(), new C12660m7(this, r48, r6, Bjb, r23, r5, r9, r14, r102, r7.Bjb(C26229CvL.A03(i19, A002, i20, i18)), r0, A002, A012, CG9), A002, A012);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int Bjw(C17740v9 r2, List list, int i) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(list, 1);
        return A02(r2, list, C14630pK.A00, i);
    }

    public int Bjz(C17740v9 r2, List list, int i) {
        C18070vi.A0d(list, 1);
        return A03(list, C14640pL.A00, i);
    }

    public AnonymousClass0X8(AnonymousClass0tB r1, float f, boolean z) {
        this.A02 = z;
        this.A00 = f;
        this.A01 = r1;
    }

    private final int A02(C17740v9 r18, List list, AnonymousClass1OS r20, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (Object next : list) {
            if (C18070vi.A18(AnonymousClass000.A0v(next), "TextField")) {
                Integer valueOf = Integer.valueOf(i);
                AnonymousClass1OS r5 = r20;
                int A0M = AnonymousClass000.A0M(r5.invoke(next, valueOf));
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next2), "Label")) {
                        if (next2 != null) {
                            i2 = AnonymousClass000.A0M(r5.invoke(next2, valueOf));
                        }
                    }
                }
                i2 = 0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next3 = it2.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next3), "Trailing")) {
                        if (next3 != null) {
                            i3 = AnonymousClass000.A0M(r5.invoke(next3, valueOf));
                        }
                    }
                }
                i3 = 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next4 = it3.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next4), "Leading")) {
                        if (next4 != null) {
                            i4 = AnonymousClass000.A0M(r5.invoke(next4, valueOf));
                        }
                    }
                }
                i4 = 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next5 = it4.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next5), "Prefix")) {
                        if (next5 != null) {
                            i5 = AnonymousClass000.A0M(r5.invoke(next5, valueOf));
                        }
                    }
                }
                i5 = 0;
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next6 = it5.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next6), "Suffix")) {
                        if (next6 != null) {
                            i6 = AnonymousClass000.A0M(r5.invoke(next6, valueOf));
                        }
                    }
                }
                i6 = 0;
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next7 = it6.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next7), "Hint")) {
                        if (next7 != null) {
                            i7 = AnonymousClass000.A0M(r5.invoke(next7, valueOf));
                        }
                    }
                }
                i7 = 0;
                Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next8 = it7.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next8), "Supporting")) {
                        if (next8 != null) {
                            i8 = AnonymousClass000.A0M(r5.invoke(next8, valueOf));
                        }
                    }
                }
                i8 = 0;
                boolean A1P = AnonymousClass000.A1P((this.A00 > 1.0f ? 1 : (this.A00 == 1.0f ? 0 : -1)));
                long j = AnonymousClass0PE.A00;
                return A01(this.A01, r18.BQU(), A0M, i2, i4, i3, i5, i6, i7, i8, j, A1P);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final int A03(List list, AnonymousClass1OS r12, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        for (Object next : list) {
            if (C18070vi.A18(AnonymousClass000.A0v(next), "TextField")) {
                Integer valueOf = Integer.valueOf(i);
                int A0M = AnonymousClass000.A0M(r12.invoke(next, valueOf));
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next2), "Label")) {
                        if (next2 != null) {
                            i2 = AnonymousClass000.A0M(r12.invoke(next2, valueOf));
                        }
                    }
                }
                i2 = 0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next3 = it2.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next3), "Trailing")) {
                        if (next3 != null) {
                            i3 = AnonymousClass000.A0M(r12.invoke(next3, valueOf));
                        }
                    }
                }
                i3 = 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next4 = it3.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next4), "Prefix")) {
                        if (next4 != null) {
                            i4 = AnonymousClass000.A0M(r12.invoke(next4, valueOf));
                        }
                    }
                }
                i4 = 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next5 = it4.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next5), "Suffix")) {
                        if (next5 != null) {
                            i5 = AnonymousClass000.A0M(r12.invoke(next5, valueOf));
                        }
                    }
                }
                i5 = 0;
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next6 = it5.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next6), "Leading")) {
                        if (next6 != null) {
                            i6 = AnonymousClass000.A0M(r12.invoke(next6, valueOf));
                        }
                    }
                }
                i6 = 0;
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next7 = it6.next();
                    if (C18070vi.A18(AnonymousClass000.A0v(next7), "Hint")) {
                        if (next7 != null) {
                            i7 = AnonymousClass000.A0M(r12.invoke(next7, valueOf));
                        }
                    }
                }
                i7 = 0;
                return A00(i6, i3, i4, i5, A0M, i2, i7, AnonymousClass0PE.A00);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
