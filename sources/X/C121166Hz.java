package X;

import java.util.List;

/* renamed from: X.6Hz  reason: invalid class name and case insensitive filesystem */
public final class C121166Hz extends C123276Tu {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C121166Hz) && C18070vi.A18(this.A00, ((C121166Hz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C121166Hz(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerList(stickers=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
