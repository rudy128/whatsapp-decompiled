package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.email.VerifyEmail;

/* renamed from: X.4mu  reason: invalid class name and case insensitive filesystem */
public class C95854mu implements C22504BAl {
    public final int A00;
    public final Object A01;

    public C95854mu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Btq(Integer num, Long l) {
        AnonymousClass11A A0d;
        Runnable r2;
        int i = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i != 0) {
            A10.append("VerifyEmail/executeVerifyEmailOtpRequest/onFailure/code: ");
            A10.append(num);
            C17900vP.A0X(l, "; waitTime: ", A10);
            VerifyEmail verifyEmail = (VerifyEmail) this.A01;
            AnonymousClass00H r0 = verifyEmail.A0K;
            if (r0 != null) {
                A0d = C17880vN.A0d(r0);
                r2 = new AnonymousClass3C5(verifyEmail, l, num, 36);
            }
            C18070vi.A11("mainThreadHandler");
            throw null;
        }
        A10.append("VerifyEmailActivity/executeVerifyEmailOtpRequest/onFailure/code: ");
        A10.append(num);
        C17900vP.A0X(l, "; waitTime: ", A10);
        VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A01;
        AnonymousClass00H r02 = verifyEmailActivity.A0A;
        if (r02 != null) {
            A0d = C17880vN.A0d(r02);
            r2 = new AnonymousClass3C4(verifyEmailActivity, num, l, 31);
        }
        C18070vi.A11("mainThreadHandler");
        throw null;
        A0d.CGP(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7f(long r8, boolean r10) {
        /*
            r7 = this;
            int r0 = r7.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r4 = r8
            r6 = r10
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "VerifyEmail/executeVerifyEmailOtpRequest/onSuccess/verified : "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", waitTime : "
            X.C17900vP.A0m(r0, r1, r8)
            java.lang.Object r2 = r7.A01
            com.whatsapp.registration.email.VerifyEmail r2 = (com.whatsapp.registration.email.VerifyEmail) r2
            X.00H r0 = r2.A0K
            if (r0 == 0) goto L_0x0048
            X.11A r0 = X.C17880vN.A0d(r0)
            r3 = 4
        L_0x0024:
            X.DTY r1 = new X.DTY
            r1.<init>(r2, r3, r4, r6)
            r0.CGP(r1)
            return
        L_0x002d:
            java.lang.String r0 = "VerifyEmailActivity/executeVerifyEmailOtpRequest/onSuccess/verified : "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", waitTime : "
            X.C17900vP.A0m(r0, r1, r8)
            java.lang.Object r2 = r7.A01
            com.whatsapp.email.VerifyEmailActivity r2 = (com.whatsapp.email.VerifyEmailActivity) r2
            X.00H r0 = r2.A0A
            if (r0 == 0) goto L_0x0048
            X.11A r0 = X.C17880vN.A0d(r0)
            r3 = 2
            goto L_0x0024
        L_0x0048:
            java.lang.String r0 = "mainThreadHandler"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95854mu.C7f(long, boolean):void");
    }
}
