package X;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.00I  reason: invalid class name */
public final class AnonymousClass00I {
    public final int A00;
    public final int A01;
    public final int A02;
    public final E0T A03 = new D7X();
    public final C25369CeU A04;
    public final B4N A05;
    public final C198879z4 A06;
    public final String A07;
    public final Executor A08 = A00(false);
    public final Executor A09 = A00(true);

    public AnonymousClass00I(AnonymousClass0IR r4) {
        C198879z4 A002 = r4.A00();
        this.A06 = A002 == null ? C198879z4.A00() : A002;
        this.A04 = C25369CeU.A00;
        this.A05 = new C20348AHe();
        this.A02 = r4.A00;
        this.A01 = r4.A01;
        this.A00 = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.A07 = r4.A03;
    }

    public static final ExecutorService A00(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C07060aI(z));
        C18070vi.A0X(newFixedThreadPool);
        return newFixedThreadPool;
    }
}
