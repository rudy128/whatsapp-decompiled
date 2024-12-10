package X;

/* renamed from: X.3pk  reason: invalid class name and case insensitive filesystem */
public final class C77263pk extends C77283pm {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77263pk) && this.A00 == ((C77263pk) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C77263pk(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CancelSuccess(successCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
