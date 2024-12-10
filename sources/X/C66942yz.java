package X;

import android.content.Context;

/* renamed from: X.2yz  reason: invalid class name and case insensitive filesystem */
public class C66942yz implements AnonymousClass5ZU {
    public final int A00;
    public final Object A01;

    public C66942yz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C79183un BGs(Context context, AnonymousClass1BI r12, AnonymousClass1EC r13) {
        C79183un r3;
        AnonymousClass10E r1;
        AnonymousClass00S AJ7;
        int i = this.A00;
        Object obj = this.A01;
        Context context2 = context;
        AnonymousClass1BI r8 = r12;
        AnonymousClass1EC r9 = r13;
        if (i != 0) {
            AnonymousClass10E r0 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r2 = r0.A00;
            r3 = new C79183un(context2, (AnonymousClass5XU) r2.A2C.get(), AnonymousClass10E.A6O(r0), (C26031Qo) r0.A32.get(), r8, r9);
            r1 = r2.AJU;
            C62782rz.A02(r3, (C18030ve) r1.A04.get());
            C62782rz.A00(r3, (AnonymousClass11C) r1.AAp.get());
            C62782rz.A01(r3, (C18000vb) r1.ABz.get());
            C62772ry.A01(r3, (AnonymousClass1KW) r1.A3d.get());
            AJ7 = r2.A40;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            AnonymousClass1K1 r14 = r02.A00;
            AnonymousClass10E r03 = r02.A01;
            r3 = new C79183un(context2, (AnonymousClass5XU) r14.A2G.get(), AnonymousClass10E.A6O(r03), (C26031Qo) r03.A32.get(), r8, r9);
            r1 = r14.AAQ;
            C62782rz.A02(r3, (C18030ve) r1.A04.get());
            C62782rz.A00(r3, (AnonymousClass11C) r1.AAp.get());
            C62782rz.A01(r3, (C18000vb) r1.ABz.get());
            C62772ry.A01(r3, (AnonymousClass1KW) r1.A3d.get());
            AJ7 = r1.A00.A40;
        }
        C62772ry.A00(r3, (AnonymousClass1L2) AJ7.get());
        C62772ry.A02(r3, (C18010vc) r1.A9s.get());
        return r3;
    }
}
