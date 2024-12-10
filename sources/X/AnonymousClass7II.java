package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;

/* renamed from: X.7II  reason: invalid class name */
public class AnonymousClass7II implements C1607089p {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ DescribeProblemActivity A01;

    public void BoV(AnonymousClass1BI r9) {
        C1411974r r6 = new C1411974r(30);
        LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1);
        A0D.putInt("message_res", 2131888195);
        A0D.putInt("primary_action_text_id_res", 2131899286);
        legacyMessageDialogFragment.A00 = r6;
        legacyMessageDialogFragment.A1R(A0D);
        DescribeProblemActivity describeProblemActivity = this.A01;
        AnonymousClass3MY.A1H(legacyMessageDialogFragment, describeProblemActivity, (String) null);
        AnonymousClass1FU r1 = this.A00;
        r1.CEx();
        describeProblemActivity.A3q(AnonymousClass3MY.A06(r1, describeProblemActivity.A0C, r9), true);
    }

    public AnonymousClass7II(AnonymousClass1FU r1, DescribeProblemActivity describeProblemActivity) {
        this.A01 = describeProblemActivity;
        this.A00 = r1;
    }

    public void BoT() {
        Log.e("DescribeProblemActivity/contactSupport/onDeliveryFailure, falling back to email support.");
        this.A00.CEx();
        DescribeProblemActivity.A0r(this.A01);
    }

    public void BoU(int i, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DescribeProblemActivity/contactSupport/onError/errorCode=");
        A10.append(i);
        C17890vO.A19(A10, " falling back to email support.");
        this.A00.CEx();
        DescribeProblemActivity.A0r(this.A01);
    }
}
