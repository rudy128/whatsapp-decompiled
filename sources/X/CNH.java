package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

public final class CNH {
    public final Deque A00 = new ArrayDeque();
    public final Executor A01;

    public CNH(Executor executor) {
        this.A01 = executor;
    }
}
