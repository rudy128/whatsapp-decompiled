package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DrL  reason: case insensitive filesystem */
public final class C28102DrL extends AnonymousClass11G implements C22821Di {
    public static final C28102DrL A00 = new C28102DrL();

    public C28102DrL() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList A14 = AnonymousClass000.A14(A13);
        int size = A13.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = A13.get(i);
            C16680sp r2 = C25471CgQ.A06;
            Object obj3 = null;
            if (!C18070vi.A19(obj2, false) && obj2 != null) {
                obj3 = r2.CFy(obj2);
            }
            C18070vi.A0b(obj3);
            A14.add(obj3);
        }
        return new DUE(A14);
    }
}
