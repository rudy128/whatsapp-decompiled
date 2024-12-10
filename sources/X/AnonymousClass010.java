package X;

import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.010  reason: invalid class name */
public final class AnonymousClass010 {
    public final LinkedHashMap A00;

    public final Object A00(Object obj) {
        C18070vi.A0d(obj, 0);
        return this.A00.remove(obj);
    }

    public AnonymousClass010(int i) {
        this.A00 = new LinkedHashMap(i, 0.75f, true);
    }

    public final Set A01() {
        Set entrySet = this.A00.entrySet();
        C18070vi.A0X(entrySet);
        return entrySet;
    }

    public AnonymousClass010() {
        this(16);
    }
}
