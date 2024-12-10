package X;

/* renamed from: X.1ye  reason: invalid class name and case insensitive filesystem */
public final class C42731ye implements Comparable {
    public final long A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C18070vi.A01(this.A00 ^ Long.MIN_VALUE, ((C42731ye) obj).A00 ^ Long.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C42731ye) || j != ((C42731ye) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return C60652oO.A01(this.A00);
    }

    public /* synthetic */ C42731ye(long j) {
        this.A00 = j;
    }
}
