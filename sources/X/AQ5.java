package X;

import com.whatsapp.CodeInputField;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

public class AQ5 implements AnonymousClass11J {
    public final int A00;
    public final Object A01;

    public AQ5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bps(C59732mn r5) {
        CodeInputField codeInputField;
        switch (this.A00) {
            case 0:
                AnonymousClass192 r3 = (AnonymousClass192) this.A01;
                if (r5.A02) {
                    r3.A0C.CGF(new C70573Bq(r3, 9));
                    return;
                }
                return;
            case 1:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A01;
                if (r5.A02 && (codeInputField = verifyTwoFactorAuth.A0C) != null && codeInputField.getCode().length() == 6) {
                    VerifyTwoFactorAuth.A0c(verifyTwoFactorAuth, verifyTwoFactorAuth.A0C.getCode(), 0, false);
                    return;
                }
                return;
            default:
                VerifyPhoneNumber.A1d((VerifyPhoneNumber) this.A01);
                return;
        }
    }
}
