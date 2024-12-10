package X;

import android.os.SystemClock;

/* renamed from: X.CVc  reason: case insensitive filesystem */
public final class C25048CVc {
    public Exception A00;
    public long A01;

    public void A00(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Exception exc2 = this.A00;
        if (exc2 == null) {
            this.A00 = exc;
            exc2 = exc;
            this.A01 = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.A01) {
            if (exc2 != exc) {
                AnonymousClass0DT.A00(exc2, exc);
            }
            Exception exc3 = this.A00;
            this.A00 = null;
            throw exc3;
        }
    }
}
