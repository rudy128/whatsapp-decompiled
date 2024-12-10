package X;

import java.util.List;

/* renamed from: X.6DB  reason: invalid class name */
public final class AnonymousClass6DB extends AnonymousClass6SJ {
    public final List list;

    public AnonymousClass6DB(List list2) {
        C18070vi.A0d(list2, 1);
        this.list = list2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DB) && C18070vi.A18(this.list, ((AnonymousClass6DB) obj).list));
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
