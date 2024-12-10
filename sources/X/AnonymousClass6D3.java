package X;

import java.util.List;

/* renamed from: X.6D3  reason: invalid class name */
public final class AnonymousClass6D3 extends C123076Ta {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6D3) && C18070vi.A18(this.A00, ((AnonymousClass6D3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6D3(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultipleErrors(errors=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
