package X;

/* renamed from: X.0Kf  reason: invalid class name and case insensitive filesystem */
public abstract class C03710Kf {
    public final int A00;
    public final long A01;
    public final String A02;

    public abstract float A03(float f, float f2, float f3);

    public abstract float A04(int i);

    public abstract float A05(int i);

    public abstract long A06(float f, float f2, float f3);

    public abstract long A07(C03710Kf r1, float f, float f2, float f3, float f4);

    public boolean A08() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C03710Kf r6 = (C03710Kf) obj;
            if (!(this.A00 == r6.A00 && C18070vi.A18(this.A02, r6.A02) && this.A01 == r6.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A01, this.A02.hashCode() * 31) + this.A00;
    }

    public C03710Kf(String str, long j, int i) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw AnonymousClass000.A0k("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        A10.append(" (id=");
        A10.append(this.A00);
        A10.append(", model=");
        return AnonymousClass001.A1F(AnonymousClass0MS.A00(this.A01), A10);
    }
}
