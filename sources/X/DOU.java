package X;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DOU implements C28465E2g {
    public final Deque A00 = AnonymousClass8BR.A14();
    public final Map A01 = AnonymousClass8BR.A17();
    public final ReentrantLock A02 = new ReentrantLock();

    public static void A00(DOU dou, String str) {
        ReentrantLock reentrantLock = dou.A02;
        reentrantLock.lock();
        try {
            Deque deque = dou.A00;
            deque.removeFirstOccurrence(str);
            deque.addFirst(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        return this.A01.toString();
    }
}
