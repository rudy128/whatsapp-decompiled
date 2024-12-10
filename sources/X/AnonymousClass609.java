package X;

import java.util.List;

/* renamed from: X.609  reason: invalid class name */
public final class AnonymousClass609 extends AnonymousClass6TE {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass609) && C18070vi.A18(this.A00, ((AnonymousClass609) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass609(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowPlaceholderResults(items=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
