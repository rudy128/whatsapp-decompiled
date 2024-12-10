package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public final class ASY implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r4) {
        C18070vi.A0h(r4, a2m);
        if (r4 instanceof C443022x) {
            AnonymousClass8X8 r1 = a2m.A00;
            C164108Xo r0 = ((C166418cr) r1.A00).requestPhoneNumberMessage_;
            if (r0 == null) {
                r0 = C164108Xo.DEFAULT_INSTANCE;
            }
            C164108Xo r02 = (C164108Xo) r0.A0O().A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r1, r02);
            A0J.requestPhoneNumberMessage_ = r02;
            A0J.bitField1_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unexpected message type ");
        throw AnonymousClass000.A0n(C17890vO.A0V(r4.getClass(), A10));
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        if ((C20077A6d.A01(a6d).bitField1_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            return new AnonymousClass206(a6d.A0A, 72, a6d.A03);
        }
        return null;
    }
}
