package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.676  reason: invalid class name */
public final class AnonymousClass676 extends AnonymousClass163 {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        C18070vi.A0d(map, 0);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CdlGraphqlErrorProcessor/onHandleError: key: ");
            A10.append(AnonymousClass000.A0M(A16.getKey()));
            A10.append(", value: ");
            A10.append(A16.getValue());
            C17890vO.A0w(A10);
        }
        return "CDL graphql error";
    }
}
