package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0PG  reason: invalid class name */
public class AnonymousClass0PG {
    public static Handler A00;
    public static final List A01 = AnonymousClass000.A13();

    public static synchronized Handler A00() {
        Handler handler;
        synchronized (AnonymousClass0PG.class) {
            if (A00 == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundLayoutPreparer", 5);
                handlerThread.start();
                A00 = new Handler(handlerThread.getLooper());
                handlerThread.getThreadId();
            }
            handler = A00;
        }
        return handler;
    }

    public static synchronized AnonymousClass0HH A01(List list, int i, boolean z) {
        AnonymousClass0HH r3;
        synchronized (AnonymousClass0PG.class) {
            Handler A002 = A00();
            List list2 = A01;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AnonymousClass0ZY r32 = (AnonymousClass0ZY) it.next();
                if (r32.A00 == i) {
                    r32.A01.A00.compareAndSet(false, true);
                }
                AnonymousClass0HH r1 = r32.A01;
                if (r1.A00.get()) {
                    A002.removeCallbacksAndMessages(r1);
                    it.remove();
                }
            }
            r3 = new AnonymousClass0HH();
            AnonymousClass0ZY r0 = new AnonymousClass0ZY(r3, list, i, z);
            list2.add(r0);
            A002.postAtTime(new AnonymousClass0Z7(r0), r3, 0);
        }
        return r3;
    }
}
