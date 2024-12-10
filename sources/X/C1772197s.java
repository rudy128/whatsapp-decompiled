package X;

import org.json.JSONObject;

/* renamed from: X.97s  reason: invalid class name and case insensitive filesystem */
public final class C1772197s extends C436420i {
    public long A00;
    public String A01;

    public synchronized String A0P() {
        return C18070vi.A0H(C17880vN.A15().put("bizCallbackExpiryTimestamp", this.A00).put("outgoingFailedCallID", this.A01));
    }

    public synchronized void A0i(String str) {
        if (str != null) {
            JSONObject A16 = C17880vN.A16(str);
            this.A00 = A16.optLong("bizCallbackExpiryTimestamp");
            this.A01 = A16.optString("outgoingFailedCallID");
        }
    }
}
