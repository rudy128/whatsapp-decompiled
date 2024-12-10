package X;

import android.content.Context;

/* renamed from: X.2z2  reason: invalid class name and case insensitive filesystem */
public class C66972z2 implements AnonymousClass5ZW {
    public final int A00;
    public final Object A01;

    public C66972z2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass4C4 BGU(Context context, C436420i r5) {
        AnonymousClass4C4 r2;
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass10E r0 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r12 = r0.A00;
            r2 = new AnonymousClass4C4(context, (AnonymousClass18K) r0.A9B.get(), r5);
            r1 = r12.AJU;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            AnonymousClass1K1 r13 = r02.A00;
            r2 = new AnonymousClass4C4(context, (AnonymousClass18K) r02.A01.A9B.get(), r5);
            r1 = r13.AAQ;
        }
        C63492tA.A01((AnonymousClass19D) r1.A02.get(), r2);
        C63492tA.A02((C18030ve) r1.A04.get(), r2);
        C63492tA.A03((AnonymousClass1DC) r1.A95.get(), r2);
        C63492tA.A00((C18000vb) r1.ABz.get(), r2);
        return r2;
    }
}
