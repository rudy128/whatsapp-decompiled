package X;

/* renamed from: X.7Mh  reason: invalid class name and case insensitive filesystem */
public final class C145707Mh implements C1597985x {
    public final AnonymousClass725 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C145707Mh) {
                C145707Mh r5 = (C145707Mh) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C145707Mh(AnonymousClass725 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loaded(stickerPack=");
        A10.append(this.A00);
        A10.append(", refreshStickerPackPreview=");
        return C17900vP.A0F(A10, this.A01);
    }
}
