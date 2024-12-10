package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pW  reason: invalid class name */
public abstract class AnonymousClass8pW extends C170278pb {
    public long A00;
    public C1418477e A01;
    public C1418477e A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public byte[] A09;

    public JSONObject A0B() {
        JSONObject A15 = C17880vN.A15();
        try {
            String str = this.A03;
            if (str != null) {
                A15.put("bankImageURL", str);
            }
            String str2 = this.A04;
            if (str2 != null) {
                A15.put("bankPhoneNumber", str2);
                return A15;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentMethodBankAccountCountryData toJSONObject threw: ", e);
        }
        return A15;
    }
}
