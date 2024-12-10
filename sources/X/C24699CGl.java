package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.CGl  reason: case insensitive filesystem */
public abstract class C24699CGl {
    public static final ExecutorService A00;
    public static final ThreadFactory A01;

    static {
        DW6 dw6 = DW6.A00;
        A01 = dw6;
        A00 = Executors.newCachedThreadPool(dw6);
    }
}
