package X;

/* renamed from: X.0Tz  reason: invalid class name */
public final class AnonymousClass0Tz implements C16020ra {
    public final float A00;
    public final float A01;
    public final float A02;

    public AnonymousClass0Tz(float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(f2) || Float.isNaN(f3)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            A10.append(f);
            A10.append(", ");
            A10.append(0.0f);
            A10.append(", ");
            A10.append(f2);
            A10.append(", ");
            A10.append(f3);
            A10.append('.');
            throw AnonymousClass000.A0j(A10);
        }
    }

    public float CPf(float f) {
        float f2 = 0.0f;
        if (f <= 0.0f) {
            return f;
        }
        float f3 = 1.0f;
        if (f >= 1.0f) {
            return f;
        }
        while (true) {
            float f4 = (f2 + f3) / 2.0f;
            float f5 = 1.0f - f4;
            float f6 = f4 * f4 * f4;
            float f7 = (3.0f * this.A00 * f5 * f5 * f4) + (3.0f * this.A01 * f5 * f4 * f4) + f6;
            if (Math.abs(f - f7) < 0.001f) {
                return (3.0f * 0.0f * f5 * f5 * f4) + (3.0f * this.A02 * f5 * f4 * f4) + f6;
            }
            if (f7 < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0Tz) {
            AnonymousClass0Tz r3 = (AnonymousClass0Tz) obj;
            if (this.A00 == r3.A00 && this.A01 == r3.A01 && this.A02 == r3.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), 0.0f), this.A01), this.A02);
    }
}
