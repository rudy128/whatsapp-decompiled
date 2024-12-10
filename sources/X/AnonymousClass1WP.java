package X;

import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1WP  reason: invalid class name */
public class AnonymousClass1WP {
    public AnonymousClass1WR A00;
    public ScheduledFuture A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass1Q9 A04;
    public final AnonymousClass1WU A05;
    public final AnonymousClass1WV A06;
    public final AnonymousClass1WV A07;
    public final C24681Lg A08;
    public final AnonymousClass00H A09;
    public final ScheduledThreadPoolExecutor A0A;

    public static synchronized void A00(AnonymousClass1WP r5, AnonymousClass1WV r6, long j, boolean z) {
        synchronized (r5) {
            long j2 = 0;
            if (j != 0) {
                r5.A09.get();
                C24521Kq r0 = C24521Kq.$redex_init_class;
                j2 = Math.max(C20113A7w.A0L, j);
            }
            ScheduledFuture scheduledFuture = r5.A01;
            if (scheduledFuture != null && !scheduledFuture.isDone() && r5.A01.getDelay(TimeUnit.MILLISECONDS) > j2 && !r5.A01.cancel(false)) {
                Log.e("EphemeralUpdateManager/scheduleRunnable/unable to cancel future");
            }
            if (j2 < 86400000) {
                ScheduledFuture<?> schedule = r5.A0A.schedule(r6, j2, TimeUnit.MILLISECONDS);
                r5.A01 = schedule;
                if (z) {
                    try {
                        schedule.get();
                    } catch (InterruptedException | ExecutionException e) {
                        Log.e("EphemeralUpdateManager/scheduleNextRun", e);
                    }
                }
            }
        }
        return;
    }

    public AnonymousClass1WP(AnonymousClass190 r23, AnonymousClass1M9 r24, AnonymousClass11P r25, AnonymousClass1LW r26, AnonymousClass1CJ r27, AnonymousClass122 r28, C26141Qz r29, AnonymousClass1Q9 r30, AnonymousClass1Q2 r31, AnonymousClass1WO r32, C24681Lg r33, C26111Qw r34, AnonymousClass1WN r35, AnonymousClass1WM r36, C202711m r37, C18030ve r38, AnonymousClass1W6 r39, AnonymousClass10I r40, AnonymousClass00H r41) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C18030ve r4 = r38;
        if (C18020vd.A05(C18040vf.A02, r4, 2335)) {
            scheduledThreadPoolExecutor = r40.BHn("ephemeral-update", 1, true);
        } else {
            scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new AnonymousClass1WQ());
            scheduledThreadPoolExecutor.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.A00 = new AnonymousClass1WT(this);
        AnonymousClass1Q9 r11 = r30;
        this.A04 = r11;
        AnonymousClass1WU r12 = new AnonymousClass1WU(this);
        this.A05 = r12;
        this.A08 = r33;
        this.A03 = r27;
        this.A02 = r24;
        AnonymousClass1WN r16 = r35;
        C26111Qw r15 = r34;
        AnonymousClass1WO r14 = r32;
        AnonymousClass1Q2 r13 = r31;
        AnonymousClass122 r9 = r28;
        AnonymousClass1W6 r20 = r39;
        AnonymousClass1LW r8 = r26;
        AnonymousClass11P r7 = r25;
        C202711m r18 = r37;
        AnonymousClass1WM r17 = r36;
        AnonymousClass190 r6 = r23;
        C26141Qz r10 = r29;
        C18030ve r19 = r4;
        this.A06 = new AnonymousClass1WV(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, 100);
        this.A07 = new AnonymousClass1WV(r6, r7, r8, r9, r10, r11, (AnonymousClass1WU) null, r13, r14, r15, r16, r17, r18, r19, r20, 0);
        this.A09 = r41;
        this.A0A = scheduledThreadPoolExecutor;
    }

    public void A01() {
        this.A0A.execute(new C70573Bq(this, 32));
    }

    public void A02(AnonymousClass1BI r2, String str) {
        this.A04.A00(r2, str);
    }

    public void A03(AnonymousClass1BI r5, String str) {
        AnonymousClass1Q9 r3 = this.A04;
        C18070vi.A0d(str, 1);
        Map map = r3.A02;
        Set set = (Set) map.get(r5);
        if (set != null) {
            set.remove(str);
            if (set.isEmpty()) {
                map.remove(r5);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("EphemeralSessionManager/null session: ");
            sb.append(r5);
            Log.e(sb.toString());
        }
        if (map.isEmpty()) {
            r3.A00 = -1;
        }
        if (r5 != null) {
            AnonymousClass206 A0E = r3.A01.A0E(r5);
            if (A0E == null) {
                return;
            }
            if (A0E.A05 <= 0 && !AnonymousClass25A.A0I(A0E.A0u)) {
                return;
            }
        }
        A01();
    }
}
