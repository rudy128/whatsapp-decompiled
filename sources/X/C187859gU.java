package X;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.9gU  reason: invalid class name and case insensitive filesystem */
public class C187859gU {
    public final C185359cS A00;
    public final C186389e7 A01;
    public final Integer A02;
    public final List A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;

    public C187859gU(C185359cS r2, C186389e7 r3, Integer num, List list, Set set, boolean z, boolean z2) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = num;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = Collections.unmodifiableSet(AnonymousClass8BR.A12(set));
        this.A03 = AnonymousClass8BU.A0y(list);
    }
}
