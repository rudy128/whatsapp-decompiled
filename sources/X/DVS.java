package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;

public final /* synthetic */ class DVS implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26810DEs A01;

    public final Object call() {
        C26810DEs dEs = this.A01;
        long j = this.A00;
        if (dEs.A0e) {
            C25815CmS cmS = dEs.A08;
            C28111Yx.A02(cmS);
            cmS.A02(C25815CmS.A0Q, Long.valueOf(SystemClock.elapsedRealtime()));
            C26810DEs.A05(dEs);
            C25815CmS cmS2 = dEs.A08;
            C28111Yx.A02(cmS2);
            cmS2.A02(C25815CmS.A0P, Long.valueOf(j));
            return dEs.A08;
        }
        throw AnonymousClass000.A0n("Not recording video.");
    }

    public /* synthetic */ DVS(C26810DEs dEs, long j) {
        this.A01 = dEs;
        this.A00 = j;
    }
}
