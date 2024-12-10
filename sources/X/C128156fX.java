package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6fX  reason: invalid class name and case insensitive filesystem */
public final class C128156fX {
    public final Map A00 = new ConcurrentHashMap();
    public final Set A01;

    public C128156fX() {
        Set synchronizedSet = Collections.synchronizedSet(C17880vN.A12());
        C18070vi.A0X(synchronizedSet);
        this.A01 = synchronizedSet;
    }
}
