package X;

import java.util.List;

/* renamed from: X.DrO  reason: case insensitive filesystem */
public final class C28105DrO extends AnonymousClass11G implements C22821Di {
    public static final C28105DrO A00 = new C28105DrO();

    public C28105DrO() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26018CqZ cqZ;
        C25758ClT clT;
        C26130Cst cst;
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = A13.get(0);
        C25779Clq clq = null;
        if (obj2 != null) {
            cqZ = (C26018CqZ) obj2;
        } else {
            cqZ = null;
        }
        C18070vi.A0b(cqZ);
        int i = cqZ.A00;
        Object obj3 = A13.get(1);
        if (obj3 != null) {
            clT = (C25758ClT) obj3;
        } else {
            clT = null;
        }
        C18070vi.A0b(clT);
        int i2 = clT.A00;
        Object obj4 = A13.get(2);
        C25759ClU[] clUArr = C26130Cst.A02;
        ECZ ecz = C25471CgQ.A0I;
        C18070vi.A18(obj4, false);
        if (obj4 != null) {
            cst = (C26130Cst) ecz.CFy(obj4);
        } else {
            cst = null;
        }
        C18070vi.A0b(cst);
        long j = cst.A00;
        Object obj5 = A13.get(3);
        C25779Clq clq2 = C25779Clq.A02;
        C16680sp r1 = C25471CgQ.A0C;
        if (!C18070vi.A18(obj5, false) && obj5 != null) {
            clq = (C25779Clq) r1.CFy(obj5);
        }
        return new C26038Cqy((C26131Csu) null, clq, (C25784Clv) null, i, i2, 0, Integer.MIN_VALUE, j);
    }
}
