package X;

import android.os.Looper;
import android.util.Log;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.Cbw  reason: case insensitive filesystem */
public final class C25257Cbw {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Looper A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C28491E3w A08;
    public final Timeline A09;
    public final D9J A0A;
    public final C28617EAp A0B;

    public synchronized void A03(boolean z) {
        this.A05 = z | this.A05;
        this.A06 = true;
        notifyAll();
    }

    public void A00() {
        C26056CrS.A03(!this.A07);
        this.A07 = true;
        D9J d9j = this.A0A;
        synchronized (d9j) {
            if (d9j.A0N) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A03(false);
            } else {
                C25646Cjc.A00(d9j.A0g, this, 14);
            }
        }
    }

    public void A01(int i) {
        C26056CrS.A03(!this.A07);
        this.A01 = i;
    }

    public void A02(Object obj) {
        C26056CrS.A03(!this.A07);
        this.A04 = obj;
    }

    public C25257Cbw(Looper looper, D9J d9j, C28491E3w e3w, Timeline timeline, C28617EAp eAp, int i) {
        this.A0A = d9j;
        this.A08 = e3w;
        this.A09 = timeline;
        this.A03 = looper;
        this.A0B = eAp;
        this.A00 = i;
    }
}
