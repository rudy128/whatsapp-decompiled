package X;

import java.util.concurrent.Executor;

public enum C1A implements Executor {
    ;

    /* access modifiers changed from: public */
    C1A() {
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
