package X;

/* renamed from: X.AHa  reason: case insensitive filesystem */
public final class C20344AHa implements BDd {
    public final AnonymousClass1Zh A00;
    public final C199059zM A01;
    public final C199069zN A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
                C20344AHa aHa = (C20344AHa) obj;
                if (!C18070vi.A18(this.A00, aHa.A00) || !C18070vi.A18(this.A02, aHa.A02) || !C18070vi.A18(this.A01, aHa.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public C20344AHa(AnonymousClass1Zh r4, C199059zM r5, C199069zN r6) {
        C18070vi.A0k(r6, r5);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        int i = r4.A02;
        int i2 = r4.A01;
        if (i - i2 == 0 && r4.A00 - r4.A03 == 0) {
            throw AnonymousClass000.A0k("Bounds must be non zero");
        } else if (i2 != 0 && r4.A03 != 0) {
            throw AnonymousClass000.A0k("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HardwareFoldingFeature");
        A10.append(" { ");
        A10.append(this.A00);
        A10.append(", type=");
        A10.append(this.A02);
        A10.append(", state=");
        A10.append(this.A01);
        return AnonymousClass000.A0y(" }", A10);
    }
}
