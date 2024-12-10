package X;

import java.util.List;

/* renamed from: X.60b  reason: invalid class name and case insensitive filesystem */
public final class C1175760b extends AnonymousClass6TK {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1175760b) && C18070vi.A18(this.A00, ((C1175760b) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1175760b(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReceivedStickers(stickers=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
