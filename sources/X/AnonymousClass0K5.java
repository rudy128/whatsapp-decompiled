package X;

/* renamed from: X.0K5  reason: invalid class name */
public final class AnonymousClass0K5 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0K5) {
            AnonymousClass0K5 r6 = (AnonymousClass0K5) obj;
            if (r6.A01 == this.A01 && r6.A00 == this.A00 && r6.A03 == this.A03 && r6.A02 == this.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A03, AnonymousClass000.A0B(AnonymousClass000.A05(this.A01), this.A00)) + this.A02;
    }

    public AnonymousClass0K5(float f, float f2, int i, long j) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = j;
        this.A02 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RotaryScrollEvent(verticalScrollPixels=");
        A10.append(this.A01);
        A10.append(",horizontalScrollPixels=");
        A10.append(this.A00);
        A10.append(",uptimeMillis=");
        A10.append(this.A03);
        A10.append(",deviceId=");
        return AnonymousClass001.A1L(A10, this.A02);
    }
}
