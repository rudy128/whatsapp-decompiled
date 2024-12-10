package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.72A  reason: invalid class name */
public final class AnonymousClass72A {
    public static final List A05;
    public final AnonymousClass1M9 A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass00H A04;

    static {
        AnonymousClass6RD[] r2 = new AnonymousClass6RD[4];
        r2[0] = AnonymousClass6RD.AGENT_TOS;
        r2[1] = AnonymousClass6RD.INVOKE_TOS;
        r2[2] = AnonymousClass6RD.META_AI_SHORTCUT_TOS;
        A05 = C18070vi.A0O(AnonymousClass6RD.AI_STUDIO_TOS, r2, 3);
    }

    public final boolean A03(int i) {
        if (i == 1) {
            C18030ve r2 = this.A01;
            C18040vf r1 = C18040vf.A02;
            if (!C18020vd.A05(r1, r2, 4873) || !C18020vd.A05(r1, r2, 5747) || C18070vi.A18(A01(), "yes")) {
                return false;
            }
            return true;
        } else if (i != 2 || C18070vi.A18(A01(), "yes")) {
            return false;
        } else {
            if (C18020vd.A05(C18040vf.A02, this.A01, 5587)) {
                return true;
            }
            return false;
        }
    }

    public final String A01() {
        return (String) ((AnonymousClass1H7) ((C138616xO) this.A02.get()).A04.getValue()).A01();
    }

    public final boolean A02() {
        List<AnonymousClass6RD> list = A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass6RD A052 : list) {
                if (((C38761rq) this.A04.get()).A05(A052)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass72A(AnonymousClass1M9 r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r10.A01();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass1E7 r9, X.AnonymousClass72A r10) {
        /*
            boolean r0 = r9.A0C()
            r8 = 0
            if (r0 == 0) goto L_0x0061
            int r0 = r9.A00
            boolean r0 = r10.A03(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r2 = r10.A01()
            int r1 = r2.hashCode()
            r0 = 3507(0xdb3, float:4.914E-42)
            if (r1 == r0) goto L_0x0061
            r0 = 3521(0xdc1, float:4.934E-42)
            if (r1 == r0) goto L_0x0062
            r0 = 119527(0x1d2e7, float:1.67493E-40)
            if (r1 == r0) goto L_0x0061
            r0 = 111442729(0x6a47b29, float:6.187091E-35)
            if (r1 != r0) goto L_0x0061
            java.lang.String r0 = "unset"
        L_0x002b:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0061
            long r6 = java.lang.System.currentTimeMillis()
            X.00H r0 = r10.A02
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r1 = X.C138616xO.A00(r0)
            java.lang.String r0 = "consent_last_dismissed_timestamp"
            long r4 = X.C17890vO.A04(r1, r0)
            X.0ve r2 = r10.A01
            r1 = 5746(0x1672, float:8.052E-42)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r2, r1)
            r1 = 0
            r8 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0061
            if (r3 < 0) goto L_0x0065
            long r6 = r6 - r4
            long r1 = X.C17890vO.A03(r3)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
        L_0x0061:
            return r8
        L_0x0062:
            java.lang.String r0 = "no"
            goto L_0x002b
        L_0x0065:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72A.A00(X.1E7, X.72A):boolean");
    }
}
