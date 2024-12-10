package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.3Ev  reason: invalid class name and case insensitive filesystem */
public class C71333Ev extends LinkedBlockingDeque<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        if (!isEmpty() || !super.offer(obj)) {
            return false;
        }
        return true;
    }
}
