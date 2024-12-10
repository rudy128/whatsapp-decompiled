package X;

import com.whatsapp.util.Log;

/* renamed from: X.4mq  reason: invalid class name and case insensitive filesystem */
public class C95814mq implements C22502BAj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C95814mq(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void Btp(Integer num) {
        int i = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i != 0) {
            C17900vP.A0X(num, "EmailVerificationManager/syncEmailToSharedPrefsIfNeeded/onFailure/error code: ", A10);
            C19830z4 r1 = ((C196039uM) this.A02).A01;
            r1.A1f((String) null);
            r1.A29(false);
            r1.A28(false);
            C18090vk r0 = (C18090vk) this.A01;
            if (r0 != null) {
                r0.invoke();
                return;
            }
            return;
        }
        C17900vP.A0X(num, "EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onFailure/error code: ", A10);
        C19830z4 r12 = ((C196039uM) this.A02).A01;
        r12.A1f((String) null);
        r12.A29(false);
        r12.A28(false);
        ((C22821Di) this.A01).invoke(0);
    }

    public void C7T(String str, boolean z, boolean z2) {
        int i;
        int i2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i2 != 0) {
            A10.append("EmailVerificationManager/syncEmailToSharedPrefsIfNeeded/onSuccess/emailVerified: ");
            A10.append(z);
            C17900vP.A0n("/emailConfirmed: ", A10, z2);
            C19830z4 r0 = ((C196039uM) this.A02).A01;
            r0.A1f(str);
            r0.A29(z);
            r0.A28(z2);
            C18090vk r02 = (C18090vk) this.A01;
            if (r02 != null) {
                r02.invoke();
                return;
            }
            return;
        }
        A10.append("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/onSuccess/emailVerified: ");
        A10.append(z);
        C17900vP.A0n("/emailConfirmed: ", A10, z2);
        C19830z4 r03 = ((C196039uM) this.A02).A01;
        r03.A1f(str);
        r03.A29(z);
        r03.A28(z2);
        C22821Di r1 = (C22821Di) this.A01;
        if (str == null || str.length() == 0) {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email does not exist");
            i = 2;
        } else if (!z) {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email exists but not verified");
            i = 3;
        } else if (!z2) {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email exists but not confirmed");
            i = 4;
        } else {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email exists");
            i = 1;
        }
        r1.invoke(Integer.valueOf(i));
    }
}
