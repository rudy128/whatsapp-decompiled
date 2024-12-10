package X;

/* renamed from: X.7HG  reason: invalid class name */
public final class AnonymousClass7HG implements AnonymousClass856 {
    public final C160878Ah A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7HG) {
                AnonymousClass7HG r5 = (AnonymousClass7HG) obj;
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

    public AnonymousClass7HG(C160878Ah r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaLoadedResult(mediaList=");
        A10.append(this.A00);
        A10.append(", unmounted=");
        return C17900vP.A0F(A10, this.A01);
    }
}
