package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.66t  reason: invalid class name and case insensitive filesystem */
public final class C1191166t extends AnonymousClass161 {
    public final AnonymousClass00H A00;

    public C1191166t(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A02(JSONObject jSONObject, long j) {
        C18070vi.A0d(jSONObject, 0);
        JSONArray jSONArray = jSONObject.getJSONObject("xfb_whatsapp_crossposting").getJSONArray("status_crosspost_results");
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("wa_status_id");
            int i2 = jSONObject2.getInt("response_code");
            if (i2 == 0) {
                C18070vi.A0b(string);
                A13.add(AnonymousClass74B.A01((C58612ky) C18070vi.A0E(this.A00), string));
            } else if (i2 != 2) {
                C18070vi.A0b(string);
                AnonymousClass77S A01 = AnonymousClass74B.A01((C58612ky) C18070vi.A0E(this.A00), string);
                if (i2 != 3) {
                    A132.add(A01);
                } else {
                    A134.add(A01);
                }
            } else {
                C18070vi.A0b(string);
                A133.add(AnonymousClass74B.A01((C58612ky) C18070vi.A0E(this.A00), string));
            }
        }
        this.A00 = new C135916sy(A13, A132, A133, A134);
    }
}
