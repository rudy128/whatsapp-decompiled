package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2D2  reason: invalid class name */
public final class AnonymousClass2D2 extends C196289ul {
    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131892423);
    }

    public String A07() {
        return "wa_payment_transaction_details";
    }

    public void A0B(Activity activity, AnonymousClass5XY r6, AnonymousClass206 r7, C20271AEe aEe, Class cls) {
        C18070vi.A0h(activity, aEe);
        C18070vi.A0d(cls, 3);
        Intent intent = new Intent(activity, cls);
        C17960vV.A07(aEe);
        String str = aEe.A00;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        String optString = C17880vN.A16(str).optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (optString == null || optString.length() == 0) {
            Log.e("[NFM]: WaViewTransactionAction - ConversationRow -- transaction-id is unavailable");
            return;
        }
        intent.putExtra("referral_screen", "chat");
        intent.putExtra("extra_transaction_id", optString);
        activity.startActivity(intent);
    }
}
