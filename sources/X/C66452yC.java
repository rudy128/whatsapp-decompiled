package X;

/* renamed from: X.2yC  reason: invalid class name and case insensitive filesystem */
public class C66452yC implements C22433B7p {
    public final int A00;
    public final Object A01;

    public C66452yC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public A36 BGJ(C22432B7o b7o) {
        AnonymousClass10E r1;
        C18000vb A6Q;
        AnonymousClass00S r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C37391pS r02 = (C37391pS) obj;
            r1 = r02.A00;
            A6Q = AnonymousClass10E.A6Q(r1);
            r0 = r02.A01.A04;
        } else {
            AnonymousClass1K2 r03 = (AnonymousClass1K2) obj;
            r1 = r03.A01;
            A6Q = AnonymousClass10E.A6Q(r1);
            r0 = r03.A00.A3k;
        }
        return new A36((B57) r0.get(), b7o, A6Q, (AnonymousClass1XN) r1.A00.A0d.get());
    }
}
