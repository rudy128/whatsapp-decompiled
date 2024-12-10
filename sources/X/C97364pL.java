package X;

/* renamed from: X.4pL  reason: invalid class name and case insensitive filesystem */
public final class C97364pL implements AnonymousClass5YJ {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97364pL) && C18070vi.A18(this.A01, ((C97364pL) obj).A01));
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C97364pL(String str) {
        this.A01 = str;
        this.A00 = (str.length() <= 0 || str.charAt(0) != '@') ? C17890vO.A0Z(str, AnonymousClass000.A10(), '@') : str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernameSetSuccessDialog(rawUsername=");
        return C17900vP.A0B(this.A01, A10);
    }
}
