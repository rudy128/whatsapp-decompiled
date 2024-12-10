package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2D1  reason: invalid class name */
public final class AnonymousClass2D1 extends C196289ul {
    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131892397);
    }

    public String A07() {
        return "wa_payment_learn_more";
    }

    public void A0B(Activity activity, AnonymousClass5XY r6, AnonymousClass206 r7, C20271AEe aEe, Class cls) {
        boolean A16 = C18070vi.A16(activity, aEe);
        C18070vi.A0d(cls, 3);
        Intent intent = new Intent(activity, cls);
        C17960vV.A07(aEe);
        String str = aEe.A00;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        String optString = C17880vN.A16(str).optString("url");
        if (optString == null || optString.length() == 0) {
            Log.e("[NFM]: ConversationRow -- NFM url is unavailable to redirect.");
            return;
        }
        intent.putExtra("webview_url", optString);
        intent.putExtra("webview_hide_url", A16);
        intent.putExtra("webview_javascript_enabled", A16);
        intent.putExtra("webview_avoid_external", A16);
        activity.startActivity(intent);
    }
}
