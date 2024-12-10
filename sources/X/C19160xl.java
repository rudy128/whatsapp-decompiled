package X;

import java.util.concurrent.Executor;

/* renamed from: X.0xl  reason: invalid class name and case insensitive filesystem */
public class C19160xl implements Executor {
    public final Executor A00;

    public void execute(Runnable runnable) {
        this.A00.execute(new C449025f((Object) runnable, 10));
    }

    public C19160xl(Executor executor) {
        this.A00 = executor;
    }
}
