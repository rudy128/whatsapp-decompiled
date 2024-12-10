package X;

import java.util.List;

/* renamed from: X.6DM  reason: invalid class name */
public final class AnonymousClass6DM extends AnonymousClass6SL {
    public final List list;

    public AnonymousClass6DM(List list2) {
        C18070vi.A0d(list2, 1);
        this.list = list2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DM) && C18070vi.A18(this.list, ((AnonymousClass6DM) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultipleErrors(list=");
        return AnonymousClass001.A1F(this.list, A10);
    }
}
