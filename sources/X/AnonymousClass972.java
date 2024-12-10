package X;

import java.util.List;

/* renamed from: X.972  reason: invalid class name */
public final class AnonymousClass972 extends C180039Kw {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass972) && C18070vi.A18(this.list, ((AnonymousClass972) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public AnonymousClass972(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultipleErrors(list=");
        return AnonymousClass001.A1F(this.list, A10);
    }
}
