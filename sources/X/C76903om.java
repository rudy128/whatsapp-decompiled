package X;

/* renamed from: X.3om  reason: invalid class name and case insensitive filesystem */
public final class C76903om extends AnonymousClass4EG {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76903om) && this.A00 == ((C76903om) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C76903om(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorCode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
