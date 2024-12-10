package X;

/* renamed from: X.35q  reason: invalid class name and case insensitive filesystem */
public final class C690335q implements AnonymousClass3KT {
    public final CharSequence A00;

    public C690335q(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 1);
        this.A00 = charSequence;
    }

    public static C690335q A01(CharSequence charSequence) {
        return new C690335q(charSequence);
    }

    public boolean equals(Object obj) {
        C690335q r4;
        CharSequence charSequence = this.A00;
        CharSequence charSequence2 = null;
        if ((obj instanceof C690335q) && (r4 = (C690335q) obj) != null) {
            charSequence2 = r4.A00;
        }
        return AnonymousClass1YE.A08(charSequence, charSequence2);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public static C690335q A00(C56302hF r0, String str, String str2, String str3) {
        return new C690335q(r0.A00(str, str2, str3));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Text(text=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
