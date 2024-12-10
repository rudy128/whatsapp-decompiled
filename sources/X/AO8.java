package X;

public final class AO8 implements C22367B4v {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AO8) && this.A00 == ((AO8) obj).A00);
    }

    public int hashCode() {
        return C17880vN.A01(0, this.A00);
    }

    public AO8(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "ProductBottomSheetUiStateLoading(initialProduct=");
        A10.append(", showVariantCarouselGlimmeringState=");
        return C17900vP.A0F(A10, this.A00);
    }
}
