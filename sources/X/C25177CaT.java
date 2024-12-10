package X;

import java.util.Map;

/* renamed from: X.CaT  reason: case insensitive filesystem */
public final class C25177CaT {
    public final AnonymousClass1BI A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25177CaT) {
                C25177CaT caT = (C25177CaT) obj;
                if (!C18070vi.A18(this.A00, caT.A00) || !C18070vi.A18(this.A01, caT.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public C25177CaT(AnonymousClass1BI r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SortState(activeChatJid=");
        A10.append(this.A00);
        A10.append(", featureReadiness=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
