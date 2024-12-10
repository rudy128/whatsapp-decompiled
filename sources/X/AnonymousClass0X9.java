package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.0X9  reason: invalid class name */
public final class AnonymousClass0X9 implements C16870tM {
    public final float A00;
    public final AnonymousClass0tB A01;
    public final boolean A02;
    public final C22821Di A03;

    public static final int A01(AnonymousClass0tB r2, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z) {
        int i8 = i3 + i4;
        int i9 = i5 + i8;
        int i10 = i7 + i8;
        int i11 = 0;
        int i12 = 0;
        if (z) {
            i12 = i6;
        }
        int max = i + Math.max(i9, Math.max(i10, i12)) + i2;
        if (!z) {
            C24246By4 by4 = C24246By4.Ltr;
            i11 = i6 + C22339B3q.A01((r2.BDp(by4) + r2.BDx(by4)) * f);
        }
        return Math.max(max, Math.max(i11, Constraints.A03(j)));
    }

    public int BjA(C17740v9 r2, List list, int i) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(list, 1);
        return A02(r2, list, C14570pE.A00, i);
    }

    public int BjD(C17740v9 r2, List list, int i) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(list, 1);
        return A03(r2, list, C14580pF.A00, i);
    }

    public C16820tH BjZ(C17530uo r42, List list, long j) {
        Object obj;
        AnonymousClass0XJ r5;
        int i;
        int i2;
        Object obj2;
        AnonymousClass0XJ r19;
        int i3;
        Object obj3;
        AnonymousClass0XJ r12;
        int i4;
        Object obj4;
        AnonymousClass0XJ r11;
        int i5;
        Object obj5;
        AnonymousClass0XJ r6;
        int i6;
        Object obj6;
        AnonymousClass0XJ r24;
        Object obj7;
        AnonymousClass0XJ r0;
        int i7;
        int i8;
        C17530uo r8 = r42;
        C18070vi.A0d(r8, 0);
        List<C17500ul> list2 = list;
        C18070vi.A0d(list2, 1);
        AnonymousClass0tB r20 = this.A01;
        int CG9 = r8.CG9(r20.BDk());
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
                i = r5.A01;
                i2 = r5.A00;
            }
            i = 0;
            i2 = 0;
        } else {
            r5 = null;
            i = 0;
            i2 = 0;
        }
        int max = Math.max(0, i2);
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
        C17500ul r10 = (C17500ul) obj2;
        if (r10 != null) {
            r19 = r10.Bjb(C26229CvL.A04(-i, 0, 2, A04));
            if (r19 != null) {
                i3 = r19.A01;
            }
            i3 = 0;
        } else {
            r19 = null;
            i3 = 0;
        }
        int i9 = i + i3;
        int max2 = Math.max(max, AnonymousClass000.A0J(r19));
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
        C17500ul r102 = (C17500ul) obj3;
        if (r102 != null) {
            r12 = r102.Bjb(C26229CvL.A04(-i9, 0, 2, A04));
            if (r12 != null) {
                i4 = r12.A01;
            }
            i4 = 0;
        } else {
            r12 = null;
            i4 = 0;
        }
        int i10 = i9 + i4;
        int max3 = Math.max(max2, AnonymousClass000.A0J(r12));
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
        C17500ul r103 = (C17500ul) obj4;
        if (r103 != null) {
            r11 = r103.Bjb(C26229CvL.A04(-i10, 0, 2, A04));
            if (r11 != null) {
                i5 = r11.A01;
            }
            i5 = 0;
        } else {
            r11 = null;
            i5 = 0;
        }
        int i11 = i10 + i5;
        int max4 = Math.max(max3, AnonymousClass000.A0J(r11));
        boolean z = false;
        if (this.A00 < 1.0f) {
            z = true;
        }
        int CG92 = r8.CG9(r20.BDp(r8.getLayoutDirection())) + r8.CG9(r20.BDx(r8.getLayoutDirection()));
        int i12 = -CG92;
        if (z) {
            i12 = (-i11) - CG92;
        }
        int i13 = -CG9;
        long A05 = C26229CvL.A05(i12, i13, A04);
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
        C17500ul r13 = (C17500ul) obj5;
        if (r13 != null) {
            r6 = r13.Bjb(A05);
            if (r6 != null) {
                this.A03.invoke(new AnonymousClass0QG(AnonymousClass001.A0p((float) r6.A01, (float) r6.A00)));
                i6 = r6.A00;
            }
            i6 = 0;
        } else {
            r6 = null;
            i6 = 0;
        }
        int max5 = Math.max(i6 / 2, r8.CG9(r20.BE0()));
        long A042 = Constraints.A04(0, 0, 0, 0, 11, C26229CvL.A05(-i11, i13 - max5, j2));
        for (C17500ul r132 : list2) {
            if (C18070vi.A18(C02610Er.A00(r132), "TextField")) {
                AnonymousClass0XJ Bjb = r132.Bjb(A042);
                long A043 = Constraints.A04(0, 0, 0, 0, 14, A042);
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
                C17500ul r133 = (C17500ul) obj6;
                if (r133 != null) {
                    r24 = r133.Bjb(A043);
                } else {
                    r24 = null;
                }
                long A044 = Constraints.A04(0, 0, 0, 0, 11, C26229CvL.A04(0, -Math.max(max4, Math.max(AnonymousClass000.A0J(Bjb), AnonymousClass000.A0J(r24)) + max5 + CG9), 1, A04));
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
                C17500ul r4 = (C17500ul) obj7;
                if (r4 != null) {
                    r0 = r4.Bjb(A044);
                    if (r0 != null) {
                        i7 = r0.A00;
                    }
                    i7 = 0;
                } else {
                    r0 = null;
                    i7 = 0;
                }
                AnonymousClass0tB r25 = r20;
                int A012 = A01(r25, r8.BQU(), AnonymousClass000.A0K(r5), AnonymousClass000.A0K(r19), AnonymousClass000.A0K(r12), AnonymousClass000.A0K(r11), Bjb.A01, AnonymousClass000.A0K(r6), AnonymousClass000.A0K(r24), j2, z);
                if (r5 != null) {
                    i8 = r5.A00;
                } else {
                    i8 = 0;
                }
                int A002 = A00(r25, r8.BQU(), i8, AnonymousClass000.A0J(r19), AnonymousClass000.A0J(r12), AnonymousClass000.A0J(r11), Bjb.A00, AnonymousClass000.A0J(r6), AnonymousClass000.A0J(r24), AnonymousClass000.A0J(r0), j2);
                int i14 = A002 - i7;
                for (C17500ul r7 : list2) {
                    if (C18070vi.A18(C02610Er.A00(r7), "Container")) {
                        int i15 = 0;
                        if (A012 != Integer.MAX_VALUE) {
                            i15 = A012;
                        }
                        int i16 = 0;
                        if (i14 != Integer.MAX_VALUE) {
                            i16 = i14;
                        }
                        return r8.BhL(AnonymousClass1D7.A0I(), new C12650m6(this, r8, r5, r19, r12, r11, Bjb, r6, r24, r7.Bjb(C26229CvL.A03(i15, A012, i16, i14)), r0, A002, A012), A012, A002);
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
        return A02(r2, list, C14590pG.A00, i);
    }

    public int Bjz(C17740v9 r2, List list, int i) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(list, 1);
        return A03(r2, list, C14600pH.A00, i);
    }

    public AnonymousClass0X9(AnonymousClass0tB r1, C22821Di r2, float f, boolean z) {
        this.A03 = r2;
        this.A02 = z;
        this.A00 = f;
        this.A01 = r1;
    }

    public static final int A00(AnonymousClass0tB r4, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        int A022 = Constraints.A02(j);
        int[] iArr = {i2, i3, i4, C22339B3q.A01(((float) Math.max(i5, i7)) + (r4.BDk() * f) + Math.max(r4.BE0() * f, ((float) i6) / 2.0f))};
        int i9 = 0;
        do {
            i = Math.max(i, iArr[i9]);
            i9++;
        } while (i9 < 4);
        return Math.max(A022, i + i8);
    }

    private final int A02(C17740v9 r17, List list, AnonymousClass1OS r19, int i) {
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
                AnonymousClass1OS r5 = r19;
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
                long j = AnonymousClass0PE.A00;
                return A00(this.A01, r17.BQU(), i4, i3, i5, i6, A0M, i2, i7, i8, j);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int A03(C17740v9 r17, List list, AnonymousClass1OS r19, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        for (Object next : list) {
            if (C18070vi.A18(AnonymousClass000.A0v(next), "TextField")) {
                Integer valueOf = Integer.valueOf(i);
                AnonymousClass1OS r5 = r19;
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
                boolean z = false;
                if (this.A00 < 1.0f) {
                    z = true;
                }
                long j = AnonymousClass0PE.A00;
                return A01(this.A01, r17.BQU(), i4, i3, i5, i6, A0M, i2, i7, j, z);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
