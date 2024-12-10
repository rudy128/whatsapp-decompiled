package X;

import java.util.Map;

/* renamed from: X.9nm  reason: invalid class name and case insensitive filesystem */
public final class C192089nm {
    public final Map A00 = C17880vN.A13();

    public final synchronized C192819p2 A00(String str) {
        return (C192819p2) this.A00.get(str);
    }

    public final synchronized void A01(String str) {
        this.A00.remove(str);
    }
}
