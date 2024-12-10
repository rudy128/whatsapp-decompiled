package X;

/* renamed from: X.3lk  reason: invalid class name and case insensitive filesystem */
public final class C75783lk extends AnonymousClass4E6 {
    public final String A00;

    public C75783lk(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75783lk) && C18070vi.A18(this.A00, ((C75783lk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(reason=");
        return C17900vP.A0B(this.A00, A10);
    }
}
