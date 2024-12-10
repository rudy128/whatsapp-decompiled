package X;

import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3Ez  reason: invalid class name and case insensitive filesystem */
public class C71363Ez extends ReentrantLock implements Closeable {
    public final /* synthetic */ C25571Os this$0;
    public final AtomicLong threadId = new AtomicLong(-1);

    public C71363Ez(C25571Os r4) {
        this.this$0 = r4;
    }

    private void A00() {
        AtomicLong atomicLong = this.threadId;
        Thread currentThread = Thread.currentThread();
        atomicLong.compareAndSet(-1, currentThread.getId());
        C218717s r0 = this.this$0.A02;
        if (r0 != null && r0.A00()) {
            if (getHoldCount() == 0 || this.threadId.get() != currentThread.getId()) {
                Log.e("SignalLock/getLock/trying to acquire lock from a transaction");
                this.this$0.A00.A0G("signal-lock-in-transaction", (String) null, true);
            }
        }
    }

    public void close() {
        unlock();
    }

    public void lock() {
        A00();
        super.lock();
    }

    public boolean tryLock(long j, TimeUnit timeUnit) {
        A00();
        return super.tryLock(j, timeUnit);
    }

    public void unlock() {
        LinkedList linkedList;
        super.unlock();
        if (getHoldCount() == 0) {
            this.threadId.set(-1);
        }
        List list = this.this$0.A05;
        synchronized (list) {
            linkedList = new LinkedList(list);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((CountDownLatch) it.next()).countDown();
        }
    }

    public boolean tryLock() {
        A00();
        return super.tryLock();
    }
}
