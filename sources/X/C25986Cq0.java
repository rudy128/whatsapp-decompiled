package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.Cq0  reason: case insensitive filesystem */
public class C25986Cq0 {
    public static C25986Cq0 A06;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Handler A04 = new Handler(Looper.getMainLooper(), new C26373CyZ(this));
    public final C25132CZh A05 = new C25132CZh();

    public static synchronized C25986Cq0 A00() {
        C25986Cq0 cq0;
        synchronized (C25986Cq0.class) {
            cq0 = A06;
            if (cq0 == null) {
                cq0 = new C25986Cq0();
                A06 = cq0;
            }
        }
        return cq0;
    }

    public static void A01(C25986Cq0 cq0, int i, long j) {
        if (!cq0.A05.A00.isEmpty()) {
            Handler handler = cq0.A04;
            Message obtain = Message.obtain(handler, i);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
            handler.sendMessage(obtain);
        }
    }

    public void A02() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A01(this, 5, this.A00);
            return;
        }
        A01(this, 3, j);
        this.A01 = SystemClock.elapsedRealtime();
    }
}
