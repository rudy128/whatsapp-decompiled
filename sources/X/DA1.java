package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.UUID;

public final class DA1 implements C28572E8d {
    public long A00;
    public boolean A01;
    public long A02;
    public C25732Cl2 A03 = C25732Cl2.A05;
    public final C28617EAp A04;

    public synchronized void A00() {
        if (this.A01) {
            A01(BXM());
            this.A01 = false;
        }
    }

    public synchronized void A01(long j) {
        this.A02 = j;
        if (this.A01) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public synchronized long BXM() {
        long j;
        long j2;
        j = this.A02;
        if (this.A01) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
            C25732Cl2 cl2 = this.A03;
            if (cl2.A01 == 1.0f) {
                UUID uuid = C24736CHy.A04;
                j2 = Util.A04(elapsedRealtime);
            } else {
                j2 = elapsedRealtime * ((long) cl2.A02);
            }
            j += j2;
        }
        return j;
    }

    public synchronized C25732Cl2 CK1(C25732Cl2 cl2) {
        if (this.A01) {
            A01(BXM());
        }
        this.A03 = cl2;
        return cl2;
    }

    public C25732Cl2 BXC() {
        return this.A03;
    }

    public DA1(C28617EAp eAp) {
        this.A04 = eAp;
    }
}
