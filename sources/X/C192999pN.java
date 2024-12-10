package X;

import java.util.List;

/* renamed from: X.9pN  reason: invalid class name and case insensitive filesystem */
public final class C192999pN {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C192999pN) && C18070vi.A18(this.A00, ((C192999pN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C192999pN(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetPromotionsResult(promotions=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
