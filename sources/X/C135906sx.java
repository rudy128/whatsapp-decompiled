package X;

/* renamed from: X.6sx  reason: invalid class name and case insensitive filesystem */
public final class C135906sx {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C1418377d A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135906sx) {
                C135906sx r5 = (C135906sx) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A03), this.A00), this.A01), this.A02);
    }

    public C135906sx(C1418377d r2, boolean z, boolean z2) {
        boolean A1Z = C72453Mb.A1Z(r2);
        this.A03 = r2;
        this.A00 = z;
        this.A01 = A1Z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerPreviewItem(sticker=");
        C108965cb.A1T(this.A03, A10);
        A10.append(this.A00);
        A10.append(", isPreviewImageLoaded=");
        A10.append(this.A01);
        A10.append(", isStarred=");
        return C17900vP.A0F(A10, this.A02);
    }
}
