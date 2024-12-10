package X;

import android.content.Context;

/* renamed from: X.2yv  reason: invalid class name and case insensitive filesystem */
public class C66902yv implements AnonymousClass5ZP {
    public final int A00;
    public final Object A01;

    public C66902yv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C75053du BGO(Context context, C436420i r6) {
        C75053du r1;
        AnonymousClass10E r2;
        AnonymousClass00S AJ7;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass10E r0 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r3 = r0.A00;
            r1 = new C75053du(context, (C32191gn) r0.AAo.get(), r6);
            r2 = r3.AJU;
            C62782rz.A02(r1, (C18030ve) r2.A04.get());
            C62782rz.A00(r1, (AnonymousClass11C) r2.AAp.get());
            C62782rz.A01(r1, (C18000vb) r2.ABz.get());
            C62772ry.A01(r1, (AnonymousClass1KW) r2.A3d.get());
            AJ7 = r3.A40;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            AnonymousClass1K1 r22 = r02.A00;
            r1 = new C75053du(context, (C32191gn) r02.A01.AAo.get(), r6);
            r2 = r22.AAQ;
            C62782rz.A02(r1, (C18030ve) r2.A04.get());
            C62782rz.A00(r1, (AnonymousClass11C) r2.AAp.get());
            C62782rz.A01(r1, (C18000vb) r2.ABz.get());
            C62772ry.A01(r1, (AnonymousClass1KW) r2.A3d.get());
            AJ7 = r2.A00.A40;
        }
        C62772ry.A00(r1, (AnonymousClass1L2) AJ7.get());
        C62772ry.A02(r1, (C18010vc) r2.A9s.get());
        return r1;
    }
}
