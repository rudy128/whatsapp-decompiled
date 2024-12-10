package X;

import org.json.JSONObject;

/* renamed from: X.BVh  reason: case insensitive filesystem */
public final class C22919BVh extends C24473C5o implements C28514E4y {
    public final long A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C22919BVh bVh = (C22919BVh) obj;
            return this.A00 == bVh.A00 && this.A01 == bVh.A01;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass8BV.A00(this.A00) + (this.A01 ? 1 : 0);
    }

    public C22919BVh(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }

    public JSONObject CPJ() {
        JSONObject A15 = C17880vN.A15();
        A15.put("stale_age_s", this.A00);
        A15.put("is_itemized", this.A01);
        return A15;
    }
}
