package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public final class ASP implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r6) {
        C18070vi.A0h(r6, a2m);
        Class<AnonymousClass24F> cls = AnonymousClass24F.class;
        if (!(r6 instanceof AnonymousClass24F)) {
            String A0U = C17890vO.A0U(r6);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r6, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass8X8 r2 = a2m.A00;
        C163898Wt A01 = AnonymousClass8X8.A01(r2);
        A01.A0G(C179839Kc.REQUEST_WELCOME_MESSAGE);
        r2.A0N(A01);
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A01 = C20077A6d.A01(a6d);
        if (!AnonymousClass000.A1O(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        C166368cm A0I = AnonymousClass8BS.A0I(A01);
        if ((A0I.bitField0_ & 2) == 0 || A0I.A0R() != C179839Kc.REQUEST_WELCOME_MESSAGE) {
            return null;
        }
        return new AnonymousClass206(a6d.A0A, 87, a6d.A03);
    }
}
