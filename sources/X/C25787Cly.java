package X;

/* renamed from: X.Cly  reason: case insensitive filesystem */
public final class C25787Cly {
    public static final C25787Cly A02 = new C25787Cly(10, 6.0f);
    public static final C25787Cly A03 = new C25787Cly(8, 5.0f);
    public static final C25787Cly A04 = new C25787Cly(6, 4.0f);
    public final float A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25787Cly) {
                C25787Cly cly = (C25787Cly) obj;
                if (!(this.A01 == cly.A01 && Float.compare(this.A00, cly.A00) == 0 && Float.compare(0.2f, 0.2f) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(this.A01 * 31, this.A00), 0.2f);
    }

    public C25787Cly(int i, float f) {
        this.A01 = i;
        this.A00 = f;
        if (f == 0.0f) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("mass=");
            A10.append(f);
            throw AnonymousClass001.A12(" must be != 0", A10);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Size(sizeInDp=");
        A10.append(this.A01);
        A10.append(", mass=");
        A10.append(this.A00);
        A10.append(", massVariance=");
        return AnonymousClass001.A1K(A10, 0.2f);
    }
}
