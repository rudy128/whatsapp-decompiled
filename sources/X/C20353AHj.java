package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.AHj  reason: case insensitive filesystem */
public class C20353AHj implements C22531BBo {
    public static final String A01 = A5Z.A01("SystemAlarmScheduler");
    public final Context A00;

    public boolean Bcf() {
        return true;
    }

    public void CGu(A2t... a2tArr) {
        for (A2t a2t : a2tArr) {
            A5Z A002 = A5Z.A00();
            String str = A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Scheduling work with workSpecId ");
            AnonymousClass8BW.A16(A002, a2t.A0M, str, A10);
            Context context = this.A00;
            C193279pp A003 = AnonymousClass9OL.A00(a2t);
            Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
            A07.setAction("ACTION_SCHEDULE_WORK");
            C20350AHg.A00(A07, A003);
            context.startService(A07);
        }
    }

    public void BEL(String str) {
        Context context = this.A00;
        Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
        A07.setAction("ACTION_STOP_WORK");
        A07.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(A07);
    }

    public C20353AHj(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
