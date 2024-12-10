package X;

import java.util.List;

/* renamed from: X.36o  reason: invalid class name and case insensitive filesystem */
public final class C692736o implements AnonymousClass229 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C692736o) && C18070vi.A18(this.A00, ((C692736o) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C692736o(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CarouselCardMessages(messages=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
