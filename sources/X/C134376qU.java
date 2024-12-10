package X;

/* renamed from: X.6qU  reason: invalid class name and case insensitive filesystem */
public final class C134376qU {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134376qU) && C18070vi.A18(this.A00, ((C134376qU) obj).A00));
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + 1237;
    }

    public C134376qU(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextResponse(text=");
        A10.append(this.A00);
        A10.append(", isFinal=");
        return C17900vP.A0F(A10, false);
    }
}
