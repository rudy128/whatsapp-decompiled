package X;

import java.util.List;

/* renamed from: X.6HC  reason: invalid class name */
public final class AnonymousClass6HC extends C123216To {
    public final List A00;

    public AnonymousClass6HC(List list) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6HC) && C18070vi.A18(this.A00, ((AnonymousClass6HC) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerPacks(packs=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
