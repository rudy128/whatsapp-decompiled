package X;

import android.util.Log;

/* renamed from: X.BiC  reason: case insensitive filesystem */
public final class C23503BiC extends C25135CZl {
    public boolean A00 = true;
    public final C23494Bhy A01;
    public final C25549Chn A02 = new C25549Chn();
    public final Object A03 = C17880vN.A0p();

    public final void finalize() {
        synchronized (this.A03) {
            if (this.A00) {
                Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                A01();
            }
        }
    }

    public C23503BiC(C23494Bhy bhy) {
        this.A01 = bhy;
    }

    public final void A01() {
        super.A01();
        synchronized (this.A03) {
            if (this.A00) {
                this.A01.A01();
                this.A00 = false;
            }
        }
    }

    public C23503BiC() {
        throw AnonymousClass000.A0n("Default constructor called");
    }
}
