package X;

import java.util.List;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.0ZY  reason: invalid class name */
public final class AnonymousClass0ZY implements Runnable {
    public final int A00;
    public final AnonymousClass0HH A01;
    public final List A02;
    public final boolean A03;

    public static void A00(AnonymousClass0CC r2) {
        RunnableFuture runnableFuture;
        RunnableFuture runnableFuture2;
        synchronized (r2) {
            runnableFuture = r2.A00;
        }
        if (runnableFuture == null || !runnableFuture.isCancelled()) {
            synchronized (r2) {
                runnableFuture2 = r2.A00;
            }
            if (runnableFuture2 != null && !runnableFuture2.isDone() && r2.A02.get() == -1) {
                r2.A00();
            }
        }
    }

    public void run() {
        if (this.A03) {
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0 && !this.A01.A00.get()) {
                    A00(((AnonymousClass0sP) list.get(size)).BY4());
                } else {
                    return;
                }
            }
        } else {
            int i = 0;
            while (true) {
                List list2 = this.A02;
                if (i < list2.size() && !this.A01.A00.get()) {
                    A00(((AnonymousClass0sP) list2.get(i)).BY4());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public AnonymousClass0ZY(AnonymousClass0HH r1, List list, int i, boolean z) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = r1;
        this.A03 = z;
    }
}
