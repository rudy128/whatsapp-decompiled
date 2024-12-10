package X;

import java.util.Map;

/* renamed from: X.17w  reason: invalid class name and case insensitive filesystem */
public final class C219117w {
    public final Map A00;

    public C219117w(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public static final AnonymousClass00H A00(C219117w r1, Class cls) {
        AnonymousClass00H r0 = (AnonymousClass00H) r1.A00.get(cls);
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No bridge with type ");
        sb.append(cls);
        sb.append(" was registered.");
        throw new IllegalStateException(sb.toString());
    }

    public final C201511a A01(Class cls) {
        Object obj = A00(this, cls).get();
        C18070vi.A0z(obj, "null cannot be cast to non-null type T of com.whatsapp.dependencybridge.DependencyBridgeRegistry.getBridge");
        return (C201511a) obj;
    }
}
