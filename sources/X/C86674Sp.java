package X;

/* renamed from: X.4Sp  reason: invalid class name and case insensitive filesystem */
public final class C86674Sp {
    public final String A00;

    public C86674Sp(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86674Sp) && C18070vi.A18(this.A00, ((C86674Sp) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterGeosuspendedCountry(isoCode=");
        return C17900vP.A0B(this.A00, A10);
    }
}
