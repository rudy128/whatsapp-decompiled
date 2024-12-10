package X;

/* renamed from: X.CaY  reason: case insensitive filesystem */
public final class C25182CaY {
    public final int A00;
    public final int A01;
    public final E8O A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25182CaY) {
                C25182CaY caY = (C25182CaY) obj;
                if (!(C18070vi.A18(this.A02, caY.A02) && this.A01 == caY.A01 && this.A00 == caY.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + this.A01) * 31) + this.A00;
    }

    public C25182CaY(E8O e8o, int i, int i2) {
        this.A02 = e8o;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParagraphIntrinsicInfo(intrinsics=");
        A10.append(this.A02);
        A10.append(", startIndex=");
        A10.append(this.A01);
        A10.append(", endIndex=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
