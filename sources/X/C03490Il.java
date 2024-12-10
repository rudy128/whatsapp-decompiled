package X;

import android.os.CancellationSignal;
import android.util.Log;

/* renamed from: X.0Il  reason: invalid class name and case insensitive filesystem */
public class C03490Il {
    public CancellationSignal A00;
    public C42621yT A01;
    public final C15960rU A02 = new AnonymousClass0SO(this);

    public void A01() {
        CancellationSignal cancellationSignal = this.A00;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            this.A00 = null;
        }
        C42621yT r0 = this.A01;
        if (r0 != null) {
            try {
                r0.A01();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
            }
            this.A01 = null;
        }
    }

    public C42621yT A00() {
        C42621yT r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C42621yT BRh = this.A02.BRh();
        this.A01 = BRh;
        return BRh;
    }
}
