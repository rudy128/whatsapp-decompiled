package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.1pb  reason: invalid class name and case insensitive filesystem */
public class C37471pb {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public Executor A01;

    public void A00(C43451zp r4, C42601yR r5) {
        this.A01.execute(new C449525k(this, r5, r4, 1));
    }

    public C37471pb(Executor executor) {
        this.A01 = executor;
    }
}
