package X;

/* renamed from: X.6Km  reason: invalid class name and case insensitive filesystem */
public final class C121566Km extends AnonymousClass6U3 {
    public final String A00;

    public C121566Km(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C121566Km) && C18070vi.A18(this.A00, ((C121566Km) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpdateStopActionTitle(titleText=");
        return C17900vP.A0B(this.A00, A10);
    }
}
