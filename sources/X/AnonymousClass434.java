package X;

/* renamed from: X.434  reason: invalid class name */
public final class AnonymousClass434 extends C83294Eo {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass434) && C18070vi.A18(this.A00, ((AnonymousClass434) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass434(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LanguageSelectorHeaderItem(title=");
        return C17900vP.A0B(this.A00, A10);
    }
}
