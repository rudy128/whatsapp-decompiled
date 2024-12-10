package X;

/* renamed from: X.6Kn  reason: invalid class name and case insensitive filesystem */
public final class C121576Kn extends AnonymousClass6U3 {
    public final String A00;

    public C121576Kn(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C121576Kn) && C18070vi.A18(this.A00, ((C121576Kn) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpdateTitleText(titleText=");
        return C17900vP.A0B(this.A00, A10);
    }
}
