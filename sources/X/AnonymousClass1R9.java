package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.1R9  reason: invalid class name */
public class AnonymousClass1R9 {
    public final AnonymousClass11C A00;

    public boolean A00() {
        return true;
    }

    public boolean A01(PendingIntent pendingIntent, int i, long j) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        A05.setExact(i, j, pendingIntent);
        return true;
    }

    public boolean A02(PendingIntent pendingIntent, int i, long j, boolean z) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        A05.setExact(i, j, pendingIntent);
        return true;
    }

    public AnonymousClass1R9(AnonymousClass11C r1) {
        this.A00 = r1;
    }
}
