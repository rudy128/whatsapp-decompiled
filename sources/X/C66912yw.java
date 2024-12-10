package X;

import android.content.Context;

/* renamed from: X.2yw  reason: invalid class name and case insensitive filesystem */
public class C66912yw implements AnonymousClass5ZQ {
    public final int A00;
    public final Object A01;

    public C66912yw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C23797Bpg BGP(Context context, AnonymousClass1EC r12) {
        C23797Bpg bpg;
        AnonymousClass10E r1;
        AnonymousClass00S AJ7;
        int i = this.A00;
        Object obj = this.A01;
        Context context2 = context;
        AnonymousClass1EC r9 = r12;
        if (i != 0) {
            AnonymousClass10E r0 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r2 = r0.A00;
            C107445Zs r7 = (C107445Zs) r2.A29.get();
            bpg = new C23797Bpg(context2, AnonymousClass10E.A13(r0), (C28527E6b) r2.A2A.get(), r7, (C85944Pm) r2.A2S.get(), r9);
            r1 = r2.AJU;
            C62782rz.A02(bpg, (C18030ve) r1.A04.get());
            C62782rz.A00(bpg, (AnonymousClass11C) r1.AAp.get());
            C62782rz.A01(bpg, (C18000vb) r1.ABz.get());
            C62772ry.A01(bpg, (AnonymousClass1KW) r1.A3d.get());
            AJ7 = r2.A40;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            AnonymousClass1K1 r13 = r02.A00;
            AnonymousClass10E r03 = r02.A01;
            C107445Zs r72 = (C107445Zs) r13.A2D.get();
            bpg = new C23797Bpg(context2, AnonymousClass10E.A13(r03), (C28527E6b) r13.A2E.get(), r72, (C85944Pm) r03.A00.A2S.get(), r9);
            r1 = r13.AAQ;
            C62782rz.A02(bpg, (C18030ve) r1.A04.get());
            C62782rz.A00(bpg, (AnonymousClass11C) r1.AAp.get());
            C62782rz.A01(bpg, (C18000vb) r1.ABz.get());
            C62772ry.A01(bpg, (AnonymousClass1KW) r1.A3d.get());
            AJ7 = r1.A00.A40;
        }
        C62772ry.A00(bpg, (AnonymousClass1L2) AJ7.get());
        C62772ry.A02(bpg, (C18010vc) r1.A9s.get());
        return bpg;
    }
}
