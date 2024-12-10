package X;

import org.json.JSONObject;

/* renamed from: X.464  reason: invalid class name */
public final class AnonymousClass464 extends C436420i {
    public String A00;
    public String A01;

    public synchronized String A0P() {
        JSONObject A15;
        A15 = C17880vN.A15();
        A15.put("ad_id", this.A01);
        A15.put("source_url", this.A00);
        return C18070vi.A0H(A15);
    }

    public synchronized void A0i(String str) {
        if (str != null) {
            JSONObject A16 = C17880vN.A16(str);
            this.A01 = A16.optString("ad_id");
            this.A00 = A16.optString("source_url");
        }
    }
}
