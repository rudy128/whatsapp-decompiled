package X;

/* renamed from: X.0NB  reason: invalid class name */
public final class AnonymousClass0NB {
    public static final long A01;
    public final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(0.5f);
        A01 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass0NB) || j != ((AnonymousClass0NB) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        long j = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TransformOrigin(packedValue=");
        A10.append(j);
        return AnonymousClass001.A1J(A10);
    }

    public /* synthetic */ AnonymousClass0NB(long j) {
        this.A00 = j;
    }
}
