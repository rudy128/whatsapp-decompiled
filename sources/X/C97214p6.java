package X;

import java.util.List;

/* renamed from: X.4p6  reason: invalid class name and case insensitive filesystem */
public final class C97214p6 implements AnonymousClass5YG {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97214p6) && C18070vi.A18(this.A00, ((C97214p6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97214p6(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(reports=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
