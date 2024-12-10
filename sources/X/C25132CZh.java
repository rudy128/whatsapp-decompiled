package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CZh  reason: case insensitive filesystem */
public class C25132CZh {
    public volatile List A00 = Collections.emptyList();

    public synchronized void A00() {
        this.A00 = Collections.emptyList();
    }

    public synchronized boolean A01(Object obj) {
        if (this.A00.contains(obj)) {
            return false;
        }
        ArrayList A0z = C17880vN.A0z(this.A00.size() + 1);
        A0z.addAll(this.A00);
        A0z.add(obj);
        this.A00 = Collections.unmodifiableList(A0z);
        return true;
    }

    public synchronized boolean A02(Object obj) {
        boolean z;
        z = false;
        if (this.A00.contains(obj)) {
            int size = this.A00.size();
            int i = size - 1;
            ArrayList A0z = C17880vN.A0z(i);
            int indexOf = this.A00.indexOf(obj);
            if (indexOf > 0) {
                A0z.addAll(this.A00.subList(0, indexOf));
            }
            z = true;
            if (indexOf < i) {
                A0z.addAll(this.A00.subList(indexOf + 1, size));
            }
            this.A00 = Collections.unmodifiableList(A0z);
        }
        return z;
    }
}
