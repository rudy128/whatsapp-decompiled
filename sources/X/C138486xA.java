package X;

import java.util.AbstractCollection;

/* renamed from: X.6xA  reason: invalid class name and case insensitive filesystem */
public class C138486xA {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;

    public static void A00(String str, AbstractCollection abstractCollection, C138486xA r5, AnonymousClass73Y r6) {
        r6.A05(str);
        AnonymousClass73C r2 = r6.A04;
        abstractCollection.add(new C54032dU(str, r2));
        int i = r5.A01;
        C138486xA r4 = r2.A0C;
        r5.A01 = i + r4.A01;
        r5.A00 += r4.A00;
        r5.A04 += r4.A04;
        r5.A02 += r4.A02;
        r5.A03 += r4.A03;
    }
}
