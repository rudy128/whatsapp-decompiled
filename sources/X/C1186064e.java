package X;

/* renamed from: X.64e  reason: invalid class name and case insensitive filesystem */
public final class C1186064e extends AnonymousClass6TN {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1186064e) && C18070vi.A18(this.A00, ((C1186064e) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public C1186064e(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(errorMessage=");
        return C17900vP.A0B(this.A00, A10);
    }
}
