package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Qg  reason: invalid class name and case insensitive filesystem */
public final class C05060Qg {
    public boolean A00;
    public C05060Qg A01;
    public final int A02;
    public final AnonymousClass0XV A03;
    public final C06370Yb A04;
    public final boolean A05;
    public final AnonymousClass0XW A06;

    private final void A07(List list) {
        List A0K = A0K(false);
        int size = A0K.size();
        for (int i = 0; i < size; i++) {
            C05060Qg r1 = (C05060Qg) A0K.get(i);
            if (r1.A05 && r1.A04.A0A()) {
                list.add(r1);
            } else if (!r1.A04.A09()) {
                r1.A07(list);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x005b A[EDGE_INSN: B:36:0x005b->B:29:0x005b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C17660v1 A01(X.AnonymousClass0XV r7) {
        /*
            X.0QR r0 = r7.A0S
            X.0XW r5 = r0.A01
            int r0 = r5.A00
            r0 = r0 & 8
            r4 = 0
            if (r0 == 0) goto L_0x0021
        L_0x000b:
            int r0 = r5.A01
            r0 = r0 & 8
            if (r0 == 0) goto L_0x005b
            r7 = r5
            r6 = r4
        L_0x0013:
            boolean r0 = r7 instanceof X.C17660v1
            if (r0 == 0) goto L_0x0024
            r0 = r7
            X.0v1 r0 = (X.C17660v1) r0
            boolean r0 = r0.BZC()
            if (r0 == 0) goto L_0x0054
            r4 = r7
        L_0x0021:
            X.0v1 r4 = (X.C17660v1) r4
            return r4
        L_0x0024:
            int r0 = r7.A01
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0054
            boolean r0 = r7 instanceof X.C014308l
            if (r0 == 0) goto L_0x0054
            r0 = r7
            X.08l r0 = (X.C014308l) r0
            X.0XW r3 = r0.A00
            r2 = 0
        L_0x0034:
            r1 = 1
            if (r3 == 0) goto L_0x0051
            int r0 = r3.A01
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0042
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x0045
            r7 = r3
        L_0x0042:
            X.0XW r3 = r3.A02
            goto L_0x0034
        L_0x0045:
            X.0a9 r6 = X.AnonymousClass001.A0z(r6)
            X.0XW r7 = X.AnonymousClass000.A0d(r6, r7)
            r6.A0F(r3)
            goto L_0x0042
        L_0x0051:
            if (r2 != r1) goto L_0x0054
            goto L_0x0058
        L_0x0054:
            X.0XW r7 = X.AnonymousClass0QV.A00(r6)
        L_0x0058:
            if (r7 == 0) goto L_0x005b
            goto L_0x0013
        L_0x005b:
            int r0 = r5.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0021
            X.0XW r5 = r5.A02
            if (r5 == 0) goto L_0x0021
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05060Qg.A01(X.0XV):X.0v1");
    }

    private final C05060Qg A02(AnonymousClass0JM r8, C22821Di r9) {
        int i;
        C06370Yb r6 = new C06370Yb();
        r6.A07(false);
        r6.A06(false);
        r9.invoke(r6);
        AnonymousClass09R r4 = new AnonymousClass09R(r9);
        int i2 = this.A02;
        if (r8 != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        C05060Qg r0 = new C05060Qg(r4, new AnonymousClass0XV(true, i2 + i), r6, false);
        r0.A00 = true;
        r0.A01 = this;
        return r0;
    }

    public static final List A03(C05060Qg r1, boolean z, boolean z2) {
        if (!z && r1.A04.A09()) {
            return AnonymousClass1ZU.A09();
        }
        if (!r1.A05 || !r1.A04.A0A()) {
            return r1.A0K(z2);
        }
        ArrayList A13 = AnonymousClass000.A13();
        r1.A07(A13);
        return A13;
    }

    private final void A05(C06370Yb r6) {
        if (!this.A04.A09()) {
            List A0K = A0K(false);
            int size = A0K.size();
            for (int i = 0; i < size; i++) {
                C05060Qg r1 = (C05060Qg) A0K.get(i);
                if (!r1.A05 || !r1.A04.A0A()) {
                    r6.A05(r1.A04);
                    r1.A05(r6);
                }
            }
        }
    }

    private final void A06(List list) {
        List list2;
        String str;
        C06370Yb r2 = this.A04;
        AnonymousClass0JM r1 = (AnonymousClass0JM) AnonymousClass0FY.A00(r2, C03150Gu.A0J);
        if (r1 != null && r2.A0A() && AnonymousClass000.A1a(list)) {
            list.add(A02(r1, new C10080hl(r1)));
        }
        AnonymousClass0PS r12 = C03150Gu.A02;
        if (r2.A0B(r12) && AnonymousClass000.A1a(list) && r2.A0A() && (list2 = (List) AnonymousClass0FY.A00(r2, r12)) != null && (str = (String) C29431cG.A0c(list2)) != null) {
            list.add(0, A02((AnonymousClass0JM) null, new C10090hm(str)));
        }
    }

    public static boolean A08(C05060Qg r0, Map map) {
        return map.containsKey(Integer.valueOf(r0.A02));
    }

    public final AnonymousClass0NU A0E() {
        C15830rH r0;
        C06370Yb r1 = this.A04;
        if (!r1.A0A() || (r0 = A01(this.A03)) == null) {
            r0 = this.A06;
        }
        AnonymousClass0XW r2 = ((AnonymousClass0XW) r0).A03;
        boolean A1W = AnonymousClass000.A1W(AnonymousClass0FY.A00(r1, C03120Gr.A09));
        if (!r2.A03.A07) {
            return AnonymousClass0NU.A04;
        }
        C01850Ad A042 = AnonymousClass0QV.A04(r2, 8);
        if (!A1W) {
            return AnonymousClass0LN.A01(A042).Bhs(A042, true);
        }
        return A042.A0s();
    }

    public final C01850Ad A0F() {
        if (this.A00) {
            C05060Qg A0J = A0J();
            if (A0J != null) {
                return A0J.A0F();
            }
            return null;
        }
        C15830rH A012 = A01(this.A03);
        if (A012 == null) {
            A012 = this.A06;
        }
        return AnonymousClass0QV.A04(A012, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A04.A0A() == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C06370Yb A0G() {
        /*
            r2 = this;
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x000d
            X.0Yb r0 = r2.A04
            boolean r0 = r0.A0A()
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            X.0Yb r0 = r2.A04
            if (r1 == 0) goto L_0x0019
            X.0Yb r0 = r0.A00()
            r2.A05(r0)
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05060Qg.A0G():X.0Yb");
    }

    public final C05060Qg A0I() {
        return new C05060Qg(this.A06, this.A03, this.A04, true);
    }

    public final C05060Qg A0J() {
        AnonymousClass0XV r0;
        C05060Qg r02 = this.A01;
        if (r02 != null) {
            return r02;
        }
        boolean z = this.A05;
        if ((!z || (r0 = A00(this.A03, C12420lj.A00)) == null) && (r0 = A00(this.A03, C12430lk.A00)) == null) {
            return null;
        }
        return AnonymousClass0FZ.A00(r0, z);
    }

    public final List A0K(boolean z) {
        if (this.A00) {
            return AnonymousClass1ZU.A09();
        }
        ArrayList A13 = AnonymousClass000.A13();
        A04(this.A03, A13);
        if (z) {
            A06(A13);
        }
        return A13;
    }

    public final boolean A0M() {
        if (this.A00 || !A03(this, false, true).isEmpty() || A00(this.A03, C12410li.A00) != null) {
            return false;
        }
        return true;
    }

    public C05060Qg(AnonymousClass0XW r2, AnonymousClass0XV r3, C06370Yb r4, boolean z) {
        this.A06 = r2;
        this.A05 = z;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r3.A01;
    }

    public static final AnonymousClass0XV A00(AnonymousClass0XV r1, C22821Di r2) {
        do {
            r1 = r1.A0I();
            if (r1 == null) {
                return null;
            }
        } while (!AnonymousClass000.A1Y(r2.invoke(r1)));
        return r1;
    }

    private final void A04(AnonymousClass0XV r7, List list) {
        C06970a9 A0E = r7.A0E();
        int i = A0E.A00;
        if (i > 0) {
            Object[] objArr = A0E.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i2];
                if (r2.A08 != null) {
                    if (AnonymousClass000.A1O(8 & r2.A0S.A01.A00)) {
                        list.add(AnonymousClass0FZ.A00(r2, this.A05));
                    } else {
                        A04(r2, list);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final long A09() {
        C01850Ad A0F = A0F();
        if (A0F == null || !A0F.Be8()) {
            return AnonymousClass0QY.A03;
        }
        return A0F.Bhu(AnonymousClass0QY.A03);
    }

    public final long A0A() {
        C01850Ad A0F = A0F();
        if (A0F != null) {
            return A0F.A03;
        }
        return 0;
    }

    public final AnonymousClass0NU A0B() {
        C01850Ad A0F;
        C05060Qg A0J = A0J();
        if (A0J == null || (A0F = A0F()) == null || !A0F.Be8()) {
            return AnonymousClass0NU.A04;
        }
        return AnonymousClass0QV.A04(A0J.A06, 8).Bhs(A0F, true);
    }

    public final AnonymousClass0NU A0C() {
        C01850Ad A0F = A0F();
        if (A0F == null || !A0F.Be8()) {
            return AnonymousClass0NU.A04;
        }
        return AnonymousClass0LN.A01(A0F).Bhs(A0F, true);
    }

    public final AnonymousClass0NU A0D() {
        C01850Ad A0F = A0F();
        if (A0F == null || !A0F.Be8()) {
            return AnonymousClass0NU.A04;
        }
        return AnonymousClass0LN.A00(A0F);
    }

    public final C06370Yb A0H() {
        return this.A04;
    }

    public final boolean A0L() {
        C01850Ad A0F = A0F();
        if (A0F != null) {
            return A0F.A1L();
        }
        return false;
    }
}
