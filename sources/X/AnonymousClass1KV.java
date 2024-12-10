package X;

import java.util.Map;

/* renamed from: X.1KV  reason: invalid class name */
public final class AnonymousClass1KV {
    public final Map A00;
    public final Map A01;

    public AnonymousClass1KV(Map map, Map map2) {
        C18070vi.A0d(map, 1);
        C18070vi.A0d(map2, 2);
        this.A01 = map;
        this.A00 = map2;
    }

    public final Object A00(Class cls) {
        StringBuilder sb;
        AnonymousClass00H r1 = (AnonymousClass00H) this.A01.get(cls);
        Map map = this.A00;
        if (r1 == null) {
            if (map.containsKey(cls)) {
                sb.append("Binding for ");
                sb.append(cls);
                sb.append(" is overridden without a default implementation. This is likely a mistake.");
            } else {
                sb = new StringBuilder();
                sb.append("No binding found for ");
                sb.append(cls);
                sb.append('.');
            }
            throw new IllegalStateException(sb.toString());
        }
        AnonymousClass00H r0 = (AnonymousClass00H) map.get(cls);
        if (r0 != null) {
            r1 = r0;
        }
        return r1.get();
    }
}
