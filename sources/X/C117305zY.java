package X;

import java.util.List;

/* renamed from: X.5zY  reason: invalid class name and case insensitive filesystem */
public final class C117305zY extends AnonymousClass6T6 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117305zY) && C18070vi.A18(this.A00, ((C117305zY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C117305zY(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowSearchResults(items=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
