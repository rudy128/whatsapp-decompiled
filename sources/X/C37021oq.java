package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1oq  reason: invalid class name and case insensitive filesystem */
public abstract class C37021oq {
    public final Set A00;
    public final Set A01;

    public C37021oq(Set set, Set set2) {
        this.A00 = Collections.unmodifiableSet(new HashSet(set));
        this.A01 = Collections.unmodifiableSet(new HashSet(set2));
    }
}
