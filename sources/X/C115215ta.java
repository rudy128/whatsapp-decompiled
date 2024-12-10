package X;

import java.util.List;

/* renamed from: X.5ta  reason: invalid class name and case insensitive filesystem */
public final class C115215ta extends C147357Sv {
    public final List errors;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115215ta) && C18070vi.A18(this.errors, ((C115215ta) obj).errors));
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public C115215ta(List list) {
        super((Throwable) C29431cG.A0b(list));
        this.errors = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultipleErrors(errors=");
        return AnonymousClass001.A1F(this.errors, A10);
    }
}
