package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.4I2  reason: invalid class name */
public abstract class AnonymousClass4I2 {
    public static final void A00(Throwable th, C108585bw r3) {
        CancellationException cancellationException = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null)) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        r3.BEM(cancellationException);
    }
}
