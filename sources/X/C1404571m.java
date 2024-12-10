package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.71m  reason: invalid class name and case insensitive filesystem */
public class C1404571m {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public JSONObject A04;
    public final String A05;
    public final String A06;
    public final JSONArray A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C1404571m(JSONObject jSONObject) {
        String str;
        try {
            this.A01 = jSONObject.getInt("code");
        } catch (JSONException unused) {
            this.A01 = 0;
        }
        try {
            this.A02 = jSONObject.getInt("error_subcode");
        } catch (JSONException unused2) {
            this.A02 = 0;
        }
        try {
            this.A00 = jSONObject.getInt("api_error_code");
        } catch (JSONException unused3) {
            this.A00 = 0;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        this.A07 = optJSONArray;
        String A012 = C20064A5n.A01("message", (String) null, jSONObject);
        this.A06 = A012;
        this.A09 = jSONObject.optBoolean("is_silent");
        this.A0A = jSONObject.optBoolean("is_transient");
        this.A05 = C20064A5n.A01("description", (String) null, jSONObject);
        this.A0B = jSONObject.optBoolean("requires_reauth");
        this.A08 = jSONObject.optBoolean("allow_user_retry");
        try {
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                str = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            } else if (jSONObject.has("exception")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("exception");
                C18070vi.A0d(jSONObject2, 0);
                str = C20064A5n.A01("class", (String) null, jSONObject2);
                if (jSONObject.getJSONObject("exception").has("message")) {
                    StringBuilder A11 = AnonymousClass000.A11(str);
                    A11.append("::");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("exception");
                    C18070vi.A0d(jSONObject3, 0);
                    str = AnonymousClass000.A0y(C20064A5n.A01("message", (String) null, jSONObject3), A11);
                }
            } else {
                str = null;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            str = null;
        }
        this.A03 = str;
        this.A04 = C17880vN.A15();
        String A013 = C20064A5n.A01("www_request_id", (String) null, jSONObject);
        if (C20064A5n.A01("fbtrace_id", (String) null, jSONObject) != null) {
            this.A04.put("fbtrace_id", C20064A5n.A01("fbtrace_id", (String) null, jSONObject));
        }
        if (A013 != null) {
            this.A04.put("www_request_id", C20064A5n.A01("www_request_id", (String) null, jSONObject));
        }
        if (optJSONArray != null) {
            JSONObject jSONObject4 = this.A04;
            StringBuilder A10 = AnonymousClass000.A10();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    A10.append(optJSONArray.get(i));
                    if (i < optJSONArray.length() - 1) {
                        A10.append(",");
                    }
                } catch (JSONException e2) {
                    Log.e(e2.getMessage());
                }
            }
            jSONObject4.put("path", A10.toString());
        }
        if (this.A03 == null) {
            this.A03 = A012;
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GraphqlError{code=");
        A10.append(this.A01);
        A10.append(", errorSubCode='");
        A10.append(this.A02);
        A10.append('\'');
        A10.append(", message='");
        A10.append(this.A06);
        A10.append('\'');
        A10.append(", exception='");
        A10.append(this.A03);
        A10.append('\'');
        A10.append(", isSilent=");
        A10.append(this.A09);
        A10.append(", description='");
        A10.append(this.A05);
        A10.append('\'');
        A10.append(", isTransient=");
        A10.append(this.A0A);
        A10.append(", requiresReAuth=");
        A10.append(this.A0B);
        A10.append(", allowUserRetry=");
        A10.append(this.A08);
        return C17890vO.A0b(A10);
    }

    public C1404571m(String str, String str2) {
        this.A03 = str;
        this.A01 = -20;
        this.A07 = null;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A08 = false;
        this.A06 = null;
        this.A05 = null;
    }

    public C1404571m(String str) {
        this.A01 = -1;
        this.A06 = str;
        this.A05 = str;
        this.A07 = null;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A08 = false;
    }
}
