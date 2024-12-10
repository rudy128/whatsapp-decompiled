package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.Cjx  reason: case insensitive filesystem */
public final class C25667Cjx {
    public static final CJ6 A03 = new CJ6(2);
    public static final CJ6 A04 = new CJ6(3);
    public static final CJ6 A05 = new CJ6(0);
    public static final CJ6 A06 = new CJ6(1);
    public BG8 A00;
    public IOException A01;
    public final ExecutorService A02;

    public C25667Cjx(String str) {
        this.A02 = Executors.newSingleThreadExecutor(new DW3(str, 0));
    }

    public void A00(C28569E8a e8a, E7O e7o, int i) {
        Looper myLooper = Looper.myLooper();
        C26056CrS.A03(AnonymousClass000.A1W(myLooper));
        C26056CrS.A03(AnonymousClass000.A1W(myLooper));
        this.A01 = null;
        BG8 bg8 = new BG8(myLooper, e8a, e7o, this, i, SystemClock.elapsedRealtime());
        C25667Cjx cjx = bg8.A0A;
        C26056CrS.A03(AnonymousClass000.A1X(cjx.A00));
        cjx.A00 = bg8;
        bg8.A01 = null;
        cjx.A02.execute(bg8);
    }
}
