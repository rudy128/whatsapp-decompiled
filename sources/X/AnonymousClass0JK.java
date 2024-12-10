package X;

/* renamed from: X.0JK  reason: invalid class name */
public final class AnonymousClass0JK {
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass0JK) || j != ((AnonymousClass0JK) obj).A00) {
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
        A10.append("PointerId(value=");
        A10.append(j);
        return AnonymousClass001.A1J(A10);
    }

    public /* synthetic */ AnonymousClass0JK(long j) {
        this.A00 = j;
    }
}
