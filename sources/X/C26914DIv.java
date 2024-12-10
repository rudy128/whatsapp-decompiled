package X;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIv  reason: case insensitive filesystem */
public final class C26914DIv implements E5F {
    public final boolean A00;
    public final C24924CPx A01;
    public final WeakReference A02;

    public final void C3H(C23203Bcx bcx) {
        C26905DIm dIm = (C26905DIm) this.A02.get();
        if (dIm != null) {
            C18210vx.A08(AnonymousClass000.A1Z(Looper.myLooper(), dIm.A0D.A05.A05), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = dIm.A0G;
            lock.lock();
            try {
                if (C26905DIm.A07(dIm, 0)) {
                    if (bcx.A01 != 0) {
                        C26905DIm.A01(bcx, this.A01, dIm, this.A00);
                    }
                    if (C26905DIm.A06(dIm)) {
                        C26905DIm.A04(dIm);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public C26914DIv(C24924CPx cPx, C26905DIm dIm, boolean z) {
        this.A02 = AnonymousClass3MW.A0z(dIm);
        this.A01 = cPx;
        this.A00 = z;
    }
}
