package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.9rk  reason: invalid class name and case insensitive filesystem */
public final class C194449rk {
    public final Map A00;
    public final Map A01;
    public final Set A02;

    public C194449rk(Map map, Map map2, Set set) {
        C18070vi.A0d(set, 1);
        this.A02 = set;
        this.A00 = map;
        this.A01 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194449rk) {
                C194449rk r5 = (C194449rk) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupProcessResult(successfulGroups=");
        A10.append(this.A02);
        A10.append(", failedGroups=");
        A10.append(this.A00);
        A10.append(", truncatedGroups=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
