package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.3NV  reason: invalid class name */
public class AnonymousClass3NV extends ResultReceiver {
    public final WeakReference A00;
    public final WeakReference A01;

    public void onReceiveResult(int i, Bundle bundle) {
        Runnable runnable = (Runnable) this.A00.get();
        if (runnable != null) {
            runnable.run();
            Set set = (Set) this.A01.get();
            if (set != null) {
                set.remove(runnable);
            }
        }
    }

    public AnonymousClass3NV(Handler handler, Runnable runnable, Set set) {
        super(handler);
        set.add(runnable);
        this.A00 = AnonymousClass3MW.A0z(runnable);
        this.A01 = AnonymousClass3MW.A0z(set);
    }
}
