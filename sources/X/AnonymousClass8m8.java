package X;

import java.util.List;

/* renamed from: X.8m8  reason: invalid class name */
public final class AnonymousClass8m8 extends AnonymousClass9XE {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8m8) && C18070vi.A18(this.A00, ((AnonymousClass8m8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8m8(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoadingStartSearch(loadingItems=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
