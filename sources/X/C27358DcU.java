package X;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: X.DcU  reason: case insensitive filesystem */
public abstract class C27358DcU<E> extends AbstractSet<E> implements Set<E>, C23171Ey {
    public abstract boolean add(Object obj);

    public int A00() {
        DVM dvm;
        if (this instanceof C27356DcS) {
            dvm = ((C27356DcS) this).backing;
        } else if (this instanceof C27357DcT) {
            dvm = ((C27357DcT) this).A00;
        } else {
            dvm = ((C27355DcR) this).A00;
        }
        return dvm.size();
    }

    public final /* bridge */ int size() {
        return A00();
    }
}
