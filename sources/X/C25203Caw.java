package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Caw  reason: case insensitive filesystem */
public class C25203Caw {
    public C28502E4k A00;
    public long A01 = 5000;
    public Condition A02;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.await(this.A01, TimeUnit.MILLISECONDS);
            }
            if (this.A02 != null) {
                this.A02 = null;
                C28502E4k e4k = this.A00;
                if (e4k != null) {
                    e4k.C8g();
                }
            }
            reentrantLock.unlock();
        } catch (InterruptedException e) {
            throw new C27223Da2("Operation blocker interrupted. ", e);
        } catch (Throwable th) {
            if (this.A02 != null) {
                this.A02 = null;
                C28502E4k e4k2 = this.A00;
                if (e4k2 != null) {
                    e4k2.C8g();
                }
            }
            reentrantLock.unlock();
            throw th;
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = 5000;
            }
            this.A01 = j;
            reentrantLock.unlock();
            return;
        }
        throw AnonymousClass000.A0n("There is already a block condition being used.");
    }
}
