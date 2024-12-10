package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.email.VerifyEmail;
import com.whatsapp.util.Log;

/* renamed from: X.4mr  reason: invalid class name and case insensitive filesystem */
public class C95824mr implements C22503BAk {
    public final int A00;
    public final Object A01;

    public C95824mr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Btq(Integer num, Long l) {
        AnonymousClass11A A0d;
        Runnable r2;
        int i = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i != 0) {
            A10.append("VerifyEmail/executeSendEmailOtpRequest/onFailure/code: ");
            A10.append(num);
            C17900vP.A0X(l, "; waitTime: ", A10);
            VerifyEmail verifyEmail = (VerifyEmail) this.A01;
            AnonymousClass00H r0 = verifyEmail.A0K;
            if (r0 != null) {
                A0d = C17880vN.A0d(r0);
                r2 = new AnonymousClass3C5(verifyEmail, num, l, 35);
            }
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
        A10.append("VerifyEmailActivity/executeSendEmailOtpRequest/onFailure/code: ");
        A10.append(num);
        C17900vP.A0X(l, "; waitTime: ", A10);
        VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A01;
        AnonymousClass00H r02 = verifyEmailActivity.A0A;
        if (r02 != null) {
            A0d = C17880vN.A0d(r02);
            r2 = new AnonymousClass3C4(verifyEmailActivity, num, l, 30);
        }
        C18070vi.A11("mainThreadHandler");
        throw null;
        A0d.CGP(r2);
    }

    public void C7j() {
        AnonymousClass11A A0d;
        Runnable r2;
        if (this.A00 != 0) {
            Log.i("VerifyEmail/executeSendEmailOtpRequest/onSuccess");
            VerifyEmail verifyEmail = (VerifyEmail) this.A01;
            AnonymousClass00H r0 = verifyEmail.A0K;
            if (r0 != null) {
                A0d = C17880vN.A0d(r0);
                r2 = new C21428Ajv(verifyEmail, 13);
            }
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
        Log.i("VerifyEmailActivity/executeSendEmailOtpRequest/onSuccess/");
        VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A01;
        AnonymousClass00H r02 = verifyEmailActivity.A0A;
        if (r02 != null) {
            A0d = C17880vN.A0d(r02);
            r2 = new C98564rM(verifyEmailActivity, 41);
        }
        C18070vi.A11("mainThreadHandler");
        throw null;
        A0d.CGP(r2);
    }
}
