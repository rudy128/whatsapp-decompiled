package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public class ASZ implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        if (r5 instanceof C443222z) {
            AnonymousClass8X8 r2 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r2);
            A01.A0G(C179839Kc.SHARE_PHONE_NUMBER);
            r2.A0O((C166368cm) A01.A0C());
            return;
        }
        throw AnonymousClass000.A0k("FMessageSharePhoneNumberProtobuf/not supported message");
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if (!AnonymousClass000.A1O(r1.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        C166368cm A0I = AnonymousClass8BS.A0I(r1);
        if ((A0I.bitField0_ & 2) == 0 || A0I.A0R() != C179839Kc.SHARE_PHONE_NUMBER) {
            return null;
        }
        return new AnonymousClass206(a6d.A0A, 73, a6d.A03);
    }
}
