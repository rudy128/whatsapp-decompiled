package X;

/* renamed from: X.8uJ  reason: invalid class name and case insensitive filesystem */
public final class C172968uJ extends AnonymousClass9MO {
    public final String A00;

    public C172968uJ(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C172968uJ) && C18070vi.A18(this.A00, ((C172968uJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FieldName(value=");
        return C17900vP.A0B(this.A00, A10);
    }
}
