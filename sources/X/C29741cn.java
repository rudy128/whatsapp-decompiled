package X;

import com.whatsapp.util.Log;

/* renamed from: X.1cn  reason: invalid class name and case insensitive filesystem */
public class C29741cn {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C29741cn r7 = (C29741cn) obj;
            return this.A00 == r7.A00 && this.A01 == r7.A01;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A01;
        return (this.A00 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("growthLockLevel: ");
        sb.append(this.A00);
        sb.append(", expirationTimestamp: ");
        sb.append(this.A01);
        return sb.toString();
    }

    public C29741cn(int i, long j) {
        this.A00 = i;
        if (i != 0 || j == 0) {
            this.A01 = j;
        } else {
            Log.e("GrowthLock Nonzero expiration for unlocked GrowthLock");
        }
    }
}
