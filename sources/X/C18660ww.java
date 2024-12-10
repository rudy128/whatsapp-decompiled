package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0ww  reason: invalid class name and case insensitive filesystem */
public class C18660ww {
    public final C19700yp A00;
    public final String A01;

    public static String A00(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C18540wd r1 = (C18540wd) ((C18530wc) it.next());
            sb.append(r1.A00);
            sb.append('/');
            sb.append(r1.A01);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String A01() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        Set set = this.A00.A00;
        synchronized (set) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(' ');
        synchronized (set) {
            unmodifiableSet2 = Collections.unmodifiableSet(set);
        }
        sb.append(A00(unmodifiableSet2));
        return sb.toString();
    }

    public C18660ww(C19700yp r2, Set set) {
        this.A01 = A00(set);
        this.A00 = r2;
    }
}
