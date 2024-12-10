package X;

/* renamed from: X.3sA  reason: invalid class name and case insensitive filesystem */
public final class C78103sA extends AnonymousClass4LF {
    public final AnonymousClass206 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78103sA) && C18070vi.A18(this.A00, ((C78103sA) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C78103sA(AnonymousClass206 r2) {
        super(AnonymousClass00R.A0N);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DecryptionFailureItem(comment=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
