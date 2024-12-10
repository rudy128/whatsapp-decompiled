package X;

import org.json.JSONObject;

/* renamed from: X.9xS  reason: invalid class name and case insensitive filesystem */
public class C197899xS {
    public final int A00;
    public final boolean A01;

    public C197899xS(String str, Long l) {
        int intValue;
        if (l == null) {
            intValue = -1;
        } else {
            intValue = l.intValue();
        }
        this.A00 = intValue;
        this.A01 = "1".equals(str);
    }

    public C197899xS(String str) {
        JSONObject A16 = C17880vN.A16(str);
        this.A00 = A16.getInt("max_from_sender");
        this.A01 = A16.getBoolean("usync_pay_eligible_offers_includes_current_offer_id");
    }
}
