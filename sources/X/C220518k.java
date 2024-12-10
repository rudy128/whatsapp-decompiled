package X;

import java.util.List;

/* renamed from: X.18k  reason: invalid class name and case insensitive filesystem */
public class C220518k {
    public final List A00 = C220618l.newArrayList();
    public final List A01 = C220618l.newArrayList();

    public void A00() {
        List list = this.A01;
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException();
    }
}
