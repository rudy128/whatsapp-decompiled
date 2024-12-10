package X;

/* renamed from: X.3xo  reason: invalid class name and case insensitive filesystem */
public final class C80703xo extends AnonymousClass4ET {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C80703xo) && C18070vi.A18(this.A00, ((C80703xo) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C80703xo(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorMessage=");
        return C17900vP.A0B(this.A00, A10);
    }
}
