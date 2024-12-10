package X;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2Bm  reason: invalid class name and case insensitive filesystem */
public class C45742Bm extends C195879u4 {
    public static volatile long A02;
    public final AnonymousClass11C A00;
    public final AnonymousClass2a5 A01;

    public void A04() {
        Log.i("HourlyCronAction; setting hourly cron using alarms");
        if (A03("com.whatsapp.action.HOURLY_CRON", 536870912) == null) {
            AlarmManager A05 = this.A00.A05();
            if (A05 != null) {
                A05.setInexactRepeating(3, SystemClock.elapsedRealtime() + 3600000, 3600000, A03("com.whatsapp.action.HOURLY_CRON", 0));
                return;
            }
            Log.w("HourlyCronAction; setup skipped, AlarmManager is null");
        }
    }

    public boolean A06(Intent intent) {
        return C17890vO.A1S(intent, "com.whatsapp.action.HOURLY_CRON");
    }

    public C45742Bm(Context context, AnonymousClass11C r2, AnonymousClass2a5 r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A05(Intent intent) {
        if (SystemClock.elapsedRealtime() - A02 < 1800000) {
            Log.i("HourlyCronAction; too soon, skipping...");
            return;
        }
        Log.i("HourlyCronAction; executing hourly cron");
        for (AnonymousClass1R4 Bvh : this.A01.A00) {
            Bvh.Bvh();
        }
        A02 = SystemClock.elapsedRealtime();
    }
}
