package X;

import java.util.Set;

/* renamed from: X.9H9  reason: invalid class name */
public abstract class AnonymousClass9H9 extends AnonymousClass97S {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1MF A01;
    public final C48392Mh A02;
    public final AnonymousClass1PQ A03;

    public static int A09(AnonymousClass9H9 r0, AnonymousClass1EC r1, AnonymousClass98B r2, Set set) {
        r2.A01 = r0.A01.A03(r1);
        Set set2 = r2.A03;
        set2.clear();
        set2.addAll(set);
        int size = set.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    public AnonymousClass9H9(AnonymousClass190 r1, AnonymousClass1CJ r2, AnonymousClass1MF r3, C48392Mh r4, AnonymousClass1PQ r5) {
        super(r1);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }
}
