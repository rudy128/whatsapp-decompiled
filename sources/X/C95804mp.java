package X;

import com.whatsapp.email.EmailVerificationActivity;

/* renamed from: X.4mp  reason: invalid class name and case insensitive filesystem */
public final class C95804mp implements C22502BAj {
    public final /* synthetic */ EmailVerificationActivity A00;

    public C95804mp(EmailVerificationActivity emailVerificationActivity) {
        this.A00 = emailVerificationActivity;
    }

    public void Btp(Integer num) {
        C17900vP.A0X(num, "EmailVerificationActivity/executeGetEmailCall/onFailure/error code: ", AnonymousClass000.A10());
        EmailVerificationActivity emailVerificationActivity = this.A00;
        AnonymousClass00H r0 = emailVerificationActivity.A09;
        if (r0 != null) {
            C17880vN.A0d(r0).CGP(new C70733Ch(emailVerificationActivity, num, 37));
        } else {
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
    }

    public void C7T(String str, boolean z, boolean z2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmailVerificationActivity/executeGetEmailCall/onSuccess/emailVerified: ");
        boolean z3 = z;
        A10.append(z);
        boolean z4 = z2;
        C17900vP.A0n("/emailConfirmed: ", A10, z2);
        EmailVerificationActivity emailVerificationActivity = this.A00;
        AnonymousClass00H r0 = emailVerificationActivity.A09;
        if (r0 != null) {
            C17880vN.A0d(r0).CGP(new C98724rc(emailVerificationActivity, str, 1, z3, z4));
        } else {
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
    }
}
