package X;

import java.util.concurrent.ThreadFactory;

public class DW1 implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        return new C27236DaG(runnable);
    }
}
