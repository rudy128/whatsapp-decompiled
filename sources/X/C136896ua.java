package X;

import android.os.SystemClock;

/* renamed from: X.6ua  reason: invalid class name and case insensitive filesystem */
public final class C136896ua {
    public Long A00;
    public Long A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass18K A03;
    public final C1184263k A04;

    public final synchronized void A00() {
        Long l = this.A00;
        if (l != null) {
            long longValue = l.longValue();
            this.A04.A03 = C108945cZ.A1B(SystemClock.uptimeMillis(), longValue);
            this.A00 = null;
        }
    }

    public final synchronized void A01() {
        Long l = this.A01;
        if (l != null) {
            long longValue = l.longValue();
            this.A04.A05 = C108945cZ.A1B(SystemClock.uptimeMillis(), longValue);
            this.A01 = null;
        }
    }

    public final synchronized void A02() {
        this.A01 = Long.valueOf(SystemClock.uptimeMillis());
    }

    public final synchronized void A03() {
        this.A03.CC7(this.A04);
    }

    public final synchronized void A04(Boolean bool, Integer num, Long l, Long l2) {
        int intValue = num.intValue();
        C1184263k r2 = this.A04;
        r2.A02 = Integer.valueOf(intValue);
        if (bool != null) {
            r2.A00 = bool;
        }
        if (l2 != null) {
            r2.A04 = Long.valueOf(l2.longValue());
        }
        if (l != null) {
            r2.A06 = Long.valueOf(l.longValue());
        }
    }

    public C136896ua(AnonymousClass11P r3, AnonymousClass18K r4, int i) {
        C18070vi.A0j(r3, r4);
        this.A02 = r3;
        this.A03 = r4;
        C1184263k r1 = new C1184263k();
        this.A04 = r1;
        synchronized (this) {
            r1.A01 = Integer.valueOf(i);
        }
    }
}
