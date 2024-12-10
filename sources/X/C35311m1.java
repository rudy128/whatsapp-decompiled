package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1m1  reason: invalid class name and case insensitive filesystem */
public class C35311m1 {
    public static final List A0F = Arrays.asList(new String[]{"action_schedule_call", "action_schedule_call_advance_alert"});
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1V7 A02;
    public final AnonymousClass1R8 A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass121 A05;
    public final C27081Uq A06;
    public final C18030ve A07;
    public final C200710s A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass11C A0C;
    public final AnonymousClass11P A0D;
    public final AnonymousClass10I A0E;

    public void A00(long j) {
        ArrayList arrayList = new ArrayList();
        for (String action : A0F) {
            Intent intent = new Intent(this.A04.A00, ScheduleCallBroadcastReceiver.class);
            intent.setAction(action);
            arrayList.add(intent);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Intent intent2 = (Intent) it.next();
            PendingIntent A012 = C1408573i.A01(this.A04.A00, (int) j, intent2, 1610612736);
            if (A012 == null) {
                intent2.getAction();
                return;
            }
            AlarmManager A052 = this.A0C.A05();
            if (A052 != null) {
                A052.cancel(A012);
                A012.cancel();
            } else {
                return;
            }
        }
    }

    public void A01(long j, PendingIntent pendingIntent) {
        AlarmManager A052 = this.A0C.A05();
        if (A052 != null) {
            long j2 = j;
            PendingIntent pendingIntent2 = pendingIntent;
            if (!AnonymousClass112.A08() || this.A03.A00.A00()) {
                A052.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
            } else {
                A052.setWindow(0, j2, 600000, pendingIntent2);
            }
        }
    }

    public void A02(long j, boolean z, long j2) {
        ArrayList arrayList = new ArrayList();
        for (String action : A0F) {
            Intent intent = new Intent(this.A04.A00, ScheduleCallBroadcastReceiver.class);
            intent.setAction(action);
            intent.putExtra("extra_message_row_id", j);
            intent.putExtra("extra_scheduled_call_timestamp_ms", j2);
            arrayList.add(intent);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Intent intent2 = (Intent) it.next();
            PendingIntent A012 = C1408573i.A01(this.A04.A00, (int) j, intent2, 1073741824);
            if (!"action_schedule_call_advance_alert".equals(intent2.getAction())) {
                A01(j2, A012);
            } else if (z && j2 - System.currentTimeMillis() > 60000) {
                A01(j2 - 60000, A012);
            }
        }
    }

    public void A03(AnonymousClass1BI r4, AnonymousClass3LG r5) {
        if (r4 != null) {
            this.A0E.CGN(new AnonymousClass3C5(this, r4, r5, 38));
        }
    }

    public C35311m1(AnonymousClass1KB r3, AnonymousClass11S r4, AnonymousClass1V7 r5, AnonymousClass1R8 r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, AnonymousClass121 r10, C27081Uq r11, C18030ve r12, AnonymousClass10I r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16) {
        this.A0D = r8;
        this.A07 = r12;
        this.A00 = r3;
        this.A04 = r9;
        this.A0E = r13;
        this.A03 = r6;
        this.A01 = r4;
        this.A0C = r7;
        this.A06 = r11;
        this.A02 = r5;
        this.A0A = r14;
        this.A05 = r10;
        this.A09 = r15;
        this.A0B = r16;
        this.A08 = new C200710s(r13, true);
    }
}
