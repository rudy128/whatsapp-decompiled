package X;

import java.util.List;

/* renamed from: X.8fN  reason: invalid class name and case insensitive filesystem */
public final class C167088fN extends C179969Kp {
    public final List errors;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C167088fN) && C18070vi.A18(this.errors, ((C167088fN) obj).errors));
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public C167088fN(List list) {
        this.errors = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultipleErrors(errors=");
        return AnonymousClass001.A1F(this.errors, A10);
    }
}
