package X;

import java.util.concurrent.Executor;

/* renamed from: X.1IE  reason: invalid class name */
public final class AnonymousClass1IE extends C23771Ho implements Executor {
    public static final C18600wl A00;
    public static final AnonymousClass1IE A01 = new C18600wl();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0wl, X.1IE] */
    static {
        AnonymousClass1IF r5 = AnonymousClass1IF.A00;
        int i = AnonymousClass1I2.A00;
        int i2 = 64;
        if (64 < i) {
            i2 = i;
        }
        A00 = r5.A0A((int) AnonymousClass1I1.A00("kotlinx.coroutines.io.parallelism", (long) i2, 2147483647L));
    }

    public void execute(Runnable runnable) {
        A00.A0D(runnable, AnonymousClass1OR.A00);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
