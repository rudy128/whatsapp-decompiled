package X;

/* renamed from: X.8R5  reason: invalid class name */
public final class AnonymousClass8R5 extends C180239Lr {
    public final long A00;

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C180239Lr) && this.A00 == ((AnonymousClass8R5) ((C180239Lr) obj)).A00;
        }
        return true;
    }

    public AnonymousClass8R5(long j) {
        this.A00 = j;
    }

    public int hashCode() {
        return 1000003 ^ AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LogResponse{nextRequestWaitMillis=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }
}
