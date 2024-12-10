package X;

import android.text.TextUtils;

/* renamed from: X.9AD  reason: invalid class name */
public class AnonymousClass9AD extends AT8 {
    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        AnonymousClass8BX.A1H(r8, "FMessageTemplateHsmProtobuf: message type is not supported ", AnonymousClass000.A10(), r8 instanceof C439521o);
        C439521o r82 = (C439521o) r8;
        AnonymousClass8X8 r5 = a2m.A00;
        C163918Wv A02 = AnonymousClass8X8.A02(r5);
        C58072k6 r0 = r82.A00;
        if (r0 != null) {
            C163108Ts A00 = C181579Ra.A00(r5, r0);
            if (!TextUtils.isEmpty(r82.A0P())) {
                String A0P = r82.A0P();
                C165868bt r1 = (C165868bt) C17880vN.A0G(A00);
                int i = C165868bt.DOCUMENT_MESSAGE_FIELD_NUMBER;
                A0P.getClass();
                r1.titleCase_ = 2;
                r1.title_ = A0P;
            }
            A02.A0H(A00);
            A02.A0G(A00);
            r5.A0R(A02);
            return;
        }
        AnonymousClass8BX.A1G(r82, "MessageTemplateHsm: cannot send encrypted hsm title message, ", AnonymousClass000.A10());
    }

    public AnonymousClass9AD(A89 a89) {
        super(a89);
    }
}
