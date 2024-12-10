package X;

import java.util.List;

public final class A1Z {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A1Z) {
                A1Z a1z = (A1Z) obj;
                if (!C18070vi.A18(this.A00, a1z.A00) || !C18070vi.A18(this.A01, a1z.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public A1Z(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessSearchSuggestion(suggestedSearches=");
        A10.append(this.A00);
        A10.append(", popularSearches=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public A1Z() {
        this((List) null, (List) null);
    }
}
