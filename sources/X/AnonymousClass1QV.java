package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1QV  reason: invalid class name */
public class AnonymousClass1QV {
    public final AnonymousClass1Cd A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger(0);

    public C60042nI A00(String str, String str2) {
        ThreadLocal threadLocal = this.A01;
        C34831l9 r2 = (C34831l9) threadLocal.get();
        if (r2 == null) {
            r2 = new C34831l9(this.A00, this.A02.get());
            threadLocal.set(r2);
        }
        C60042nI A002 = r2.A00(str, str2, this.A02.get());
        A002.A00.clearBindings();
        return A002;
    }

    public AnonymousClass1QV(AnonymousClass1Cd r3) {
        this.A00 = r3;
    }

    public void A01() {
        Log.i("statementsmanager/resetstatements");
        this.A02.incrementAndGet();
        C34831l9 r0 = (C34831l9) this.A01.get();
        if (r0 != null) {
            r0.A01();
        }
    }
}
