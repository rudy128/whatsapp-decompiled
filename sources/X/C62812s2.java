package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2s2  reason: invalid class name and case insensitive filesystem */
public abstract class C62812s2 {
    public static C60002nE A00(C59482mN r5) {
        int i;
        UserJid A02 = C22941Dw.A02(r5.A02);
        C17960vV.A07(A02);
        String str = A02.user;
        if (A02 instanceof AnonymousClass1E2) {
            i = 1;
        } else if (A02 instanceof AnonymousClass1ED) {
            i = 2;
        } else {
            i = 0;
            if (A02 instanceof C42711yc) {
                i = 3;
            }
        }
        C60002nE r1 = new C60002nE(r5.A01, str, i, r5.A00);
        if (r5 instanceof AnonymousClass3K2) {
            return new AnonymousClass2DV(r1);
        }
        return r1;
    }

    public static C59482mN A01(C60002nE r4) {
        String str;
        int i = r4.A01;
        if (i == 1) {
            str = "lid";
        } else if (i == 2) {
            str = "interop";
        } else if (i != 3) {
            str = "s.whatsapp.net";
        } else {
            str = "bot";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r4.A03);
        C59482mN r1 = new C59482mN(r4.A02, C17890vO.A0Z(str, A10, '@'), r4.A00);
        if (!(r4 instanceof AnonymousClass2DV)) {
            return r1;
        }
        return new C59482mN(r1.A01, r1.A02, r1.A00);
    }

    public static C58462kj A02(C59982nC r3) {
        return new C58462kj(r3.A01, A01(r3.A00));
    }
}
