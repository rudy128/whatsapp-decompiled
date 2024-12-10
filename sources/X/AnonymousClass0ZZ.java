package X;

import android.view.Choreographer;

/* renamed from: X.0ZZ  reason: invalid class name */
public final class AnonymousClass0ZZ implements Runnable, Choreographer.FrameCallback {
    public final /* synthetic */ C15290qO A00;

    public AnonymousClass0ZZ(C15290qO r1) {
        this.A00 = r1;
    }

    public void doFrame(long j) {
        C15290qO r1 = this.A00;
        r1.A05.removeCallbacks(this);
        r1.A06();
        C15290qO.A09(r1, j);
    }

    public void run() {
        C15290qO r2 = this.A00;
        r2.A06();
        synchronized (r2.A04) {
            if (r2.A01.isEmpty()) {
                r2.A0E().removeFrameCallback(this);
                r2.A02 = false;
            }
        }
    }
}
