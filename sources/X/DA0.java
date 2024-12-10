package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.UUID;

public final class DA0 implements C28572E8d {
    public long A00;
    public C25732Cl2 A01 = C25732Cl2.A05;
    public boolean A02;
    public long A03;
    public final C28617EAp A04;

    public void A00() {
        if (this.A02) {
            A01(BXM());
            this.A02 = false;
        }
    }

    public void A01(long j) {
        this.A03 = j;
        if (this.A02) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public C25732Cl2 BXC() {
        return this.A01;
    }

    public long BXM() {
        long j;
        long j2 = this.A03;
        if (!this.A02) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C25732Cl2 cl2 = this.A01;
        if (cl2.A01 == 1.0f) {
            UUID uuid = C24736CHy.A04;
            j = Util.A04(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) cl2.A02);
        }
        return j2 + j;
    }

    public C25732Cl2 CK1(C25732Cl2 cl2) {
        if (this.A02) {
            A01(BXM());
        }
        this.A01 = cl2;
        return cl2;
    }

    public DA0(C28617EAp eAp) {
        this.A04 = eAp;
    }
}
