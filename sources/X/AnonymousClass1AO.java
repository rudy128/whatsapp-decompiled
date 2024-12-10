package X;

import java.util.Set;

/* renamed from: X.1AO  reason: invalid class name */
public abstract class AnonymousClass1AO {
    public static final C27356DcS A00(Set set) {
        C27356DcS dcS = (C27356DcS) set;
        DVM dvm = dcS.backing;
        dvm.A05();
        dvm.isReadOnly = true;
        if (dvm.size() <= 0) {
            C18070vi.A0z(DVM.A00, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        if (dcS.size() <= 0) {
            return C27356DcS.A00;
        }
        return dcS;
    }
}
