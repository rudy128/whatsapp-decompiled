package X;

/* renamed from: X.074  reason: invalid class name */
public final class AnonymousClass074 extends AnonymousClass0D0 {
    public float A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.074, X.0D0] */
    public /* bridge */ /* synthetic */ AnonymousClass0D0 A02() {
        ? obj = new Object();
        obj.A00 = 0.0f;
        return obj;
    }

    public void A03() {
        this.A00 = 0.0f;
    }

    public float A00(int i) {
        if (i == 0) {
            return this.A00;
        }
        return 0.0f;
    }

    public void A04(int i, float f) {
        if (i == 0) {
            this.A00 = f;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass074) || ((AnonymousClass074) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public int A01() {
        return 1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnimationVector1D: value = ");
        A10.append(this.A00);
        return A10.toString();
    }
}
