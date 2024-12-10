package X;

import java.util.concurrent.Executor;

/* renamed from: X.014  reason: invalid class name */
public class AnonymousClass014 implements Executor {
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
