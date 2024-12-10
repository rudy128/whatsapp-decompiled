package X;

/* renamed from: X.6Ik  reason: invalid class name and case insensitive filesystem */
public final class C121206Ik extends C123316Ty {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C121206Ik) && C18070vi.A18(this.A00, ((C121206Ik) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C121206Ik(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StringValue(value=");
        return C17900vP.A0B(this.A00, A10);
    }
}
