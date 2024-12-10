package X;

import java.util.Map;

/* renamed from: X.A1p  reason: case insensitive filesystem */
public final class C19979A1p {
    public static final A4N A03 = new Object();
    public final Map A00;
    public final Map A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19979A1p) {
                C19979A1p a1p = (C19979A1p) obj;
                if (!C18070vi.A18(this.A02, a1p.A02) || !C18070vi.A18(this.A00, a1p.A00) || !C18070vi.A18(this.A01, a1p.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02)));
    }

    public C19979A1p(Map map, Map map2, Map map3) {
        this.A02 = map;
        this.A00 = map2;
        this.A01 = map3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCompatibility(welj=");
        A10.append(this.A02);
        A10.append(", dataChannel=");
        A10.append(this.A00);
        A10.append(", flowMessage=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
