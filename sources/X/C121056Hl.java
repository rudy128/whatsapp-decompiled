package X;

/* renamed from: X.6Hl  reason: invalid class name and case insensitive filesystem */
public final class C121056Hl extends C123256Ts {
    public final int A00;
    public final C122606Ra A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121056Hl) {
                C121056Hl r5 = (C121056Hl) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + this.A00;
    }

    public C121056Hl(C122606Ra r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerMoveToTop(origin=");
        A10.append(this.A01);
        A10.append(", quantity=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
