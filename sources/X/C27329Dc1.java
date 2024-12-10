package X;

import java.util.LinkedList;

/* renamed from: X.Dc1  reason: case insensitive filesystem */
public final class C27329Dc1 extends LinkedList<Runnable> {
    public final C25676Ck7 fixer;

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        C25676Ck7 ck7;
        if (obj == null || (ck7 = this.fixer) == null || ck7.A00 == null) {
            return true;
        }
        synchronized (ck7.A02) {
            ck7.A01.add(obj);
            ck7.A00.sendEmptyMessageDelayed(1, 100);
        }
        return true;
    }

    public C27329Dc1(C25676Ck7 ck7) {
        this.fixer = ck7;
    }
}
