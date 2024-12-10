package X;

/* renamed from: X.BvJ  reason: case insensitive filesystem */
public final class C24091BvJ extends C24441C4b {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C24091BvJ) && C18070vi.A18(this.A00, ((C24091BvJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C24091BvJ(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(fileUri=");
        return C17900vP.A0B(this.A00, A10);
    }
}
