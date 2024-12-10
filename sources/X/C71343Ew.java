package X;

import java.util.concurrent.LinkedTransferQueue;

/* renamed from: X.3Ew  reason: invalid class name and case insensitive filesystem */
public final class C71343Ew extends LinkedTransferQueue<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        C18070vi.A0d(obj, 0);
        return tryTransfer(obj);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof Runnable)) {
            return super.contains(obj);
        }
        return false;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof Runnable)) {
            return super.remove(obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
