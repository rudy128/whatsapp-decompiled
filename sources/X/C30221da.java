package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1da  reason: invalid class name and case insensitive filesystem */
public class C30221da {
    public static C30221da A02 = new C30221da();
    public final AtomicBoolean A00 = new AtomicBoolean(true);
    public final List A01 = new ArrayList();

    public final void A00(C71993Kd r3) {
        List list = this.A01;
        synchronized (list) {
            list.add(r3);
        }
    }
}
