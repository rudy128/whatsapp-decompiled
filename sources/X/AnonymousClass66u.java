package X;

import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66u  reason: invalid class name */
public final class AnonymousClass66u extends AnonymousClass161 {
    public final AnonymousClass00H A00;

    public AnonymousClass66u(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A02(JSONObject jSONObject, long j) {
        C18070vi.A0d(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("whatsapp_crossposting_eligibility");
        JSONArray jSONArray = jSONObject2.getJSONArray("whatsapp_status_unique_fbids");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("purpose_public_keys");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("whatsapp_status_has_crossposted_state");
        if (jSONArray2.length() == 1) {
            ArrayList A13 = AnonymousClass000.A13();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                C18070vi.A0b(string);
                A13.add(AnonymousClass74B.A01((C58612ky) C18070vi.A0E(this.A00), string));
            }
            JSONArray jSONArray3 = jSONArray2.getJSONObject(0).getJSONArray("waffle_hcbc");
            if (jSONArray3.length() == jSONArray.length()) {
                ArrayList A132 = AnonymousClass000.A13();
                int length2 = jSONArray3.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    A132.add(Boolean.valueOf(jSONArray3.getBoolean(i2)));
                }
                byte[] decode = Base64.decode(jSONObject3.getString("purpose_public_ek"), 8);
                byte[] decode2 = Base64.decode(jSONObject3.getString("purpose_public_ik"), 8);
                String string2 = jSONObject3.getString("purpose_public_ik_sig");
                String string3 = jSONObject3.getString("purpose_public_ik_enc_certificate");
                byte[] decode3 = Base64.decode(jSONObject3.getString("purpose_dummy_ciphertext"), 8);
                byte[] decode4 = Base64.decode(jSONObject3.getString("purpose_dummy_nonce"), 8);
                C108995ce.A1H(decode, decode2, string2, string3);
                C18070vi.A0b(decode3);
                C18070vi.A0b(decode4);
                this.A00 = new C135596sS(new C136476ts(string2, string3, decode, decode2, decode3, decode4), A13, A132);
                return;
            }
            throw new JSONException("Error: unexpected hasCrosspostBeenCreated length");
        }
        throw new JSONException("Error: unexpected crossposted state length");
    }
}
