package X;

import java.util.List;

/* renamed from: X.DrN  reason: case insensitive filesystem */
public final class C28104DrN extends AnonymousClass11G implements C22821Di {
    public static final C28104DrN A00 = new C28104DrN();

    public C28104DrN() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A0p;
        if (C18070vi.A19(obj, false)) {
            A0p = AnonymousClass0QY.A02;
        } else {
            List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = A13.get(0);
            Number number2 = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            C18070vi.A0b(number);
            float floatValue = number.floatValue();
            Object obj3 = A13.get(1);
            if (obj3 != null) {
                number2 = (Number) obj3;
            }
            C18070vi.A0b(number2);
            A0p = AnonymousClass001.A0p(floatValue, number2.floatValue());
        }
        return new AnonymousClass0QY(A0p);
    }
}
