package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.A6s  reason: case insensitive filesystem */
public abstract class C20090A6s {
    public static final String A00 = A5Z.A01("Alarms");

    public static void A00(AlarmManager alarmManager, PendingIntent pendingIntent, long j) {
        alarmManager.setExact(0, j, pendingIntent);
    }

    public static void A02(Context context, C193279pp r7, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
        A07.setAction("ACTION_DELAY_MET");
        C20350AHg.A00(A07, r7);
        int i2 = 536870912;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, i, A07, i2);
        if (service != null && alarmManager != null) {
            A5Z A002 = A5Z.A00();
            String str = A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Cancelling existing alarm with (workSpecId, systemId) (");
            A10.append(r7);
            A10.append(", ");
            A10.append(i);
            AnonymousClass8BW.A16(A002, ")", str, A10);
            alarmManager.cancel(service);
        }
    }

    public static void A03(Context context, C193279pp r5, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        }
        Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
        A07.setAction("ACTION_DELAY_MET");
        C20350AHg.A00(A07, r5);
        PendingIntent service = PendingIntent.getService(context, i, A07, i2);
        if (alarmManager != null) {
            A00(alarmManager, service, j);
        }
    }

    public static void A01(Context context, WorkDatabase workDatabase, C193279pp r7, long j) {
        BA3 A0B = workDatabase.A0B();
        C194169rH Ba3 = A0B.Ba3(r7);
        if (Ba3 != null) {
            int i = Ba3.A01;
            A02(context, r7, i);
            A03(context, r7, i, j);
            return;
        }
        AnonymousClass9UM r3 = new AnonymousClass9UM(workDatabase);
        int A03 = AnonymousClass8BU.A03(r3.A00.A04(new C21490Akz(r3, 1)));
        A0B.Bde(new C194169rH(r7.A01, r7.A00, A03));
        A03(context, r7, A03, j);
    }
}
