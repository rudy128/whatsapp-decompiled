package X;

/* renamed from: X.9pQ  reason: invalid class name and case insensitive filesystem */
public final class C193029pQ {
    public final AnonymousClass77S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193029pQ) && C18070vi.A18(this.A00, ((C193029pQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193029pQ(AnonymousClass77S r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserEntitySourceAccessTokenPair(sourceAndAccessTokenPair=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
