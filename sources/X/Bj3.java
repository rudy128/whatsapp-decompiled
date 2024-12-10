package X;

import android.app.PendingIntent;

public final class Bj3 extends D3I {
    public final PendingIntent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof D3I) {
                Bj3 bj3 = (Bj3) ((D3I) obj);
                if (!this.A00.equals(bj3.A00) || this.A01 != bj3.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() ^ 1000003;
        int i = 1231;
        if (true != this.A01) {
            i = 1237;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String obj = this.A00.toString();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReviewInfo{pendingIntent=");
        A10.append(obj);
        A10.append(", isNoOp=");
        A10.append(this.A01);
        return AnonymousClass000.A0y("}", A10);
    }

    public Bj3(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.A00 = pendingIntent;
            this.A01 = z;
            return;
        }
        throw AnonymousClass000.A0s("Null pendingIntent");
    }
}
