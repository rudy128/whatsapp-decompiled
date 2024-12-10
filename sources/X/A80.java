package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.Log;

public abstract class A80 {
    public static final C165038aU A00(C19880zA r1) {
        C18070vi.A0d(r1, 0);
        if (!r1.A07()) {
            return null;
        }
        r1.A03();
        throw AnonymousClass000.A0s("getVNameCertForVerifyCode");
    }

    public static final void A02(Activity activity, C27301Vn r3, AnonymousClass1LU r4, C196059uO r5, C33841jT r6, boolean z) {
        C18070vi.A0s(r5, r4, r6, r3);
        if (r5.A00) {
            Log.i("VerifyPhoneNumberUtils/onVerificationSuccess/notify user to come back and finish registration");
            A9B.A0P(activity, r3, r6, false);
        }
        Log.i("VerifyPhoneNumberUtils/onVerificationSuccess/proceed to register name");
        activity.startActivity(AnonymousClass1LU.A1k(activity, z));
        activity.finish();
    }

    public static final void A03(Activity activity, C19830z4 r2, AnonymousClass8BA r3, AnonymousClass1LU r4, C188779hy r5, AnonymousClass1CM r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0d(r6, 1);
        C72473Md.A1M(r3, r4, r8, 2);
        C18070vi.A0l(r2, r7);
        Boolean bool = C17970vW.A01;
        A06(r3, r5, r6, r8);
        activity.startActivity(AnonymousClass1LU.A1l(activity, false));
        activity.finish();
    }

    public static final void A04(Context context, AnonymousClass190 r12, AnonymousClass11S r13, AnonymousClass11P r14, C19830z4 r15, A98 a98, C26145Ct9 ct9, AnonymousClass10I r18, String str, String str2, int i, boolean z) {
        AnonymousClass10I r4 = r18;
        C18070vi.A0d(r4, 0);
        C18070vi.A0o(context, r12, r14);
        C19830z4 r1 = r15;
        C18070vi.A0g(r13, 4, r15);
        A98 a982 = a98;
        C26145Ct9 ct92 = ct9;
        String str3 = str;
        String str4 = str2;
        C72483Me.A16(str3, str4, ct92, a982, 7);
        Log.i("BackupTokenUtils/updateBackupTokenOnSuccessfullRegistration");
        r4.CGF(new C21468AkZ(r14, r13, r15, context, r12, 27));
        int i2 = i;
        if (i2 == -1) {
            Log.e("AutoconfUtils/maybeCreateAutoconfVerifier/registration method is unknown");
        } else {
            r4.CGN(new C21398AjR(r1, a982, ct92, r4, str3, str4, i2, z));
        }
    }

    public static final void A05(C19880zA r2, C19830z4 r3, C22881Do r4, C33841jT r5, C20605ARp aRp, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass3Ma.A1O(str, 2, str2);
        C72483Me.A16(r4, r5, r3, r2, 4);
        r3.A23(z);
        r3.A22(z2);
        r3.A2B(z3);
        if (r2.A07()) {
            r2.A03();
            throw AnonymousClass000.A0s("setVNameCertSetInRegistration");
        }
        r5.A0D(str, str2, str3);
        r5.A05();
        C33841jT.A03(r5, 2, true);
        r3.A12();
        if (aRp != null) {
            aRp.A00();
        }
        r4.A00(false, 0);
    }

    public static final void A06(AnonymousClass8BA r3, C188779hy r4, AnonymousClass1CM r5, AnonymousClass00H r6) {
        int i;
        Log.i("VerifyPhoneNumberUtils/onConsentPending");
        AnonymousClass8BR.A0q(r6).A0F(A01(r5), "account_verification_complete");
        C25681Pe r32 = (C25681Pe) r3;
        C17880vN.A1E(r32.A02().edit(), "registration_login", r4.A08);
        String str = r4.A0A;
        if (str == null || "dob".equalsIgnoreCase(str)) {
            i = 25;
        } else if ("parent_verification".equalsIgnoreCase(str)) {
            r5.A01(26);
            String str2 = r4.A09;
            if (str2 == null) {
                str2 = "https://whatsapp.com/parent_consent/";
            }
            C17880vN.A1E(r32.A02().edit(), "url", str2);
            return;
        } else if ("youth_consent".equalsIgnoreCase(str)) {
            i = 30;
        } else {
            Log.e("VerifyPhoneNumberUtils/onConsentPending wrong pending for");
            return;
        }
        r5.A01(i);
    }

    public static final String A01(AnonymousClass1CM r2) {
        if (r2.A03()) {
            return "verify_passkey";
        }
        if (r2.A00(false) == 17) {
            return "verify_email_otp";
        }
        if (r2.A00(false) == 15) {
            return "verify_wa_old";
        }
        if (r2.A05()) {
            return "verify_silent_auth";
        }
        if (r2.A00(false) == 5) {
            return "verify_voice_otp";
        }
        if (r2.A00(false) == 8) {
            return "verify_flash";
        }
        return "verify_sms";
    }
}
