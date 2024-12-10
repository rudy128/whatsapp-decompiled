package X;

import java.util.List;

/* renamed from: X.6I2  reason: invalid class name */
public final class AnonymousClass6I2 extends C123286Tv {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6I2) && C18070vi.A18(this.A00, ((AnonymousClass6I2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6I2(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerList(stickers=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
