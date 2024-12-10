package X;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.047  reason: invalid class name */
public final class AnonymousClass047 implements AnonymousClass046 {
    public final Set A00 = new HashSet();

    public void A00() {
        Thread thread = C02020Ci.A00;
        if (thread == null) {
            thread = Looper.getMainLooper().getThread();
            C02020Ci.A00 = thread;
        }
        if (Thread.currentThread() == thread) {
            Iterator it = this.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onCleared");
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
