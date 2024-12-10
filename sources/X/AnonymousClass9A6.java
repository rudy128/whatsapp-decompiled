package X;

import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: X.9A6  reason: invalid class name */
public class AnonymousClass9A6 extends AnonymousClass8k1 {
    public void A0D(JSONObject jSONObject) {
        super.A0D(jSONObject);
        int intValue = Integer.valueOf(this.A02.A0l()).intValue();
        Charset charset = AnonymousClass1K3.A06;
        jSONObject.put("country_iso_graphql", AnonymousClass1K4.A01.get(intValue));
    }
}
