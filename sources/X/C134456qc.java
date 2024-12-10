package X;

/* renamed from: X.6qc  reason: invalid class name and case insensitive filesystem */
public final class C134456qc {
    public final AnonymousClass77S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134456qc) && C18070vi.A18(this.A00, ((C134456qc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134456qc(AnonymousClass77S r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeAuthTokenExchangeResult(limitedScopedAccessToken=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
