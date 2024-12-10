package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sd  reason: invalid class name and case insensitive filesystem */
public final class C194999sd {
    public long A00 = 0;
    public long A01 = 0;
    public Map A02;
    public Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194999sd) {
                C194999sd r8 = (C194999sd) obj;
                if (this.A01 != r8.A01 || this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass001.A0K(this.A00, AnonymousClass8BV.A00(this.A01))));
    }

    public C194999sd() {
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        this.A03 = A13;
        this.A02 = A132;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PollResultsCache(summaryVotersExpiresAtMs=");
        A10.append(this.A01);
        A10.append(", fullVotersExpiresAtMs=");
        A10.append(this.A00);
        A10.append(", optionsSummaryVoters=");
        A10.append(this.A03);
        A10.append(", optionsFullVoters=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
