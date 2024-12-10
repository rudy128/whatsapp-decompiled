package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1KX  reason: invalid class name */
public class AnonymousClass1KX {
    public AtomicInteger A00 = new AtomicInteger();
    public boolean A01 = false;
    public final C18030ve A02;
    public final AnonymousClass190 A03;

    public synchronized void A00() {
        if (this.A00.addAndGet(1) > 15) {
            Log.i("Disable WATLS stack.");
            this.A01 = true;
        }
    }

    public synchronized boolean A02() {
        if (this.A01) {
            return false;
        }
        return C18020vd.A05(C18040vf.A02, this.A02, 48);
    }

    public AnonymousClass1KX(AnonymousClass190 r2, C18030ve r3) {
        this.A02 = r3;
        this.A03 = r2;
    }

    public boolean A01() {
        if (!A02()) {
            return false;
        }
        return C18020vd.A05(C18040vf.A02, this.A02, 58);
    }

    public boolean A03(Throwable th) {
        if (th.getMessage() == null || !th.getMessage().contains("WATLS Exception")) {
            return false;
        }
        return true;
    }
}
