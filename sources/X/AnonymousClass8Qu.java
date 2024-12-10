package X;

import org.json.JSONObject;

/* renamed from: X.8Qu  reason: invalid class name */
public final class AnonymousClass8Qu extends C24473C5o implements C28514E4y {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass8Qu r8 = (AnonymousClass8Qu) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A04 == r8.A04;
        }
        return false;
    }

    public static AnonymousClass8Qu A00(JSONObject jSONObject) {
        C191269mI r9 = new C191269mI();
        long optLong = jSONObject.optLong("max_size", 0);
        long optLong2 = jSONObject.optLong("max_size_low_space_bytes", 0);
        long optLong3 = jSONObject.optLong("max_size_very_low_space_bytes", 0);
        if (optLong <= 0 && optLong2 <= 0 && optLong3 <= 0) {
            return null;
        }
        r9.A00 = optLong;
        r9.A01 = optLong2;
        r9.A02 = optLong3;
        r9.A03 = jSONObject.optBoolean("delete_only_on_init", false);
        r9.A04 = jSONObject.optBoolean("is_itemized", false);
        return r9.A00();
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        long j3 = this.A02;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }

    public AnonymousClass8Qu(long j, long j2, long j3, boolean z, boolean z2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = z;
        this.A04 = z2;
    }

    public String A01() {
        return "max_size";
    }

    public JSONObject CPJ() {
        JSONObject A15 = C17880vN.A15();
        A15.put("max_size", this.A00);
        A15.put("max_size_low_space_bytes", this.A01);
        A15.put("max_size_very_low_space_bytes", this.A02);
        A15.put("delete_only_on_init", this.A03);
        A15.put("is_itemized", this.A04);
        return A15;
    }
}
