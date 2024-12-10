package X;

/* renamed from: X.9xa  reason: invalid class name and case insensitive filesystem */
public class C197979xa {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass118 A01;

    public C197979xa(AnonymousClass1L9 r1, AnonymousClass118 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static String A00(String str) {
        int length = str.length();
        if (length <= 96) {
            return str;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(str.substring(0, 64));
        A10.append("…");
        return AnonymousClass000.A0y(str.substring(length - 32), A10);
    }
}
