package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tz  reason: invalid class name and case insensitive filesystem */
public final class C172768tz extends C199129zU {
    public final C20125A8k A00;
    public final JSONArray A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172768tz(C20125A8k a8k, JSONArray jSONArray) {
        super(a8k, jSONArray);
        C18070vi.A0j(a8k, jSONArray);
        this.A00 = a8k;
        this.A01 = jSONArray;
        boolean z = true;
        this.A02 = AnonymousClass000.A1R(a8k.A00.length());
        this.A03 = this.A01.length() <= 0 ? false : z;
    }

    public String toString() {
        String A002;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MexResponse(data=");
        JSONObject jSONObject = this.A00.A00;
        if (jSONObject == null) {
            A002 = "";
        } else {
            A002 = C181379Qg.A00("", jSONObject, false);
        }
        A10.append(A002);
        A10.append(", errors=[");
        A10.append(this.A01.length());
        return AnonymousClass000.A0y("])", A10);
    }
}
