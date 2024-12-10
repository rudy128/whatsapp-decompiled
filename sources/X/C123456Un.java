package X;

import java.util.List;

/* renamed from: X.6Un  reason: invalid class name and case insensitive filesystem */
public final class C123456Un {
    public AnonymousClass725 A00;
    public List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123456Un) {
                C123456Un r5 = (C123456Un) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerPreviewState(stickerPack=");
        A10.append(this.A00);
        A10.append(", stickerPreviewItems=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
