package X;

/* renamed from: X.36T  reason: invalid class name */
public final class AnonymousClass36T implements C22520BBd {
    public String BS2(AnonymousClass206 r6) {
        String str;
        if (!C20097A7a.A05(r6)) {
            return null;
        }
        C194599rz r0 = r6.A0M.A00;
        String str2 = "";
        if (r0 == null) {
            str = str2;
        } else {
            str = r0.A00;
            str2 = r0.A01;
        }
        String A0P = r6.A0P();
        if (!(A0P == null || A0P.length() == 0)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(r6.A0P());
            str = C17890vO.A0Z(str, A10, ' ');
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return C17890vO.A0Z(str2, AnonymousClass000.A11(str), ' ');
    }

    public String BVQ(AnonymousClass206 r2) {
        if (C20097A7a.A05(r2)) {
            return C20097A7a.A01(r2);
        }
        return null;
    }
}
