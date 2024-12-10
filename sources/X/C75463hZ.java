package X;

/* renamed from: X.3hZ  reason: invalid class name and case insensitive filesystem */
public final class C75463hZ extends AnonymousClass4E3 {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75463hZ) && this.A00 == ((C75463hZ) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C75463hZ(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(arClass=");
        return C17900vP.A0E(A10, this.A00);
    }
}
