package X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.3Ai  reason: invalid class name and case insensitive filesystem */
public class C70253Ai implements AnonymousClass88M {
    public final int A00;
    public final Object A01;

    public C70253Ai(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass68H BGh(ThreadPoolExecutor threadPoolExecutor) {
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((AnonymousClass10H) obj).A00;
        } else {
            r1 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass1PW r2 = (AnonymousClass1PW) r1.A13.get();
        AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r1);
        AnonymousClass11C r5 = (AnonymousClass11C) r1.AAp.get();
        C18000vb A6Q = AnonymousClass10E.A6Q(r1);
        return new AnonymousClass68H(r2, A4z, (C24791Lr) r1.A2h.get(), r5, (AnonymousClass118) r1.ABY.get(), A6Q, (C34481kY) r1.ABK.get(), threadPoolExecutor);
    }
}
