package X;

import java.util.List;

/* renamed from: X.7HI  reason: invalid class name */
public final class AnonymousClass7HI implements AnonymousClass857 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7HI) && C18070vi.A18(this.A00, ((AnonymousClass7HI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass7HI(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConfirmMedia(media=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
