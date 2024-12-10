package X;

import java.util.List;

/* renamed from: X.6FE  reason: invalid class name */
public final class AnonymousClass6FE extends C39611tM {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6FE) && C18070vi.A18(this.A00, ((AnonymousClass6FE) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6FE(List list) {
        super(AnonymousClass3MY.A0f(), 44);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PopularBusinessesListItem(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
