package X;

/* renamed from: X.0ND  reason: invalid class name */
public final class AnonymousClass0ND {
    public static final long A01 = (4 << 32);
    public static final long A02 = (23 << 32);
    public static final long A03 = (20 << 32);
    public static final long A04 = (21 << 32);
    public static final long A05 = (22 << 32);
    public static final long A06 = (19 << 32);
    public static final long A07 = (66 << 32);
    public static final long A08 = (111 << 32);
    public static final long A09 = (160 << 32);
    public static final long A0A = (93 << 32);
    public static final long A0B = (92 << 32);
    public static final long A0C = (61 << 32);
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass0ND) || j != ((AnonymousClass0ND) obj).A00) {
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
        A10.append("Key code: ");
        A10.append(j);
        return A10.toString();
    }

    public /* synthetic */ AnonymousClass0ND(long j) {
        this.A00 = j;
    }
}
