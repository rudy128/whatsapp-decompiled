package X;

import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.Ad5  reason: case insensitive filesystem */
public class C21013Ad5 implements C22524BBh {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;

    public C21013Ad5(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        this.A02 = verifyPhoneNumber;
        this.A00 = j;
        this.A01 = j2;
    }

    public void CCW() {
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        if (verifyPhoneNumber.A0Y.A02("android.permission.RECEIVE_SMS") == 0) {
            VerifyPhoneNumber.A1p(verifyPhoneNumber, this.A00, this.A01);
        } else {
            A9B.A0R(verifyPhoneNumber, 701);
        }
    }

    public void COI() {
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        verifyPhoneNumber.A1Z = true;
        VerifyPhoneNumber.A1p(verifyPhoneNumber, this.A00, this.A01);
    }
}
