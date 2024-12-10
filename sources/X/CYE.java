package X;

import java.util.concurrent.locks.ReentrantLock;

public class CYE {
    public int A00 = 0;
    public final ReentrantLock A01 = new ReentrantLock();

    public boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return BE9.A1Q(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AnonymousClass000.A1P(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
