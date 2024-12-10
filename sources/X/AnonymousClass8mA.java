package X;

import java.util.List;

/* renamed from: X.8mA  reason: invalid class name */
public final class AnonymousClass8mA extends AnonymousClass9XE {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8mA) && C18070vi.A18(this.A00, ((AnonymousClass8mA) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8mA(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SuccessStartSearch(successItems=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
