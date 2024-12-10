package X;

import java.util.List;

/* renamed from: X.DrV  reason: case insensitive filesystem */
public final class C28112DrV extends AnonymousClass11G implements C22821Di {
    public static final C28112DrV A00 = new C28112DrV();

    public C28112DrV() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A01;
        if (C18070vi.A19(obj, false)) {
            A01 = C26130Cst.A01;
        } else {
            List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            Object obj2 = A13.get(0);
            C25759ClU clU = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            C18070vi.A0b(number);
            float floatValue = number.floatValue();
            Object obj3 = A13.get(1);
            if (obj3 != null) {
                clU = (C25759ClU) obj3;
            }
            C18070vi.A0b(clU);
            A01 = C26054CrP.A01(floatValue, clU.A00);
        }
        return new C26130Cst(A01);
    }
}
