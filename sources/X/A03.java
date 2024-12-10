package X;

import org.json.JSONObject;

public class A03 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;

    public A03(C29621ca r3, long j, long j2) {
        this.A03 = j;
        this.A01 = r3.A09("redeemed_count");
        this.A00 = r3.A09("reserved_count");
        this.A04 = "1".equalsIgnoreCase(r3.A0P("is_eligible"));
        this.A02 = j2;
    }

    public String A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("offer_id", this.A03);
        A15.put("is_eligible", this.A04);
        A15.put("pending_count", this.A00);
        A15.put("redeemed_count", this.A01);
        A15.put("last_sync_time_ms", this.A02);
        return A15.toString();
    }

    public A03(String str) {
        JSONObject A16 = C17880vN.A16(str);
        this.A03 = A16.getLong("offer_id");
        this.A04 = A16.getBoolean("is_eligible");
        this.A00 = A16.getInt("pending_count");
        this.A01 = A16.getInt("redeemed_count");
        this.A02 = A16.getLong("last_sync_time_ms");
    }
}
