package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1u5  reason: invalid class name and case insensitive filesystem */
public class C40051u5 {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C36771oR> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C36771oR BlF : set) {
                    BlF.BlF();
                }
            }
        }
    }

    public void A01() {
        Set<C36771oR> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C36771oR BmX : set) {
                    BmX.BmX();
                }
            }
        }
    }

    public void A02(C36771oR r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
