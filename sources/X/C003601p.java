package X;

import android.content.IntentFilter;
import android.location.Location;
import android.util.Log;
import java.util.Calendar;

/* renamed from: X.01p  reason: invalid class name and case insensitive filesystem */
public class C003601p extends AnonymousClass01Y {
    public final C003501o A00;
    public final /* synthetic */ AnonymousClass01V A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C003601p(AnonymousClass01V r1, C003501o r2) {
        super(r1);
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object, X.0IO] */
    public int A00() {
        long j;
        C003501o r3 = this.A00;
        AnonymousClass0HK r4 = r3.A01;
        if (r4.A00 <= System.currentTimeMillis()) {
            Location A002 = C003501o.A00(r3);
            if (A002 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                AnonymousClass0IO r9 = AnonymousClass0IO.A03;
                AnonymousClass0IO r92 = r9;
                if (r9 == null) {
                    ? obj = new Object();
                    AnonymousClass0IO.A03 = obj;
                    r92 = obj;
                }
                r92.A00(A002.getLatitude(), A002.getLongitude(), currentTimeMillis - 86400000);
                r92.A00(A002.getLatitude(), A002.getLongitude(), currentTimeMillis);
                boolean z = false;
                if (r92.A00 == 1) {
                    z = true;
                }
                long j2 = r92.A01;
                long j3 = r92.A02;
                r92.A00(A002.getLatitude(), A002.getLongitude(), currentTimeMillis + 86400000);
                long j4 = r92.A01;
                if (j2 == -1 || j3 == -1) {
                    j = 43200000 + currentTimeMillis;
                } else {
                    if (currentTimeMillis <= j3) {
                        if (currentTimeMillis > j2) {
                            j4 = j3;
                        } else {
                            j4 = j2;
                        }
                    }
                    j = j4 + 60000;
                }
                r4.A01 = z;
                r4.A00 = j;
            } else {
                Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                int i = Calendar.getInstance().get(11);
                if (i < 6 || i >= 22) {
                    return 2;
                }
                return 1;
            }
        }
        if (r4.A01) {
            return 2;
        }
        return 1;
    }

    public IntentFilter A01() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    public void A04() {
        AnonymousClass01V.A0Q(this.A01, true, true);
    }
}
