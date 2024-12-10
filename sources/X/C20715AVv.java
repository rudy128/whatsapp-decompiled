package X;

/* renamed from: X.AVv  reason: case insensitive filesystem */
public final class C20715AVv implements B5K {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20715AVv) && this.A00 == ((C20715AVv) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C20715AVv(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingTriggerCSAT(triggerCsatExpirationTsMillis=");
        return C17900vP.A0E(A10, this.A00);
    }
}
