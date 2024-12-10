package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.9yH  reason: invalid class name and case insensitive filesystem */
public final class C198399yH {
    public static final C198399yH A04;
    public final C25503Ch1 A00;
    public final C24870CNo A01;
    public final String A02;
    public final List A03;

    static {
        C186409e9 r1 = new C186409e9();
        A04 = new C198399yH(r1.A00, r1.A01, r1.A02, Collections.unmodifiableList(r1.A03));
    }

    public C198399yH(C25503Ch1 ch1, C24870CNo cNo, String str, List list) {
        this.A01 = cNo;
        this.A03 = list;
        this.A00 = ch1;
        this.A02 = str;
    }
}
