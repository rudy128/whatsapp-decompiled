package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

public class A9V implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public A9V(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C1775899j r2 = (C1775899j) this.A02;
                AnonymousClass4Yv.A00(r2.A01, this.A01);
                r2.A00 = true;
                r2.CGQ(true, false);
                return;
            case 1:
                int i2 = this.A01;
                Activity activity = ((C1775899j) this.A02).A01;
                AnonymousClass4Yv.A00(activity, i2);
                AnonymousClass4Yv.A01(activity, 106);
                return;
            case 2:
            case 3:
                AnonymousClass91T r1 = (AnonymousClass91T) this.A02;
                AnonymousClass4Yv.A00(r1, this.A01);
                r1.A4o();
                r1.finish();
                return;
            case 7:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A02;
                AnonymousClass4Yv.A00(verifyPhoneNumber, this.A01);
                AnonymousClass3MW.A0a(verifyPhoneNumber.A15).A01(verifyPhoneNumber, "how-to-register");
                return;
            case 8:
            case 10:
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) this.A02;
                AnonymousClass4Yv.A00(verifyPhoneNumber2, this.A01);
                VerifyPhoneNumber.A1i(verifyPhoneNumber2);
                return;
            case 9:
                VerifyPhoneNumber verifyPhoneNumber3 = (VerifyPhoneNumber) this.A02;
                AnonymousClass4Yv.A00(verifyPhoneNumber3, this.A01);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("+");
                A10.append(verifyPhoneNumber3.A1H);
                verifyPhoneNumber3.A0Z.A01(verifyPhoneNumber3, AnonymousClass001.A1H("verify-bp ", AnonymousClass000.A0y(verifyPhoneNumber3.A1J, A10), AnonymousClass000.A10()));
                return;
            default:
                AnonymousClass4Yv.A00((Activity) this.A02, this.A01);
                return;
        }
    }
}
