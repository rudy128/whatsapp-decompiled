package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2kv  reason: invalid class name and case insensitive filesystem */
public class C58582kv {
    public Object A00;
    public final Condition A01;
    public final ReentrantLock A02;

    public C58582kv() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.A02 = reentrantLock;
        this.A01 = reentrantLock.newCondition();
    }

    public Object A00(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lockInterruptibly();
        while (nanos > 0) {
            try {
                if (this.A00 != null) {
                    break;
                }
                nanos = this.A01.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Object obj = this.A00;
        reentrantLock.unlock();
        return obj;
    }

    /* JADX INFO: finally extract failed */
    public boolean A01(Object obj) {
        C17960vV.A07(obj);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            if (this.A00 != null) {
                reentrantLock.unlock();
                return false;
            }
            this.A00 = obj;
            this.A01.signal();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
