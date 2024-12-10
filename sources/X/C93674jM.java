package X;

/* renamed from: X.4jM  reason: invalid class name and case insensitive filesystem */
public final class C93674jM implements C107225Yw {
    public final float A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93674jM) {
                C93674jM r5 = (C93674jM) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public float Bam() {
        return this.A00;
    }

    public int hashCode() {
        return C17880vN.A01(Float.floatToIntBits(this.A00) * 31, this.A01);
    }

    public C93674jM(float f, boolean z) {
        this.A00 = f;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HoldAnimUiState(translationY=");
        A10.append(this.A00);
        A10.append(", shouldStartVC=");
        return C17900vP.A0F(A10, this.A01);
    }
}
