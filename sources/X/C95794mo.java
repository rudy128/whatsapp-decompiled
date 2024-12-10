package X;

import android.os.Bundle;
import com.whatsapp.email.ReconfirmEmailBottomSheet;
import com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity;

/* renamed from: X.4mo  reason: invalid class name and case insensitive filesystem */
public class C95794mo implements C22501BAi {
    public final int A00;
    public final Object A01;

    public C95794mo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Btp(Integer num) {
        String str;
        if (this.A00 != 0) {
            ConfirmEmailSetupRegUpsellActivity confirmEmailSetupRegUpsellActivity = (ConfirmEmailSetupRegUpsellActivity) this.A01;
            C190059kJ r4 = confirmEmailSetupRegUpsellActivity.A01;
            if (r4 != null) {
                r4.A00(confirmEmailSetupRegUpsellActivity.A08, String.valueOf(num), confirmEmailSetupRegUpsellActivity.A00, 10, 13, 2);
                AnonymousClass00H r0 = confirmEmailSetupRegUpsellActivity.A05;
                if (r0 != null) {
                    C17880vN.A0d(r0).CGP(new C21449AkG((Object) confirmEmailSetupRegUpsellActivity, 49));
                    return;
                }
                str = "mainThreadHandler";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            ReconfirmEmailBottomSheet reconfirmEmailBottomSheet = (ReconfirmEmailBottomSheet) this.A01;
            C190059kJ r1 = reconfirmEmailBottomSheet.A02;
            if (r1 != null) {
                r1.A00(reconfirmEmailBottomSheet.A04, String.valueOf(num), reconfirmEmailBottomSheet.A00, 11, 13, 2);
                reconfirmEmailBottomSheet.A29();
                return;
            }
        }
        str = "emailVerificationLogger";
        C18070vi.A11(str);
        throw null;
    }

    public void onSuccess() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ConfirmEmailSetupRegUpsellActivity confirmEmailSetupRegUpsellActivity = (ConfirmEmailSetupRegUpsellActivity) obj;
            C190059kJ r4 = confirmEmailSetupRegUpsellActivity.A01;
            if (r4 != null) {
                r4.A00(confirmEmailSetupRegUpsellActivity.A08, (String) null, confirmEmailSetupRegUpsellActivity.A00, 10, 13, 1);
                confirmEmailSetupRegUpsellActivity.A0A.A28(true);
                AnonymousClass00H r0 = confirmEmailSetupRegUpsellActivity.A05;
                if (r0 != null) {
                    C17880vN.A0d(r0).CGP(new C21449AkG((Object) confirmEmailSetupRegUpsellActivity, 48));
                } else {
                    C18070vi.A11("mainThreadHandler");
                    throw null;
                }
            } else {
                C18070vi.A11("emailVerificationLogger");
                throw null;
            }
        } else {
            ReconfirmEmailBottomSheet reconfirmEmailBottomSheet = (ReconfirmEmailBottomSheet) obj;
            if (reconfirmEmailBottomSheet.A1b() && !reconfirmEmailBottomSheet.A0j) {
                Bundle A0D = C17880vN.A0D();
                A0D.putString("RECONFIRM_EMAIL_RESULT", "RECONFIRM_SUCCESS");
                reconfirmEmailBottomSheet.A1F().A0w("RECONFIRM_EMAIL_FRAGMENT_RESULT", A0D);
            }
            reconfirmEmailBottomSheet.A29();
        }
    }
}
