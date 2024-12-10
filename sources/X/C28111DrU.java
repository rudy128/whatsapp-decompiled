package X;

import java.util.List;

/* renamed from: X.DrU  reason: case insensitive filesystem */
public final class C28111DrU extends AnonymousClass11G implements C22821Di {
    public static final C28111DrU A00 = new C28111DrU();

    public C28111DrU() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object A0p = C108955ca.A0p(A13);
        Number number2 = null;
        if (A0p != null) {
            number = (Number) A0p;
        } else {
            number = null;
        }
        int A03 = AnonymousClass3MY.A03(number);
        Object obj2 = A13.get(1);
        if (obj2 != null) {
            number2 = (Number) obj2;
        }
        return new C26260Cw5(C25858CnM.A02(A03, AnonymousClass3MY.A03(number2)));
    }
}
