package X;

/* renamed from: X.8sj  reason: invalid class name and case insensitive filesystem */
public final class C172068sj extends AnonymousClass9MM {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C172068sj) && C18070vi.A18(this.A00, ((C172068sj) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public C172068sj(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(errorMessage=");
        return C17900vP.A0B(this.A00, A10);
    }
}
