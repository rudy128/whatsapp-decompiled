package X;

import android.content.Context;

/* renamed from: X.2yu  reason: invalid class name and case insensitive filesystem */
public class C66892yu implements AnonymousClass5ZN {
    public final int A00;
    public final Object A01;

    public C66892yu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass4C5 BGo(Context context, AnonymousClass1EC r16, AnonymousClass1EC r17, C436420i r18, int i, boolean z) {
        AnonymousClass4C5 r3;
        AnonymousClass10E r1;
        Context context2 = context;
        AnonymousClass1EC r8 = r16;
        AnonymousClass1EC r9 = r17;
        C436420i r10 = r18;
        int i2 = i;
        boolean z2 = z;
        if (this.A00 != 0) {
            AnonymousClass10E r2 = ((AnonymousClass10H) this.A01).A00;
            AnonymousClass10G r12 = r2.A00;
            C40371ub r6 = (C40371ub) r2.A2P.get();
            r3 = new AnonymousClass4C5(context2, AnonymousClass10E.A46(r2), r6, (AnonymousClass5XL) r12.A26.get(), r8, r9, r10, AnonymousClass10E.AL1(r2), i2, z2);
            r1 = r12.AJU;
        } else {
            AnonymousClass1K2 r13 = (AnonymousClass1K2) this.A01;
            AnonymousClass1K1 r22 = r13.A00;
            AnonymousClass10E r14 = r13.A01;
            C40371ub r62 = (C40371ub) r14.A2P.get();
            r3 = new AnonymousClass4C5(context2, AnonymousClass10E.A46(r14), r62, (AnonymousClass5XL) r22.A29.get(), r8, r9, r10, AnonymousClass10E.AL1(r14), i2, z2);
            r1 = r22.AAQ;
        }
        C63492tA.A01((AnonymousClass19D) r1.A02.get(), r3);
        C63492tA.A02((C18030ve) r1.A04.get(), r3);
        C63492tA.A03((AnonymousClass1DC) r1.A95.get(), r3);
        C63492tA.A00((C18000vb) r1.ABz.get(), r3);
        return r3;
    }
}
