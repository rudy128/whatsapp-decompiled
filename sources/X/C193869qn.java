package X;

import java.util.Map;

/* renamed from: X.9qn  reason: invalid class name and case insensitive filesystem */
public final class C193869qn {
    public final Map A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193869qn) {
                C193869qn r5 = (C193869qn) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193869qn(Map map, Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageRanks(individualRanks=");
        A10.append(this.A01);
        A10.append(", groupRanks=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
