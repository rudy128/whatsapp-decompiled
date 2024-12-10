package X;

public final class D6A implements EBX {
    public final C016009d A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D6A) {
                D6A d6a = (D6A) obj;
                if (!C18070vi.A18(this.A00, d6a.A00) || Float.compare(this.A01, d6a.A01) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public float BMz() {
        return this.A01;
    }

    public C03380Hv BNh() {
        return this.A00;
    }

    public long BOw() {
        return C05100Qk.A05;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public D6A(C016009d r1, float f) {
        this.A00 = r1;
        this.A01 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BrushStyle(value=");
        A10.append(this.A00);
        A10.append(", alpha=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
