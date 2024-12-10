package X;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pX  reason: invalid class name */
public abstract class AnonymousClass8pX extends C170278pb {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;

    public void A0C(JSONObject jSONObject) {
        this.A01 = jSONObject.optInt("state", 0);
        this.A09 = jSONObject.optString("merchantId", (String) null);
        this.A0C = jSONObject.optString("supportPhoneNumber", (String) null);
        this.A03 = jSONObject.optString("businessName", (String) null);
        String optString = jSONObject.optString("displayState", (String) null);
        if (optString == null || optString.length() == 0) {
            optString = "ACTIVE";
        }
        this.A07 = optString;
        this.A00 = jSONObject.optInt("maxInstallmentCount");
        this.A0A = jSONObject.optString("p2mReceive", "WAIT_ACTIVE");
    }

    public JSONObject A0B() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("state", this.A01);
            if (!TextUtils.isEmpty(this.A09)) {
                A15.put("merchantId", this.A09);
            }
            if (!TextUtils.isEmpty(this.A0C)) {
                A15.put("supportPhoneNumber", this.A0C);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                A15.put("businessName", this.A03);
            }
            if (!TextUtils.isEmpty(this.A07)) {
                A15.put("displayState", this.A07);
            }
            A15.put("maxInstallmentCount", this.A00);
            try {
                A15.put("p2mReceive", this.A0A);
                return A15;
            } catch (JSONException e) {
                C17900vP.A0Z(e, "PAY: PaymentMethodMerchantCountryData/addCapabilitiesToJson threw: ", AnonymousClass000.A10());
                return A15;
            }
        } catch (JSONException e2) {
            C17900vP.A0Z(e2, "PAY: MerchantMethodData toDBJSONObject threw: ", AnonymousClass000.A10());
            return A15;
        }
    }
}
