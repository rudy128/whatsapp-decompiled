package X;

import android.os.ConditionVariable;

/* renamed from: X.1Hc  reason: invalid class name and case insensitive filesystem */
public class C23651Hc extends AnonymousClass10T {
    public int A00;
    public boolean A01;
    public final ConditionVariable A02 = new ConditionVariable(false);
    public final AnonymousClass11A A03;
    public volatile int A04 = -1;
    public volatile int A05 = 3;
    public volatile boolean A06;
    public volatile boolean A07;

    public void A00(C26181Rd r3) {
        int i = this.A05;
        if (i == 1) {
            r3.BvS();
        } else if (i == 2) {
            r3.BvR();
        } else if (i == 3) {
            r3.BvT();
        } else if (i == 4) {
            r3.BvV();
        }
        registerObserver(r3);
    }

    public boolean A02() {
        if (this.A05 == 2) {
            return true;
        }
        return false;
    }

    public C23651Hc(AnonymousClass11A r3, AnonymousClass00H r4) {
        super(r4);
        this.A03 = r3;
    }

    public boolean A01() {
        if (!A02() || !this.A01) {
            return false;
        }
        return true;
    }
}
