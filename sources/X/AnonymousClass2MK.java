package X;

import org.json.JSONObject;

/* renamed from: X.2MK  reason: invalid class name */
public final class AnonymousClass2MK extends C436420i {
    public int A00;
    public int A01;

    public synchronized void A0i(String str) {
        if (str != null) {
            JSONObject A16 = C17880vN.A16(str);
            this.A00 = A16.getInt("bizOptOutAction");
            this.A01 = A16.getInt("bizOptOutCategory");
        }
    }
}
