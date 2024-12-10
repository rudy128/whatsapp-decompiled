package X;

/* renamed from: X.4Dz  reason: invalid class name and case insensitive filesystem */
public final class C83144Dz extends Exception {
    public final AnonymousClass4DW error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C83144Dz) && this.error == ((C83144Dz) obj).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C83144Dz(AnonymousClass4DW r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CancelRequestParticipantError(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }
}
