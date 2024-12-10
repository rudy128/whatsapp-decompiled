package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1dT  reason: invalid class name and case insensitive filesystem */
public final class C30151dT implements C24411Kf {
    public C30351dn A00;
    public boolean A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = new C18110vm(new C30171dV(this));
    public final C18100vl A05 = new C18110vm(new C30161dU(this));
    public final AnonymousClass00H A06;

    public C30151dT(C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        this.A03 = r4;
        this.A06 = r5;
        this.A02 = r3;
    }

    public static final AnonymousClass19Y A00(C30151dT r0) {
        Object obj = r0.A06.get();
        C18070vi.A0X(obj);
        return (AnonymousClass19Y) obj;
    }

    public static final void A02(C30151dT r11) {
        C30351dn r8 = r11.A00;
        if (r8 != null) {
            r8.A02++;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long currentMonotonicTimestampNanos = r8.A09.currentMonotonicTimestampNanos();
            long j = r8.A08;
            if (TimeUnit.MILLISECONDS.toSeconds(timeUnit.toMillis(currentMonotonicTimestampNanos - j)) >= ((long) ((Number) r11.A04.getValue()).intValue())) {
                Long l = r8.A05;
                AnonymousClass19T r10 = r8.A09;
                long currentMonotonicTimestampNanos2 = r10.currentMonotonicTimestampNanos();
                if (l != null) {
                    r8.A03 += currentMonotonicTimestampNanos2 - l.longValue();
                    r8.A05 = null;
                }
                A00(r11).markerAnnotate(125908665, "foreground_time_ms", TimeUnit.NANOSECONDS.toMillis(r8.A03));
                A00(r11).markerAnnotate(125908665, "drift_time_ms", ((TimeUnit.NANOSECONDS.toMillis(r10.currentMonotonicTimestampNanos() - j) / 1000) - ((long) r8.A02)) * 1000);
                A00(r11).markerEnd(125908665, 2);
                r8.A00 = 0;
                r11.A00 = null;
                return;
            }
            ((C200710s) r11.A05.getValue()).A05(new C448925e(r11, 0), 1000);
        }
    }

    public static final boolean A04(C30151dT r1) {
        if (((Number) r1.A04.getValue()).intValue() > 0) {
            return true;
        }
        return false;
    }

    public final long A05() {
        C30351dn r0 = this.A00;
        long j = 0;
        if (r0 == null) {
            return 0;
        }
        long j2 = r0.A03;
        Long l = r0.A05;
        if (l != null) {
            j = A00(this).A01.currentMonotonicTimestampNanos() - l.longValue();
        }
        return TimeUnit.NANOSECONDS.toMillis(j2 + j);
    }

    public static final void A01(C30151dT r6) {
        if (A04(r6) && r6.A00 == null) {
            C30351dn r2 = new C30351dn(A00(r6), r6.A01);
            AnonymousClass19Y A002 = A00(r6);
            C30371dp r4 = new C30371dp(125908665);
            r4.A00(r2.A06, "health_log_id");
            r4.A00(Boolean.valueOf(r6.A01), "started_in_foreground");
            r4.A00(Integer.valueOf(((Number) r6.A04.getValue()).intValue()), "log_length_seconds");
            r4.A02 = false;
            A002.Bj3(r4);
            if (A00(r6).A01.BfT(125908665)) {
                r6.A00 = r2;
                ((C200710s) r6.A05.getValue()).A05(new C449025f((Object) r6, 49), 1000);
            }
        }
    }

    public static final void A03(C30151dT r4, String str) {
        A00(r4).markerAnnotate(125908665, "invalid_health_log", true);
        A00(r4).markerAnnotate(125908665, str, true);
    }

    public void BlT() {
        if (A04(this)) {
            ((C200710s) this.A05.getValue()).execute(new C449025f((Object) this, 48));
        }
    }

    public void onAppBackgrounded() {
        if (A04(this)) {
            ((C200710s) this.A05.getValue()).execute(new C70593Bs(this, 30));
        }
    }
}
