package X;

/* renamed from: X.6rW  reason: invalid class name and case insensitive filesystem */
public final class C135016rW {
    public final float A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135016rW) {
                C135016rW r5 = (C135016rW) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || Float.compare(this.A00, r5.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + Float.floatToIntBits(this.A00);
    }

    public C135016rW(String str, float f) {
        this.A01 = str;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaProgress(key=");
        A10.append(this.A01);
        A10.append(", progress=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
