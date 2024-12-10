package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tF  reason: invalid class name and case insensitive filesystem */
public final class C172328tF extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fetch__XWAPaymentsUser").getJSONObject("upi_bank_list");
        JSONArray optJSONArray = jSONObject3.optJSONArray("bank_info_and_routing_list");
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("psp_metadata");
        JSONArray optJSONArray3 = jSONObject3.optJSONArray("default_routing");
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        AnonymousClass8pH r5 = new AnonymousClass8pH();
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                AnonymousClass8pH r3 = new AnonymousClass8pH();
                C18070vi.A0b(jSONObject4);
                C18070vi.A0d(jSONObject4, 0);
                Bundle A0D = C17880vN.A0D();
                A0D.putString("providerType", jSONObject4.optString("upi_provider_type"));
                JSONObject jSONObject5 = jSONObject4.getJSONObject("metadata");
                JSONArray optJSONArray4 = jSONObject5.optJSONArray("sms_gateways");
                ArrayList A133 = AnonymousClass000.A13();
                if (optJSONArray4 != null) {
                    int length2 = optJSONArray4.length();
                    for (int i2 = 0; i2 < length2; i2 = AnonymousClass8BU.A05(A133, optJSONArray4, i2)) {
                    }
                }
                A0D.putStringArrayList("smsGateways", A133);
                A0D.putString("smsPrefix", jSONObject5.optString("sms_prefix"));
                A0D.putString("transactionPrefix", jSONObject5.optString("transaction_prefix"));
                r3.A00 = A0D;
                A132.add(r3);
            }
        }
        if (optJSONArray3 != null) {
            ArrayList A134 = AnonymousClass000.A13();
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3 = AnonymousClass8BU.A05(A134, optJSONArray3, i3)) {
            }
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putStringArrayList("pspRouting", A134);
            r5.A00 = A0D2;
        }
        if (optJSONArray != null) {
            int length4 = optJSONArray.length();
            for (int i4 = 0; i4 < length4; i4++) {
                AnonymousClass8pS r2 = new AnonymousClass8pS();
                JSONObject jSONObject6 = optJSONArray.getJSONObject(i4).getJSONObject("bank_info");
                r2.A0B = jSONObject6.optString("code");
                r2.A01 = C20061A5k.A00(jSONObject6.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "bankName");
                r2.A03 = jSONObject6.optString("cdn_everstore_url");
                r2.A0K = jSONObject6.optBoolean("is_popular_bank");
                A13.add(r2);
            }
        }
        this.A00 = new C186119dg(r5, A13, A132);
    }
}
