package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.DcC  reason: case insensitive filesystem */
public class C27340DcC extends ReentrantLock implements AutoCloseable {
    public boolean mEnableThreadLockSync;

    public void close() {
        if (this.mEnableThreadLockSync) {
            unlock();
        }
    }
}
