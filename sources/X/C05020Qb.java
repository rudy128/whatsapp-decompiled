package X;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.0Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C05020Qb {
    public static final Object A00 = new AnonymousClass0JG("compositionLocalMap");
    public static final Object A01 = new AnonymousClass0JG("provider");
    public static final Object A02 = new AnonymousClass0JG("provider");
    public static final Object A03 = new AnonymousClass0JG("providers");
    public static final Object A04 = new AnonymousClass0JG("reference");
    public static final Comparator A05 = new C06690Zh(0);

    public static final int A00(AnonymousClass0Jr r1, AnonymousClass0Jr r2) {
        return C18070vi.A00(r1.A01, r2.A01);
    }

    public static final void A04(C15750r8 r10, AnonymousClass0Qu r11) {
        Object obj;
        int i = r11.A00;
        int i2 = r11.A01;
        while (i < i2) {
            int A012 = AnonymousClass0Qu.A01(r11, i);
            int[] iArr = r11.A0G;
            if (C04780Ot.A03(iArr, A012)) {
                Object[] objArr = r11.A0H;
                int A032 = AnonymousClass0Qu.A03(r11, iArr, A012);
                if (A032 >= r11.A0B) {
                    A032 += r11.A09;
                }
                obj = objArr[A032];
            } else {
                obj = null;
            }
            if (obj instanceof AnonymousClass0t2) {
                ((C05670Vg) r10).A01.add(obj);
            }
            int A013 = AnonymousClass0Qu.A01(r11, i);
            int[] iArr2 = r11.A0G;
            int A052 = AnonymousClass0Qu.A05(r11, iArr2, A013);
            int i3 = i + 1;
            int A022 = AnonymousClass0Qu.A02(r11, iArr2, i3);
            for (int i4 = A052; i4 < A022; i4++) {
                int i5 = i4 - A052;
                Object[] objArr2 = r11.A0H;
                int i6 = i4;
                if (i4 >= r11.A0B) {
                    i6 = i4 + r11.A09;
                }
                Object obj2 = objArr2[i6];
                if (obj2 instanceof C02030Cj) {
                    AnonymousClass0t3 r6 = ((C02030Cj) obj2).A00;
                    if (r6 instanceof C17310uS) {
                        continue;
                    } else if (obj2 == r11.A0P(AnonymousClass0MH.A00, i, i5)) {
                        ((C05670Vg) r10).A01.add(r6);
                    } else {
                        A06("Slot table is out of sync");
                        throw null;
                    }
                } else if (!(obj2 instanceof C05660Vf)) {
                    continue;
                } else if (obj2 == r11.A0P(AnonymousClass0MH.A00, i, i5)) {
                    ((C05660Vf) obj2).A01();
                } else {
                    A06("Slot table is out of sync");
                    throw null;
                }
            }
            i = i3;
        }
    }

    public static final void A08(boolean z) {
        if (!z) {
            A06("Check failed");
            throw null;
        }
    }

    public static final int A01(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int A002 = C18070vi.A00(((AnonymousClass0Jr) list.get(i3)).A01, i);
            if (A002 < 0) {
                i2 = i3 + 1;
            } else if (A002 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final Object A02(Object obj, HashMap hashMap) {
        Object A0Y;
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet == null || (A0Y = C29431cG.A0Y(linkedHashSet)) == null) {
            return null;
        }
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(obj);
        if (abstractCollection != null) {
            abstractCollection.remove(A0Y);
            if (abstractCollection.isEmpty()) {
                hashMap.remove(obj);
            }
        }
        return A0Y;
    }

    public static final void A03(C05660Vf r3, Object obj, List list, int i) {
        int A012 = A01(list, i);
        C06990aB r2 = null;
        if (A012 < 0) {
            int i2 = -(A012 + 1);
            if (obj != null) {
                r2 = new C06990aB();
                r2.add(obj);
            }
            list.add(i2, new AnonymousClass0Jr(r3, r2, i));
            return;
        }
        AnonymousClass0Jr r0 = (AnonymousClass0Jr) list.get(A012);
        if (obj == null) {
            r0.A01();
            return;
        }
        C06990aB A002 = r0.A00();
        if (A002 != null) {
            A002.add(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.0NQ, X.071] */
    public static final void A05(C15750r8 r6, AnonymousClass0Qu r7) {
        int A0R;
        C06760Zo A0O = r7.A0O();
        while (A0O.hasNext()) {
            Object next = A0O.next();
            if (next instanceof AnonymousClass0t2) {
                C05670Vg r4 = (C05670Vg) r6;
                AnonymousClass071 r2 = r4.A00;
                AnonymousClass071 r22 = r2;
                if (r2 == null) {
                    AnonymousClass071 r0 = C02850Fq.A00;
                    ? r23 = new AnonymousClass0NQ();
                    AnonymousClass070 r02 = AnonymousClass0GO.A01;
                    AnonymousClass071.A02(r23, 6);
                    r4.A00 = r23;
                    r22 = r23;
                }
                r22.A03[AnonymousClass071.A01(r22, next)] = next;
                r4.A01.add(next);
            }
            if (next instanceof C02030Cj) {
                ((C05670Vg) r6).A01.add(((C02030Cj) next).A00);
            }
            if (next instanceof C05660Vf) {
                ((C05660Vf) next).A01();
            }
        }
        if (r7.A06 == 0) {
            int i = r7.A00;
            int i2 = r7.A02;
            int A012 = AnonymousClass0Qu.A01(r7, i);
            int[] iArr = r7.A0G;
            int i3 = A012 * 5;
            int i4 = iArr[i3 + 3] + i;
            r7.A00 = i4;
            r7.A02 = AnonymousClass0Qu.A02(r7, iArr, i4);
            if (C04780Ot.A03(iArr, A012)) {
                A0R = 1;
            } else {
                A0R = AnonymousClass000.A0R(iArr, i3);
            }
            AnonymousClass0Qu.A0C(r7, r7.A08);
            AnonymousClass0N8 r1 = r7.A0C;
            if (r1 != null) {
                while (AnonymousClass000.A1a(r1.A00) && r1.A00() >= i) {
                    r1.A01();
                }
            }
            AnonymousClass0Qu.A0L(r7, i, r7.A00 - i);
            AnonymousClass0Qu.A0G(r7, i2, r7.A02 - i2, i - 1);
            r7.A00 = i;
            r7.A02 = i2;
            r7.A07 -= A0R;
            return;
        }
        A06("Cannot remove group while inserting");
        throw null;
    }

    public static final void A06(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        A10.append(str);
        throw new AnonymousClass0CZ(AnonymousClass000.A0y("). Please report to Google or use https://goo.gle/compose-feedback", A10));
    }

    public static final void A07(List list, int i, int i2) {
        int A012 = A01(list, i);
        if (A012 < 0) {
            A012 = -(A012 + 1);
        }
        while (A012 < list.size() && ((AnonymousClass0Jr) list.get(A012)).A01 < i2) {
            list.remove(A012);
        }
    }
}
