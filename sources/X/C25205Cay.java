package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Cay  reason: case insensitive filesystem */
public final class C25205Cay {
    public final Object A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25205Cay) {
                C25205Cay cay = (C25205Cay) obj;
                if (!C18070vi.A18(this.A00, cay.A00) || !C18070vi.A18(this.A03, cay.A03) || !C18070vi.A18(this.A01, cay.A01) || !C18070vi.A18(this.A02, cay.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, C17890vO.A02(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A00))));
    }

    public C25205Cay(Object obj, String str, List list, Map map) {
        C18070vi.A0s(obj, map, str, list);
        this.A00 = obj;
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Template(templateObject=");
        A10.append(this.A00);
        A10.append(", expandedVariables=");
        A10.append(this.A03);
        A10.append(", scopeKey=");
        A10.append(this.A01);
        A10.append(", keyPathBase=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
