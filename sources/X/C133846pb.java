package X;

import android.os.SystemClock;

/* renamed from: X.6pb  reason: invalid class name and case insensitive filesystem */
public final class C133846pb {
    public int A00 = 1;
    public int A01 = -1;
    public long A02;
    public AnonymousClass1Be A03;
    public final AnonymousClass18K A04;

    public C133846pb(AnonymousClass18K r3) {
        C18070vi.A0d(r3, 1);
        this.A04 = r3;
    }

    public final void A00() {
        if (this.A01 == 1) {
            this.A01 = 0;
            this.A00 = 1;
        }
    }

    public final void A01(String str) {
        if (this.A01 != 1) {
            this.A01 = -1;
        } else if (this.A03 != null) {
            C1180662a r2 = new C1180662a();
            r2.A01 = Long.valueOf(SystemClock.elapsedRealtime() - this.A02);
            r2.A02 = str;
            r2.A00 = Integer.valueOf(this.A00);
            AnonymousClass18K r1 = this.A04;
            AnonymousClass1Be r0 = this.A03;
            if (r0 != null) {
                r1.CC8(r2, r0);
                this.A01 = -1;
                this.A00 = 1;
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }
}
