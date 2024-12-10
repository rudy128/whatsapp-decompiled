package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.RescheduleReminderAlarmsWorker;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderCleanupWorker;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rh  reason: invalid class name and case insensitive filesystem */
public final class C62622rh {
    public static final long A05 = TimeUnit.DAYS.toMillis(2);
    public final AnonymousClass19K A00;
    public final AnonymousClass1R8 A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;

    public final void A02(AnonymousClass206 r9) {
        AnonymousClass206 r3 = r9;
        if (r9 != null) {
            long j = r9.A0x;
            AlarmManager A052 = this.A02.A05();
            if (A052 != null) {
                PendingIntent A002 = A00(r3, j, 0);
                A052.cancel(A002);
                A002.cancel();
            }
        }
    }

    public final void A03(AnonymousClass206 r15, long j) {
        AnonymousClass206 r9 = r15;
        if (r15 != null) {
            C162238Ju r3 = new C162238Ju(ScheduledReminderCleanupWorker.class, TimeUnit.HOURS, 24);
            r3.A02(5, TimeUnit.MINUTES);
            ((A7W) this.A00.get()).A02((C162258Jw) r3.A00(), AnonymousClass00R.A01, "schedule_reminder_cleanup_worker");
            A04(false);
            long j2 = r15.A0x;
            AlarmManager A052 = this.A02.A05();
            if (A052 != null) {
                long j3 = j;
                if (j >= 0 && j <= System.currentTimeMillis() + A05) {
                    PendingIntent A002 = A00(r9, j2, j3);
                    if (!AnonymousClass112.A08() || this.A01.A00.A00()) {
                        A052.setAlarmClock(new AlarmManager.AlarmClockInfo(j3, A002), A002);
                    } else {
                        A052.setWindow(0, j3, 600000, A002);
                    }
                }
            }
        }
    }

    public final PendingIntent A00(AnonymousClass206 r4, long j, long j2) {
        Context context = this.A04.A00;
        Intent intent = new Intent(context, ScheduledReminderMessageAlarmBroadcastReceiver.class);
        intent.putExtra("reminder_message_id", j);
        intent.putExtra("scheduled_time_in_ms", j2);
        intent.setAction("scheduled_reminder_message_broadcast_action");
        AnonymousClass4aU.A00(intent, r4.A0v);
        PendingIntent A06 = C17880vN.A06(context, intent, (int) j);
        C18070vi.A0X(A06);
        return A06;
    }

    public final void A01() {
        AnonymousClass19K r2 = this.A00;
        ((A7W) r2.get()).A0A("schedule_reminder_cleanup_worker");
        ((A7W) r2.get()).A0A("reschedule_reminder_worker");
    }

    public final void A04(boolean z) {
        Integer num;
        C162258Jw r3 = (C162258Jw) new C162238Ju(RescheduleReminderAlarmsWorker.class, TimeUnit.HOURS, 12).A00();
        if (z) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A01;
        }
        ((A7W) this.A00.get()).A02(r3, num, "reschedule_reminder_worker");
    }

    public C62622rh(AnonymousClass1R8 r1, AnonymousClass11C r2, AnonymousClass11P r3, AnonymousClass118 r4, AnonymousClass19K r5) {
        C18070vi.A0w(r1, r4, r2, r5, r3);
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A00 = r5;
        this.A03 = r3;
    }
}
