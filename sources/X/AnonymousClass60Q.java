package X;

import java.util.List;

/* renamed from: X.60Q  reason: invalid class name */
public final class AnonymousClass60Q extends AnonymousClass6TI {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass60Q) && C18070vi.A18(this.A00, ((AnonymousClass60Q) obj).A00));
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A00) - 65536) * 31) + 4;
    }

    public AnonymousClass60Q(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Data(shapes=");
        A10.append(this.A00);
        A10.append(", strokeColor=");
        A10.append(-65536);
        A10.append(", strokeWidth=");
        return AnonymousClass001.A1L(A10, 4);
    }
}
