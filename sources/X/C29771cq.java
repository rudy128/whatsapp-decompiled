package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1cq  reason: invalid class name and case insensitive filesystem */
public class C29771cq {
    public int A00;
    public AnonymousClass2DO A01;
    public AnonymousClass2DP A02;
    public C36281nd A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final AnonymousClass18O A08;
    public final C23651Hc A09;
    public final AnonymousClass1R8 A0A;
    public final AnonymousClass11C A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass118 A0D;
    public final C18030ve A0E;
    public final C200710s A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I = new C18150vq((Object) null, new C70943Dc(this, 15));
    public final AnonymousClass00H A0J = new C18150vq((Object) null, new C70943Dc(this, 16));
    public volatile long A0K;

    private void A00() {
        C200710s r1 = this.A0F;
        r1.A02();
        if (A06(this)) {
            Log.i("ClientPingManager/periodic/cancel-delayed-runnable");
            r1.A04((Runnable) this.A0I.get());
            return;
        }
        Log.i("ClientPingManager/periodic/cancel-alarm");
        A09(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
    }

    public static void A01(C29771cq r2) {
        C200710s r1 = r2.A0F;
        r1.A02();
        if (A06(r2)) {
            Log.i("ClientPingManager/timeout/cancel-delayed-runnable");
            r1.A04((Runnable) r2.A0J.get());
            return;
        }
        Log.i("ClientPingManager/timeout/cancel-alarm");
        r2.A09(new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"));
    }

    public static void A02(C29771cq r6) {
        Log.i("ClientPingManager/on-disconnected");
        C200710s r5 = r6.A0F;
        r5.A02();
        if (!r6.A05) {
            Log.w("ClientPingManager/on-disconnected; not connected, ignoring...");
            return;
        }
        if (r6.A0K > 0) {
            A01(r6);
        }
        r5.A02();
        if (r6.A02 != null) {
            ((C29831cw) r6.A0H.get()).A02(r6.A02, r6.A0D.A00);
            r6.A02 = null;
        }
        r6.A00();
        r5.A02();
        if (r6.A01 != null) {
            ((C29831cw) r6.A0H.get()).A02(r6.A01, r6.A0D.A00);
            r6.A01 = null;
        }
        r6.A03 = null;
        r6.A05 = false;
    }

    public static void A03(C29771cq r2) {
        String str;
        Log.i("ClientPingManager/ping-timeout");
        r2.A0F.A02();
        if (!r2.A05 || r2.A03 == null) {
            str = "ClientPingManager/ping-timeout; not connected, ignoring.";
        } else if (!r2.A09.A07) {
            str = "ClientPingManager/ping-timeout; xmpp connection is not ready, ignoring.";
        } else if (r2.A06) {
            str = "ClientPingManager/ping-timeout; already notified about timeout, ignoring.";
        } else {
            ((Handler) r2.A03).obtainMessage(8).sendToTarget();
            r2.A06 = true;
            A01(r2);
            return;
        }
        Log.w(str);
    }

    public static void A04(C29771cq r6) {
        Log.i("ClientPingManager/send-ping");
        C200710s r5 = r6.A0F;
        r5.A02();
        if (!r6.A05 || r6.A03 == null) {
            Log.w("ClientPingManager/send-ping; not connected, ignoring.");
        } else if (r6.A0K > 0) {
            Log.w("ClientPingManager/send-ping; skipping ping request, pending ping already exists.");
            if (r6.A0K > 0 && SystemClock.elapsedRealtime() > r6.A0K + r6.A07()) {
                A03(r6);
            }
        } else {
            r6.A00();
            r6.A0K = SystemClock.elapsedRealtime();
            r6.A06 = false;
            r5.A02();
            if (A06(r6)) {
                Log.i("ClientPingManager/timeout/schedule-delayed-runnable");
                AnonymousClass00H r3 = r6.A0J;
                r5.A04((Runnable) r3.get());
                r5.A05((Runnable) r3.get(), r6.A07());
            } else {
                Log.i("ClientPingManager/timeout/schedule-alarm");
                if (!r6.A0A.A00(C1408573i.A01(r6.A0D.A00, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + r6.A07())) {
                    Log.w("ClientPingManager/timeout/schedule-alarm; failed to schedule alarm");
                }
            }
            r6.A0B((Runnable) null);
            r6.A00++;
        }
    }

    public static void A05(C29771cq r6) {
        long j;
        long j2;
        C200710s r3 = r6.A0F;
        r3.A02();
        if (A06(r6)) {
            Log.i("ClientPingManager/periodic/schedule-delayed-runnable");
            if (r6.A00 == 0) {
                j2 = 15000;
            } else {
                j2 = 240000;
            }
            r3.A05((Runnable) r6.A0I.get(), j2);
            return;
        }
        Log.i("ClientPingManager/periodic/schedule-alarm");
        Context context = r6.A0D.A00;
        AlarmManager A052 = r6.A0B.A05();
        if (A052 == null) {
            Log.w("ClientPingManager/periodic/schedule-alarm; alarm manager is null");
            return;
        }
        PendingIntent A012 = C1408573i.A01(context, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"), 134217728);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (r6.A00 == 0) {
            j = 15000;
        } else {
            j = 240000;
        }
        long j3 = elapsedRealtime + j;
        int i = 2;
        if (r6.A04) {
            i = 3;
        }
        A052.set(i, j3, A012);
    }

    public static boolean A06(C29771cq r2) {
        if (r2.A04) {
            if (!C18020vd.A05(C18040vf.A01, r2.A0E, 6493)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long A07() {
        return Math.min(32000, Math.max(8000, (long) (this.A08.A04(AnonymousClass18O.A1I) * 1000)));
    }

    public void A08() {
        Log.i("ClientPingManager/on-demand-ping");
        this.A0F.execute(new C70583Br(this, 34));
    }

    public void A09(Intent intent) {
        PendingIntent A012 = C1408573i.A01(this.A0D.A00, 0, intent, 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A0B.A05();
            if (A052 == null) {
                Log.w("ClientPingManager/cancel-alarm; service is null");
                return;
            }
            A052.cancel(A012);
            A012.cancel();
        }
    }

    public void A0A(AnonymousClass1O5 r9, long j) {
        AnonymousClass00H r2 = this.A0G;
        String A0B2 = ((AnonymousClass1OZ) r2.get()).A0B();
        AnonymousClass1O5 r22 = r9;
        ((AnonymousClass1OZ) r2.get()).A0I(r22, (C29621ca) new AnonymousClass9F7(A0B2, 11).A00, A0B2, 22, j);
    }

    public void A0B(Runnable runnable) {
        AnonymousClass00H r2 = this.A0G;
        String A0B2 = ((AnonymousClass1OZ) r2.get()).A0B();
        AnonymousClass9F7 r0 = new AnonymousClass9F7(A0B2, 11);
        ((AnonymousClass1OZ) r2.get()).A0I(new AnonymousClass372(this, r0, runnable), (C29621ca) r0.A00, A0B2, 22, 32000);
    }

    public C29771cq(AnonymousClass18O r5, C23651Hc r6, AnonymousClass1R8 r7, AnonymousClass11C r8, AnonymousClass11P r9, AnonymousClass118 r10, C18030ve r11, AnonymousClass10I r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        Looper A002 = ((C25151Nc) r15.get()).A00();
        this.A0C = r9;
        this.A0E = r11;
        this.A0A = r7;
        this.A0D = r10;
        this.A08 = r5;
        this.A0G = r13;
        this.A0F = new C200710s(r12, true);
        this.A0B = r8;
        this.A07 = new Handler(A002);
        this.A09 = r6;
        this.A0H = r14;
    }
}
