package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface EEC extends Future {
    void BBG(Runnable runnable, Executor executor);
}
