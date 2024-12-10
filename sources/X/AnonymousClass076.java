package X;

/* renamed from: X.076  reason: invalid class name */
public final class AnonymousClass076 extends AnonymousClass0D0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.076, java.lang.Object, X.0D0] */
    public /* bridge */ /* synthetic */ AnonymousClass0D0 A02() {
        ? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        obj.A02 = 0.0f;
        obj.A03 = 0.0f;
        return obj;
    }

    public void A03() {
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = 0.0f;
    }

    public float A00(int i) {
        if (i == 0) {
            return this.A00;
        }
        if (i == 1) {
            return this.A01;
        }
        if (i == 2) {
            return this.A02;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.A03;
    }

    public void A04(int i, float f) {
        if (i == 0) {
            this.A00 = f;
        } else if (i == 1) {
            this.A01 = f;
        } else if (i == 2) {
            this.A02 = f;
        } else if (i == 3) {
            this.A03 = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass076) {
            AnonymousClass076 r3 = (AnonymousClass076) obj;
            if (r3.A00 == this.A00 && r3.A01 == this.A01 && r3.A02 == this.A02 && r3.A03 == this.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A01), this.A02), this.A03);
    }

    public int A01() {
        return 4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnimationVector4D: v1 = ");
        A10.append(this.A00);
        A10.append(", v2 = ");
        A10.append(this.A01);
        A10.append(", v3 = ");
        A10.append(this.A02);
        A10.append(", v4 = ");
        A10.append(this.A03);
        return A10.toString();
    }
}
