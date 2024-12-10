package X;

/* renamed from: X.07f  reason: invalid class name and case insensitive filesystem */
public final class C011207f extends AnonymousClass0PV {
    public static final C011207f A00 = new C011207f();

    public C011207f() {
        super(1, 0);
    }

    public String A04(int i) {
        if (i == 0) {
            return "distance";
        }
        return super.A04(i);
    }

    public void A06(C16270rz r4, C15750r8 r5, AnonymousClass0Qu r6, AnonymousClass0r9 r7) {
        String str;
        C05840Vx r72 = (C05840Vx) r7;
        int i = r72.A03.A05[r72.A00];
        if (i < 0) {
            str = "Cannot seek backwards";
        } else if (r6.A06 > 0) {
            throw AnonymousClass000.A0n("Cannot call seek() while inserting");
        } else if (i != 0) {
            int i2 = r6.A00 + i;
            int i3 = r6.A08;
            if (i2 < i3 || i2 > r6.A01) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Cannot seek outside the current group (");
                A10.append(i3);
                A10.append('-');
                str = AnonymousClass001.A1L(A10, r6.A01);
            } else {
                r6.A00 = i2;
                int A02 = AnonymousClass0Qu.A02(r6, r6.A0G, i2);
                r6.A02 = A02;
                r6.A03 = A02;
                return;
            }
        } else {
            return;
        }
        C05020Qb.A06(str);
        throw null;
    }
}
