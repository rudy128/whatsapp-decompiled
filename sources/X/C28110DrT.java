package X;

import java.util.List;

/* renamed from: X.DrT  reason: case insensitive filesystem */
public final class C28110DrT extends AnonymousClass11G implements C22821Di {
    public static final C28110DrT A00 = new C28110DrT();

    public C28110DrT() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26130Cst cst;
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        C25779Clq clq = C25779Clq.A02;
        Object obj2 = A13.get(0);
        C25759ClU[] clUArr = C26130Cst.A02;
        ECZ ecz = C25471CgQ.A0I;
        C18070vi.A18(obj2, false);
        C26130Cst cst2 = null;
        if (obj2 != null) {
            cst = (C26130Cst) ecz.CFy(obj2);
        } else {
            cst = null;
        }
        C18070vi.A0b(cst);
        long j = cst.A00;
        Object obj3 = A13.get(1);
        C18070vi.A18(obj3, false);
        if (obj3 != null) {
            cst2 = (C26130Cst) ecz.CFy(obj3);
        }
        C18070vi.A0b(cst2);
        return new C25779Clq(j, cst2.A00);
    }
}
