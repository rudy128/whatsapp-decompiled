package X;

import java.util.concurrent.LinkedTransferQueue;

/* renamed from: X.10K  reason: invalid class name */
public class AnonymousClass10K extends LinkedTransferQueue<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return tryTransfer(obj);
    }
}
