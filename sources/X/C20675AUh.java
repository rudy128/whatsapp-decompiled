package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.AUh  reason: case insensitive filesystem */
public final class C20675AUh implements C33051iB {
    public C186259du A00;
    public final AnonymousClass1PY A01;

    public C20675AUh(AnonymousClass1PY r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void C3V(C172768tz r6) {
        String str;
        JSONArray jSONArray = r6.A01;
        int i = 405;
        if (jSONArray.length() > 0) {
            Log.i("ValidateVerifierConfidenceManager/onResponse/error");
            if (jSONArray.length() > 1) {
                Object obj = jSONArray.get(1);
                C18070vi.A0z(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                C18070vi.A0d(jSONObject, 0);
                Object obj2 = jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
                C18070vi.A0z(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj2;
                if (jSONObject2.has("error_code")) {
                    Object obj3 = jSONObject2.get("error_code");
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Int");
                    i = AnonymousClass000.A0M(obj3);
                }
                if (jSONObject2.has("description")) {
                    Object obj4 = jSONObject2.get("description");
                    AnonymousClass8BR.A1I(obj4);
                    str = (String) obj4;
                } else {
                    str = "";
                }
                StringBuilder A19 = AnonymousClass3MZ.A19(str, 2);
                A19.append("ValidateVerifierConfidenceManager/onResponse/errorCode=");
                A19.append(i);
                C17900vP.A0e("/errorDescription=", str, A19);
            }
        } else if (r6.A00.A0G("xwa2_autoconf_validate_confidence")) {
            Log.i("ValidateVerifierConfidenceManager/onResponse/success");
            return;
        } else {
            Log.i("ValidateVerifierConfidenceManager/onResponse/failure");
        }
        C186259du r1 = this.A00;
        if (r1 == null) {
            C18070vi.A11("callback");
            throw null;
        } else if (i != 405) {
            Log.e("AutoConfConfidencePingManager/onValidateVerifierFailure/stop confidence ping");
            C17880vN.A1F(AnonymousClass8BV.A06(r1.A00.A00), "resend_confidence_ping", false);
        }
    }

    public void Btr(Throwable th) {
        C17900vP.A0X(th, "ValidateVerifierConfidenceManager/onFailure/MEX error: ", C18070vi.A0K(th));
    }
}
