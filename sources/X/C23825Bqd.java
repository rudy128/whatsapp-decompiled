package X;

/* renamed from: X.Bqd  reason: case insensitive filesystem */
public final class C23825Bqd extends C4I {
    public final C441822l A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23825Bqd) && C18070vi.A18(this.A00, ((C23825Bqd) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23825Bqd(C441822l r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EnableTranscription(message=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
