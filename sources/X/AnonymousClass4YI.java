package X;

/* renamed from: X.4YI  reason: invalid class name */
public final class AnonymousClass4YI {
    public final float A00;
    public final float A01;
    public final boolean A02;

    public AnonymousClass4YI() {
        this(0.0f, 0.0f, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YI) {
                AnonymousClass4YI r5 = (AnonymousClass4YI) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0B(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State(pushToVideoCameraEntryPointStartX=");
        A10.append(this.A00);
        A10.append(", pushToVideoCameraEntryPointStartY=");
        A10.append(this.A01);
        A10.append(", cameraLongPressTriggered=");
        return C17900vP.A0F(A10, this.A02);
    }

    public AnonymousClass4YI(float f, float f2, boolean z) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = z;
    }
}
