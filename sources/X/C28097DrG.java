package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DrG  reason: case insensitive filesystem */
public final class C28097DrG extends AnonymousClass11G implements C22821Di {
    public static final C28097DrG A00 = new C28097DrG();

    public C28097DrG() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList A14 = AnonymousClass000.A14(A13);
        int size = A13.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = A13.get(i);
            C16680sp r2 = C25471CgQ.A02;
            Object obj3 = null;
            if (!C18070vi.A19(obj2, false) && obj2 != null) {
                obj3 = r2.CFy(obj2);
            }
            C18070vi.A0b(obj3);
            A14.add(obj3);
        }
        return A14;
    }
}
