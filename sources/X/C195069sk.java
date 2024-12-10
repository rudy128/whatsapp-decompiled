package X;

/* renamed from: X.9sk  reason: invalid class name and case insensitive filesystem */
public final class C195069sk {
    public int A00;
    public C59772mr A01;
    public C195429tK A02;
    public final int A03;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C195069sk) && this.A03 == ((C195069sk) obj).A03);
    }

    public int hashCode() {
        return this.A03;
    }

    public C195069sk(int i) {
        this.A03 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AutoconfVerifierResult(status=");
        return AnonymousClass001.A1L(A10, this.A03);
    }
}
