package X;

import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;

public final class A10 {
    public static int A03;
    public final C19963A0w A00;
    public final C161248Ck A01;
    public final A5R A02;

    public A10(C19963A0w a0w, C161248Ck r3, A5R a5r) {
        C18070vi.A0d(a5r, 3);
        this.A00 = a0w;
        this.A01 = r3;
        this.A02 = a5r;
    }

    public static void A00(VerifyPhoneNumber verifyPhoneNumber) {
        verifyPhoneNumber.A0u.A02(0);
    }

    public final void A01() {
        Log.i("VerificationStateManager/resetAllVerificationState");
        A02(0);
        C161248Ck r2 = this.A01;
        if (r2.hasMessages(1)) {
            r2.removeMessages(1);
        }
        A5R a5r = this.A02;
        a5r.A06("voice");
        a5r.A06("sms");
        a5r.A06("wa_old");
        a5r.A06("email_otp");
        a5r.A06("flash");
        a5r.A04();
        this.A00.A01.A00();
    }

    public final void A02(int i) {
        A03 = i;
        C17880vN.A1C(A5R.A01(this.A02).edit(), "com.whatsapp.registration.VerifyPhoneNumber.verification_state", i);
    }
}
