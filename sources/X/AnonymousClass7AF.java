package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7AF  reason: invalid class name */
public class AnonymousClass7AF implements C218317o {
    public long A00;
    public C200710s A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final A98 A05;
    public final AnonymousClass10I A06;
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public final AnonymousClass11P A08;

    public static synchronized void A00(C136266tX r6, C128686gW r7, AnonymousClass7AF r8) {
        int i;
        synchronized (r8) {
            if (r8.A07.get()) {
                Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of app lifecycle");
            } else if (r6 == null || (i = r6.A00) == 1 || i == 13 || i == 11) {
                Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of terminal result");
            } else if (System.currentTimeMillis() - r8.A00 > 900000) {
                Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of timeout");
            } else {
                C17960vV.A07(r6);
                int i2 = 5000;
                if (i == 12) {
                    i2 = 8000;
                }
                double d = (double) i2;
                double d2 = d * 0.8d;
                long random = (long) ((Math.random() * ((d * 1.2d) - d2)) + d2);
                C17900vP.A0m("FetchDeviceConfirmationPoller/onRequestComplete/scheduleNextRequest nextDelay: ", AnonymousClass000.A10(), random);
                r8.A01.A03();
                r8.A01.A05(new C146517Pk(r8, r7, 36), random);
            }
            r8.A01();
        }
    }

    public synchronized void A01() {
        Log.i("FetchDeviceConfirmationPoller/onRequestComplete/stopPolling");
        this.A07.set(true);
        C200710s r0 = this.A01;
        if (r0 != null) {
            r0.A03();
        }
    }

    public AnonymousClass7AF(AnonymousClass11C r3, AnonymousClass11P r4, AnonymousClass118 r5, C19830z4 r6, A98 a98, AnonymousClass10I r8) {
        this.A08 = r4;
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r3;
        this.A04 = r6;
        this.A05 = a98;
    }
}
