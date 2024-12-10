package X;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class D7T implements E3i {
    public final WeakHashMap A00 = new WeakHashMap();
    public final ReentrantLock A01 = new ReentrantLock();
    public final E3i A02;

    public void CAc(Activity activity, C192929pG r5) {
        C18070vi.A0d(activity, 0);
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.A00;
            if (!C18070vi.A18(r5, (C192929pG) weakHashMap.get(activity))) {
                weakHashMap.put(activity, r5);
                reentrantLock.unlock();
                this.A02.CAc(activity, r5);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public D7T(E3i e3i) {
        this.A02 = e3i;
    }
}
