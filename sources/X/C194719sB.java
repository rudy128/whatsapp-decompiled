package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.9sB  reason: invalid class name and case insensitive filesystem */
public final class C194719sB {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C194719sB) {
            C194719sB r5 = (C194719sB) obj;
            if (C18070vi.A18(this.A00, r5.A00) && C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A02, r5.A02)) {
                Set set2 = this.A03;
                if (set2 == null || (set = r5.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A00)));
    }

    public C194719sB(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TableInfo{name='");
        A10.append(this.A00);
        A10.append("', columns=");
        A10.append(this.A01);
        A10.append(", foreignKeys=");
        A10.append(this.A02);
        A10.append(", indices=");
        return AnonymousClass8BX.A0c(this.A03, A10);
    }
}
