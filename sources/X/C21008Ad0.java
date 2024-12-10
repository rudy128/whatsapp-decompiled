package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.email.VerifyEmail;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.Ad0  reason: case insensitive filesystem */
public class C21008Ad0 implements C107635aL {
    public final int A00;
    public final Object A01;

    public C21008Ad0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BpB(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                VerifyTwoFactorAuth.A0c((VerifyTwoFactorAuth) this.A01, str, 0, false);
                return;
            case 1:
                VerifyEmail verifyEmail = (VerifyEmail) this.A01;
                AnonymousClass4VX r0 = verifyEmail.A09;
                if (r0 == null) {
                    str2 = "codeInputBoxManager";
                } else {
                    if (r0.A00().length() == 6 && AnonymousClass8BS.A01(verifyEmail) >= verifyEmail.A01) {
                        WDSButton wDSButton = verifyEmail.A0E;
                        if (wDSButton == null) {
                            str2 = "nextButton";
                        } else {
                            wDSButton.setEnabled(true);
                        }
                    }
                    if (VerifyEmail.A0d(verifyEmail)) {
                        verifyEmail.A4e().A03();
                        throw AnonymousClass000.A0s("logOnboardingEnterEvent");
                    }
                    return;
                }
                C18070vi.A11(str2);
                throw null;
            default:
                ((VerifyPhoneNumber) this.A01).A4m(str);
                return;
        }
    }
}
