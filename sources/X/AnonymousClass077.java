package X;

/* renamed from: X.077  reason: invalid class name */
public final class AnonymousClass077 extends AnonymousClass0D0 {
    public float A00;
    public float A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D0 A02() {
        return new AnonymousClass077(0.0f, 0.0f);
    }

    public void A03() {
        this.A00 = 0.0f;
        this.A01 = 0.0f;
    }

    public float A00(int i) {
        if (i == 0) {
            return this.A00;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.A01;
    }

    public void A04(int i, float f) {
        if (i == 0) {
            this.A00 = f;
        } else if (i == 1) {
            this.A01 = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass077) {
            AnonymousClass077 r3 = (AnonymousClass077) obj;
            if (r3.A00 == this.A00 && r3.A01 == this.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public AnonymousClass077(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public int A01() {
        return 2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnimationVector2D: v1 = ");
        A10.append(this.A00);
        A10.append(", v2 = ");
        A10.append(this.A01);
        return A10.toString();
    }
}
