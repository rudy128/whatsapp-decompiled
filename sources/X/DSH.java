package X;

public final class DSH implements Comparable {
    public final float A00;

    public static final /* synthetic */ DSH A00(float f) {
        return new DSH(f);
    }

    public final /* synthetic */ float A02() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.A00, ((DSH) obj).A00);
    }

    public boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof DSH) || Float.compare(f, ((DSH) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ DSH(float f) {
        this.A00 = f;
    }

    public static String A01(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(f);
        return AnonymousClass000.A0y(".dp", A10);
    }
}
