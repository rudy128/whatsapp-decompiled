package X;

import android.content.Context;
import android.view.WindowManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cfj  reason: case insensitive filesystem */
public abstract class C25436Cfj {
    public static final long A00 = TimeUnit.SECONDS.toNanos(1);
    public static final AtomicInteger A01 = new AtomicInteger(-1);

    public static final int A00(Context context) {
        double A012;
        AtomicInteger atomicInteger = A01;
        int i = atomicInteger.get();
        if (i != -1) {
            return i;
        }
        Object systemService = context.getSystemService("window");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        double refreshRate = (double) ((WindowManager) systemService).getDefaultDisplay().getRefreshRate();
        if (refreshRate < 0.0d) {
            A012 = 60.0d;
        } else {
            A012 = C28851b7.A01(refreshRate, 30.0d, 240.0d);
        }
        int A002 = C22339B3q.A00(((double) A00) / A012);
        atomicInteger.compareAndSet(-1, A002);
        return A002;
    }
}
