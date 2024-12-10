package X;

/* renamed from: X.34w  reason: invalid class name and case insensitive filesystem */
public final class C688334w implements B5K {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C688334w) && this.A00 == ((C688334w) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C688334w(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizBotMetadata(automatedType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
