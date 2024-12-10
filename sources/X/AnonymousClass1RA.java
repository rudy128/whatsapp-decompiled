package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.1RA  reason: invalid class name */
public class AnonymousClass1RA extends AnonymousClass1R9 {
    public final AnonymousClass11C A00;

    public boolean A02(PendingIntent pendingIntent, int i, long j, boolean z) {
        AlarmManager A05;
        if (pendingIntent == null || (A05 = this.A00.A05()) == null) {
            return false;
        }
        A05.setExactAndAllowWhileIdle(i, j, pendingIntent);
        return true;
    }

    public AnonymousClass1RA(AnonymousClass11C r1) {
        super(r1);
        this.A00 = r1;
    }
}
