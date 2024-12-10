package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.1ul  reason: invalid class name and case insensitive filesystem */
public final class C40471ul {
    public static Executor A02;
    public static final Object A03 = new Object();
    public Executor A00;
    public final C40411uf A01;

    public C40481um A00() {
        Executor executor = this.A00;
        if (executor == null) {
            synchronized (A03) {
                if (A02 == null) {
                    A02 = Executors.newFixedThreadPool(2);
                }
            }
            executor = A02;
            this.A00 = executor;
        }
        return new C40481um(this.A01, executor);
    }

    public C40471ul(C40411uf r1) {
        this.A01 = r1;
    }
}
