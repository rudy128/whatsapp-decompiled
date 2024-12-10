package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeResponseImpl;
import com.whatsapp.infra.graphql.generated.autoconf.ValidateVerifierConfidenceResponseImpl;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.AUg  reason: case insensitive filesystem */
public final class C20674AUg implements C33051iB {
    public C186259du A00;
    public final AnonymousClass1PY A01;

    public C20674AUg(AnonymousClass1PY r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void C3V(C172768tz r6) {
        String str;
        JSONArray jSONArray = r6.A01;
        int i = 405;
        if (jSONArray.length() > 0) {
            Log.i("RequestConfidenceChallengeManager/onResponse/error");
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
                A19.append("RequestConfidenceChallengeManager/onResponse/errorCode=");
                A19.append(i);
                C17900vP.A0e("/errorDescription=", str, A19);
            }
        } else {
            String A0z = C72453Mb.A0z(C108985cd.A0I(r6.A00, GetAutoConfConfidenceChallengeResponseImpl.Xwa2AutoconfRequestConfidenceChallenge.class, "xwa2_autoconf_request_confidence_challenge"), "auth_challenge");
            if (!AnonymousClass1YF.A0T(A0z)) {
                Log.i("RequestConfidenceChallengeManager/onResponse/valid authChallenge");
                C186259du r2 = this.A00;
                if (r2 != null) {
                    Log.i("AutoConfConfidencePingManager/onRequestChallengeSuccess");
                    byte[] A04 = r2.A01.A04(A0z);
                    if (A04 == null) {
                        Log.e("AutoConfConfidencePingManager/onRequestChallengeSuccess/failed to query authResponse from FEO2 client");
                        return;
                    }
                    Log.i("AutoConfConfidencePingManager/onRequestChallengeSuccess/successfully queried authResponse, validate verifier");
                    C20675AUh aUh = new C20675AUh((AnonymousClass1PY) C18070vi.A0E(r2.A02));
                    String A14 = C108955ca.A14(A04);
                    C18070vi.A0X(A14);
                    aUh.A00 = r2;
                    A7K A002 = A7K.A00();
                    A002.A07("authResponse", A14);
                    aUh.A01.A00(AIj.A00(A002, ValidateVerifierConfidenceResponseImpl.class, "ValidateVerifierConfidence"), aUh).A00();
                    return;
                }
                C18070vi.A11("callback");
                throw null;
            }
            Log.i("RequestConfidenceChallengeManager/onResponse/blank authChallenge");
        }
        C186259du r22 = this.A00;
        if (r22 != null) {
            if (i != 405) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AutoConfConfidencePingManager/onRequestChallengeFailure/errorCode=");
                A10.append(i);
                C17890vO.A19(A10, "/stop confidence ping");
                C17880vN.A1F(AnonymousClass8BV.A06(r22.A00.A00), "resend_confidence_ping", false);
                return;
            }
            return;
        }
        C18070vi.A11("callback");
        throw null;
    }

    public void Btr(Throwable th) {
        C17900vP.A0X(th, "RequestConfidenceChallengeManager/onFailure/MEX error: ", C18070vi.A0K(th));
    }
}
