package X;

/* renamed from: X.6ne  reason: invalid class name and case insensitive filesystem */
public final class C132826ne {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C132826ne(String str, String str2, String str3, String str4) {
        C17960vV.A07(str);
        this.A01 = str;
        this.A04 = str2;
        C17960vV.A07(str3);
        this.A00 = str3;
        C17960vV.A07(str4);
        this.A03 = str4;
        StringBuilder A10 = AnonymousClass000.A10();
        for (int i = 0; i < str4.length(); i++) {
            A10.appendCodePoint((str4.charAt(i) + 61926) - 65);
        }
        this.A02 = A10.toString();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append(" ");
        A10.append(this.A00);
        A10.append(" ");
        A10.append(this.A04);
        A10.append(" ");
        return AnonymousClass000.A0y(this.A02, A10);
    }
}
