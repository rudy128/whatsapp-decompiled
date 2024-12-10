package X;

import java.util.Set;

/* renamed from: X.BjD  reason: case insensitive filesystem */
public abstract class C23526BjD extends C27287DbG implements Set {
    public transient BjB A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((!(obj instanceof C23526BjD) || obj.hashCode() == 0) && (obj instanceof Set)) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }
}
