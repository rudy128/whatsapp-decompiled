package X;

import android.content.Context;

/* renamed from: X.2yy  reason: invalid class name and case insensitive filesystem */
public class C66932yy implements AnonymousClass5ZT {
    public final int A00;
    public final Object A01;

    public C66932yy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass4C3 BGS(Context context, AnonymousClass1EC r6) {
        AnonymousClass4C3 r3;
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass10E r0 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r2 = r0.A00;
            r3 = new AnonymousClass4C3(context, AnonymousClass10E.A6O(r0), (AnonymousClass1LU) r0.ABd.get(), r6);
            r1 = r2.AJU;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            AnonymousClass1K1 r22 = r02.A00;
            AnonymousClass10E r03 = r02.A01;
            r3 = new AnonymousClass4C3(context, AnonymousClass10E.A6O(r03), (AnonymousClass1LU) r03.ABd.get(), r6);
            r1 = r22.AAQ;
        }
        C63492tA.A01((AnonymousClass19D) r1.A02.get(), r3);
        C63492tA.A02((C18030ve) r1.A04.get(), r3);
        C63492tA.A03((AnonymousClass1DC) r1.A95.get(), r3);
        C63492tA.A00((C18000vb) r1.ABz.get(), r3);
        return r3;
    }
}
