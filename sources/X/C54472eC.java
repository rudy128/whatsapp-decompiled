package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.2eC  reason: invalid class name and case insensitive filesystem */
public class C54472eC {
    public final Long A00;
    public final String A01;
    public final Set A02;

    public C54472eC(Long l, String str, Set set) {
        this.A01 = str;
        this.A02 = Collections.unmodifiableSet(set);
        this.A00 = l;
    }
}
