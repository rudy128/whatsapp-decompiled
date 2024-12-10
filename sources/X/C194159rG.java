package X;

import android.app.Notification;

/* renamed from: X.9rG  reason: invalid class name and case insensitive filesystem */
public final class C194159rG {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C194159rG r4 = (C194159rG) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.A01);
        sb.append(", mForegroundServiceType=");
        sb.append(this.A00);
        sb.append(", mNotification=");
        return AnonymousClass8BX.A0c(this.A02, sb);
    }

    public C194159rG(int i, Notification notification, int i2) {
        this.A01 = i;
        this.A02 = notification;
        this.A00 = i2;
    }
}
