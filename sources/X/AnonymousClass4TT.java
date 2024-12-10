package X;

/* renamed from: X.4TT  reason: invalid class name */
public final class AnonymousClass4TT {
    public final int A00;
    public final AnonymousClass210 A01;

    public AnonymousClass4TT(AnonymousClass210 r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TT) {
                AnonymousClass4TT r5 = (AnonymousClass4TT) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PluginCarouselItem(message=");
        A10.append(this.A01);
        A10.append(", carouselCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
