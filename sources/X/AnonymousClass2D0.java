package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.2D0  reason: invalid class name */
public final class AnonymousClass2D0 extends C196289ul {
    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131892396);
    }

    public String A07() {
        return "payments_care_csat";
    }

    public void A0B(Activity activity, AnonymousClass5XY r6, AnonymousClass206 r7, C20271AEe aEe, Class cls) {
        C18070vi.A0h(activity, aEe);
        C18070vi.A0d(cls, 3);
        C17960vV.A07(aEe);
        String str = aEe.A00;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        JSONObject A16 = C17880vN.A16(str);
        Intent intent = new Intent(activity, cls);
        intent.putExtra("survey_id", A16.optString("survey_id"));
        intent.putExtra("entry_point", A16.optString("entry_point"));
        intent.putExtra("session_id", A16.optString("session_id"));
        activity.startActivity(intent);
    }
}
