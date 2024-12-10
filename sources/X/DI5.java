package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

public final class DI5 implements EDW, EDX {
    public final /* synthetic */ C26905DIm A00;

    public /* synthetic */ DI5(C26905DIm dIm) {
        this.A00 = dIm;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        C26905DIm dIm = this.A00;
        C18210vx.A00(dIm.A0E);
        EDR edr = dIm.A01;
        C18210vx.A00(edr);
        edr.CSj(new C23500Bi7(dIm));
    }

    public final void onConnectionFailed(C23203Bcx bcx) {
        C26905DIm dIm = this.A00;
        Lock lock = dIm.A0G;
        lock.lock();
        try {
            if (!dIm.A02 || bcx.A00()) {
                C26905DIm.A02(bcx, dIm);
            } else {
                C26905DIm.A03(dIm);
                C26905DIm.A04(dIm);
            }
        } finally {
            lock.unlock();
        }
    }
}
