package X;

import java.util.ArrayList;

/* renamed from: X.2ti  reason: invalid class name and case insensitive filesystem */
public final class C63802ti {
    public static final C63802ti A00 = new Object();

    public static final C48262Lu A00(C18030ve r16, boolean z) {
        C40841vM r4;
        int i = 358;
        boolean z2 = z;
        if (z) {
            i = 357;
        }
        C18040vf r1 = C18040vf.A02;
        C18030ve r2 = r16;
        int A002 = C18020vd.A00(r1, r2, i);
        if (A002 == 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GreenAlertUtils/buildModal/dismissible: ");
            A10.append(z2);
            C17890vO.A1A(A10, ", no start time received");
            return null;
        }
        if (!z) {
            A002 += C18020vd.A00(r1, r2, 365);
        }
        C24521Kq r0 = C24521Kq.$redex_init_class;
        if (z) {
            r4 = new C40841vM(new long[]{86400000}, -1);
        } else {
            r4 = null;
        }
        C40861vP r6 = new C40861vP(r4, new C40831vL(C17890vO.A03(A002)), (C40831vL) null, "onDemand");
        String str = null;
        ArrayList A13 = AnonymousClass000.A13();
        if (z2) {
            str = "";
        }
        return new C48262Lu(r6, (AnonymousClass4DO) null, (AnonymousClass4DP) null, "", "", "", "", "", (String) null, (String) null, str, A13);
    }

    public static final boolean A03(C33451iq r2) {
        C63592tN A002;
        C33431io r1 = r2.A03;
        if (r1.A00() == null || (A002 = r1.A00()) == null || A002.A00 != 4) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C18030ve r3, int i) {
        if (!AnonymousClass1YE.A0A(String.valueOf(i), "202102", false) || C18020vd.A05(C18040vf.A02, r3, 344)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C18030ve r3, C63592tN r4) {
        if (!AnonymousClass1YE.A0A(String.valueOf(r4.A01), "202102", C18070vi.A15(r3, r4)) || !C18020vd.A05(C18040vf.A02, r3, 344)) {
            return false;
        }
        return true;
    }
}
