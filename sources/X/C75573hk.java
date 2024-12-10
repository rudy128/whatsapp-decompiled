package X;

/* renamed from: X.3hk  reason: invalid class name and case insensitive filesystem */
public final class C75573hk extends AnonymousClass4E4 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75573hk) && C18070vi.A18(this.A00, ((C75573hk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C75573hk(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Remote(url=");
        return C17900vP.A0B(this.A00, A10);
    }
}
