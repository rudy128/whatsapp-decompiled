package X;

import java.util.List;

/* renamed from: X.450  reason: invalid class name */
public final class AnonymousClass450 extends C83344Et {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass450) && C18070vi.A18(this.A00, ((AnonymousClass450) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass450(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CopyrightSuspension(enforcementList=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
