package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;

/* renamed from: X.10X  reason: invalid class name */
public class AnonymousClass10X {
    public final Handler A00;
    public final HandlerThread A01;
    public final SparseArray A02 = new SparseArray();
    public final AnonymousClass10I A03;
    public volatile boolean A04;

    public void A00(Runnable runnable, int i, boolean z) {
        C200710s r4;
        if (!this.A04) {
            synchronized (this) {
                SparseArray sparseArray = this.A02;
                r4 = (C200710s) sparseArray.get(i);
                if (r4 == null) {
                    r4 = new C200710s(this.A03, true);
                    sparseArray.put(i, r4);
                }
            }
            if (z) {
                this.A00.postDelayed(new C448825d(r4, runnable, 14), 100);
            } else {
                r4.execute(runnable);
            }
        }
    }

    public AnonymousClass10X(AnonymousClass10I r4) {
        this.A03 = r4;
        HandlerThread handlerThread = new HandlerThread("light-prefs-save-scheduler", -2);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
