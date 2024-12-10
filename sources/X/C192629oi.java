package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.9oi  reason: invalid class name and case insensitive filesystem */
public final class C192629oi {
    public final C29621ca A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final C199410f A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192629oi)) {
            return false;
        }
        C192629oi r4 = (C192629oi) obj;
        return C18070vi.A18(this.A01, r4.A01) && C18070vi.A18(this.A04, r4.A04) && C18070vi.A18(this.A00, r4.A00);
    }

    public int hashCode() {
        return (this.A01.hashCode() ^ this.A04.hashCode()) ^ this.A00.hashCode();
    }

    public C192629oi(C29621ca r2, String str, Map map, Map map2, Set set) {
        this.A01 = str;
        this.A00 = r2;
        this.A03 = map;
        this.A02 = map2;
        AnonymousClass1F8 r0 = new AnonymousClass1F8();
        r0.addAll(set);
        this.A04 = r0.build();
    }
}
