package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.10T  reason: invalid class name */
public abstract class AnonymousClass10T {
    public static final AnonymousClass10V Companion = new Object();
    public static final String TAG = "AnyThreadObservable";
    public final AnonymousClass10W allObservers;
    public final C24691Lh observerCounter;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass10T(AnonymousClass00H r2) {
        this(r2, false);
        C18070vi.A0d(r2, 1);
    }

    public void checkThread() {
    }

    public void ensureNotWorkerThreadObserver(Object obj) {
        C18070vi.A0d(obj, 0);
    }

    public final void notifyAllObservers(C23691Hg r4) {
        Iterator it;
        C18070vi.A0d(r4, 0);
        checkThread();
        synchronized (this.allObservers) {
            it = this.allObservers.iterator();
        }
        while (it.hasNext()) {
            Object next = it.next();
            ensureNotWorkerThreadObserver(next);
            runObserver(next, r4);
        }
    }

    public final void observeUntil(Object obj, AnonymousClass1F9 r5, C27581Wq r6) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r6, 2);
        synchronized (this.allObservers) {
            if (!this.allObservers.A00(r6, r5, obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("AnyThreadObservable/observeUntil ");
                sb.append(obj);
                sb.append(" already registered");
                Log.w(sb.toString());
            }
        }
    }

    public final void observeUntilDestroy(Object obj, AnonymousClass1F9 r5) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(r5, 1);
        synchronized (this.allObservers) {
            if (!this.allObservers.A00(C27581Wq.ON_DESTROY, r5, obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("AnyThreadObservable/observeUntilDestroy ");
                sb.append(obj);
                sb.append(" already registered");
                Log.w(sb.toString());
            }
        }
    }

    public void registerObserver(Object obj) {
        C18070vi.A0d(obj, 0);
        synchronized (this.allObservers) {
            AnonymousClass10W r2 = this.allObservers;
            AnonymousClass11L r1 = new AnonymousClass11L(obj);
            if (r2.A01.putIfAbsent(obj, r1) == null) {
                r2.A02.add(obj);
                r1.A00();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("AnyThreadObservable/registerObserver ");
                sb.append(obj);
                sb.append(" already registered");
                Log.w(sb.toString());
            }
        }
    }

    public void runObserver(Object obj, C23691Hg r4) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(r4, 1);
        r4.CGE(obj);
        C24691Lh r1 = this.observerCounter;
        if (r1 == null) {
            return;
        }
        if (C22781De.A03()) {
            r1.A00();
        } else {
            r1.A01();
        }
    }

    public void unregisterObserver(Object obj) {
        C18070vi.A0d(obj, 0);
        synchronized (this.allObservers) {
            if (!this.allObservers.A01(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("AnyThreadObservable/unregisterObserver ");
                sb.append(obj);
                sb.append(" not registered");
                Log.w(sb.toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Li, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.1Li, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.1Li, java.lang.Object] */
    public final C24701Li getAndResetObserverCounts() {
        ? obj;
        C24691Lh r6 = this.observerCounter;
        if (r6 != null) {
            synchronized (r6) {
                C24701Li r0 = r6.A00;
                long j = ((long) r0.A00) + ((long) r0.A02);
                int i = (int) j;
                if (j != ((long) i)) {
                    try {
                        throw new ArithmeticException();
                    } catch (ArithmeticException unused) {
                        i = Integer.MAX_VALUE;
                    }
                }
                C24701Li r02 = r6.A00;
                int i2 = r02.A00;
                int i3 = r02.A02;
                obj = new Object();
                obj.A01 = i;
                obj.A00 = i2;
                obj.A02 = i3;
                ? obj2 = new Object();
                obj2.A01 = 0;
                obj2.A00 = 0;
                obj2.A02 = 0;
                r6.A00 = obj2;
            }
            return obj;
        }
        ? obj3 = new Object();
        obj3.A01 = 0;
        obj3.A00 = 0;
        obj3.A02 = 0;
        return obj3;
    }

    public final void resetDynamicObserversForTest() {
        synchronized (this.allObservers) {
            AnonymousClass10W r4 = this.allObservers;
            ConcurrentHashMap concurrentHashMap = r4.A01;
            for (AnonymousClass11L r1 : concurrentHashMap.values()) {
                if (r1 instanceof AnonymousClass2LU) {
                    AnonymousClass2LU r12 = (AnonymousClass2LU) r1;
                    C17960vV.A02();
                    r12.A00.getLifecycle().A06(r12);
                }
            }
            concurrentHashMap.clear();
            r4.A02.clear();
        }
    }

    public final int size() {
        AnonymousClass10W r2 = this.allObservers;
        return ((Set) r2.A00.get()).size() + r2.A02.size();
    }

    public final C24691Lh getObserverCounter() {
        return this.observerCounter;
    }

    public AnonymousClass10T(AnonymousClass00H r2, boolean z) {
        C24691Lh r0;
        C18070vi.A0d(r2, 1);
        this.allObservers = new AnonymousClass10W(r2);
        if (z) {
            r0 = new C24691Lh();
        } else {
            r0 = null;
        }
        this.observerCounter = r0;
    }

    public AnonymousClass10T() {
        this(C18150vq.A00(), false);
    }
}
