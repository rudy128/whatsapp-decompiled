package X;

import org.json.JSONObject;

/* renamed from: X.8uw  reason: invalid class name and case insensitive filesystem */
public class C173358uw extends A3R {
    public final A69 A00;
    public final AnonymousClass1V7 A01;
    public final C20047A4q A02;

    public JSONObject A00(C60012nF r3, JSONObject jSONObject) {
        if (!AnonymousClass8BT.A1Y(this.A02.A02(r3, jSONObject.getJSONObject("payload").getString("call_id")))) {
            return A3R.A06("There is no call with that call id", 17);
        }
        this.A01.A00(this.A00);
        return A3R.A04();
    }

    public C173358uw(A69 a69, AnonymousClass1V7 r2, C20047A4q a4q) {
        this.A00 = a69;
        this.A02 = a4q;
        this.A01 = r2;
    }
}
