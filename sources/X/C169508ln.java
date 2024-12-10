package X;

import java.util.List;

/* renamed from: X.8ln  reason: invalid class name and case insensitive filesystem */
public final class C169508ln extends AnonymousClass9XC {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169508ln) && C18070vi.A18(this.A00, ((C169508ln) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C169508ln(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(loadingItems=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
