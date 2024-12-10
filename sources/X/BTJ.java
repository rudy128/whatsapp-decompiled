package X;

public final class BTJ extends C3J {
    public final float A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTJ) {
                BTJ btj = (BTJ) obj;
                if (!C18070vi.A18(this.A01, btj.A01) || Float.compare(this.A00, btj.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0L(this.A01), this.A00);
    }

    public BTJ(Object obj, float f) {
        this.A01 = obj;
        this.A00 = f;
    }
}
