package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2sO  reason: invalid class name and case insensitive filesystem */
public final class C63032sO {
    public final AnonymousClass190 A00;
    public final C18030ve A01;

    public static final List A01(C23141Ev r2, String str) {
        String A002 = C28341Zz.A00(r2, str, "");
        if (A002 == null) {
            return C18460wS.A00;
        }
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = ",";
        List A0S = AnonymousClass1YF.A0S(A002, A1Y, 0);
        ArrayList A0D = C29351c6.A0D(A0S);
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            A0D.add(AnonymousClass1YF.A0I(C17880vN.A0v(it)));
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = A0D.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                A13.add(next);
            }
        }
        return A13;
    }

    public C63032sO(AnonymousClass190 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final String A00(String str) {
        Locale locale = Locale.getDefault();
        C18070vi.A0X(locale);
        String lowerCase = str.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        return AnonymousClass1YE.A07(AnonymousClass1YE.A07(new C41661wr("\\s*").A00(lowerCase, ""), "ifnotexists", "", false), ";", "", false);
    }
}
