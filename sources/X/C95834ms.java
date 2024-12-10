package X;

import com.whatsapp.email.EmailVerificationActivity;
import com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity;

/* renamed from: X.4ms  reason: invalid class name and case insensitive filesystem */
public class C95834ms implements C22560BCt {
    public final int A00;
    public final Object A01;

    public C95834ms(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Btp(Integer num) {
        String str;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ConfirmEmailSetupRegUpsellActivity confirmEmailSetupRegUpsellActivity = (ConfirmEmailSetupRegUpsellActivity) obj;
            C190059kJ r1 = confirmEmailSetupRegUpsellActivity.A01;
            if (r1 != null) {
                r1.A00(confirmEmailSetupRegUpsellActivity.A08, String.valueOf(num), confirmEmailSetupRegUpsellActivity.A00, 10, 12, 2);
                AnonymousClass00H r12 = confirmEmailSetupRegUpsellActivity.A05;
                if (r12 != null) {
                    C17880vN.A0d(r12).CGP(new C21428Ajv(confirmEmailSetupRegUpsellActivity, 0));
                    return;
                }
                str = "mainThreadHandler";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) obj;
            AnonymousClass00H r13 = emailVerificationActivity.A05;
            if (r13 != null) {
                ((C190059kJ) r13.get()).A00(emailVerificationActivity.A0B, String.valueOf(num), emailVerificationActivity.A00, 11, 12, 2);
                emailVerificationActivity.A05.CGP(new C98564rM(emailVerificationActivity, 34));
                return;
            }
        }
        str = "emailVerificationLogger";
        C18070vi.A11(str);
        throw null;
    }

    public void C7W(boolean z, boolean z2) {
        if (this.A00 != 0) {
            ConfirmEmailSetupRegUpsellActivity confirmEmailSetupRegUpsellActivity = (ConfirmEmailSetupRegUpsellActivity) this.A01;
            C190059kJ r3 = confirmEmailSetupRegUpsellActivity.A01;
            if (r3 != null) {
                r3.A00(confirmEmailSetupRegUpsellActivity.A08, (String) null, confirmEmailSetupRegUpsellActivity.A00, 10, 12, 1);
                confirmEmailSetupRegUpsellActivity.A0A.A1f((String) null);
                confirmEmailSetupRegUpsellActivity.A0A.A29(false);
                confirmEmailSetupRegUpsellActivity.A0A.A28(false);
                AnonymousClass00H r0 = confirmEmailSetupRegUpsellActivity.A05;
                if (r0 != null) {
                    C17880vN.A0d(r0).CGP(new C21428Ajv(confirmEmailSetupRegUpsellActivity, 1));
                    return;
                } else {
                    C18070vi.A11("mainThreadHandler");
                    throw null;
                }
            }
        } else {
            EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) this.A01;
            emailVerificationActivity.A0A.A1f((String) null);
            emailVerificationActivity.A0A.A29(false);
            emailVerificationActivity.A0A.A28(false);
            AnonymousClass00H r02 = emailVerificationActivity.A05;
            if (r02 != null) {
                ((C190059kJ) r02.get()).A00(emailVerificationActivity.A0B, (String) null, emailVerificationActivity.A00, 11, 12, 1);
                emailVerificationActivity.A05.CGP(new C98564rM(emailVerificationActivity, 33));
                return;
            }
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public /* synthetic */ void C8j() {
    }

    public /* synthetic */ void C8k() {
    }

    public /* synthetic */ void C8l() {
    }

    public /* synthetic */ void C8p(String str) {
    }
}
