package X;

import java.util.concurrent.Executor;

public enum C19 implements Executor {
    ;

    /* access modifiers changed from: public */
    C19() {
    }

    public String toString() {
        return "DirectExecutor";
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
