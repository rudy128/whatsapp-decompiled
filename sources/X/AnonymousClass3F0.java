package X;

import java.util.Set;

/* renamed from: X.3F0  reason: invalid class name */
public abstract class AnonymousClass3F0<E> extends C19790z0<E> implements Set<E>, C18450wR {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C18070vi.A0d(set, 1);
        if (size() == set.size()) {
            return containsAll(set);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (Object A0l : this) {
            i += AnonymousClass001.A0l(A0l);
        }
        return i;
    }
}
