package X;

import android.os.Handler;
import android.os.SystemClock;

public class DGK implements C28606E9x {
    public final /* synthetic */ C26381Cyh A00;

    public void C0r(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C26381Cyh cyh = this.A00;
        Handler handler = cyh.A0l;
        Object[] A1a = BE6.A1a();
        BEA.A1U(A1a, z ? 1 : 0, i);
        AnonymousClass3MX.A1S(A1a, 2, elapsedRealtime);
        AnonymousClass8BR.A1L(A1a, 3, false);
        BE7.A17(handler, cyh, A1a, 9);
    }

    public void C8e() {
    }

    public DGK(C26381Cyh cyh) {
        this.A00 = cyh;
    }

    public void C0j() {
        this.A00.A0o.C0j();
    }

    public void C0p(C24399C1u c1u, C0Q c0q) {
        this.A00.A0P(c1u, c0q);
    }

    public void C0z(int i) {
        C26381Cyh cyh = this.A00;
        if (cyh.A0p.improveLooping && i == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Handler handler = cyh.A0l;
            Object[] A1b = AnonymousClass3MW.A1b();
            C17880vN.A1T(A1b, i, 0);
            AnonymousClass3MX.A1S(A1b, 1, elapsedRealtime);
            BE7.A17(handler, cyh, A1b, 38);
        }
    }

    public void CAS(C0Q c0q, String str) {
        this.A00.A0o.CAR(c0q.name(), "UNKNOWN", str);
    }

    public void C93(C26539D3a d3a) {
    }
}
