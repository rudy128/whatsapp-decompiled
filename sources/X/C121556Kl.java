package X;

/* renamed from: X.6Kl  reason: invalid class name and case insensitive filesystem */
public final class C121556Kl extends AnonymousClass6U3 {
    public final String A00;

    public C121556Kl(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C121556Kl) && C18070vi.A18(this.A00, ((C121556Kl) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpdateDescriptionText(descriptionText=");
        return C17900vP.A0B(this.A00, A10);
    }
}
