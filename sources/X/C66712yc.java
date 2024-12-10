package X;

import android.os.SystemClock;

/* renamed from: X.2yc  reason: invalid class name and case insensitive filesystem */
public final class C66712yc implements C37431pX {
    public long A00 = 0;
    public boolean A01 = false;
    public final C27411Vz A02;
    public final AnonymousClass11P A03;

    public synchronized boolean isValid() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.A00 < 5000) {
            z = this.A01;
        } else {
            this.A00 = uptimeMillis;
            try {
                AnonymousClass1W0 r1 = this.A02.A00;
                C18070vi.A0X(r1);
                if (!r1.A03()) {
                    if (!r1.A02() || r1.A00 != 2) {
                        z = false;
                        this.A01 = z;
                    }
                }
                z = true;
                this.A01 = z;
            } catch (Exception unused) {
                z = false;
                this.A01 = false;
            }
        }
        return z;
    }

    public C66712yc(C27411Vz r3, AnonymousClass11P r4) {
        C18070vi.A0j(r3, r4);
        this.A03 = r4;
        this.A02 = r3;
    }
}
