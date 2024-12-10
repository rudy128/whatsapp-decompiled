package X;

/* renamed from: X.9BM  reason: invalid class name */
public final class AnonymousClass9BM extends A34 {
    public final int A00;
    public final C19830z4 A01;
    public final A98 A02;
    public final C26145Ct9 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07 = true;
    public final boolean A08;

    public AnonymousClass9BM(C19830z4 r2, A98 a98, C26145Ct9 ct9, String str, String str2, String str3, int i, boolean z) {
        this.A08 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = ct9;
        this.A01 = r2;
        this.A02 = a98;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        String str2;
        boolean A1Y = AnonymousClass000.A1Y(obj);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AutoconfTask/onPostExecute/autoconf verifier creation ");
        if (A1Y) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        C17890vO.A1A(A10, str);
        C19830z4 r1 = this.A01;
        if (A1Y) {
            str2 = "autoconf_verifier_creation_successful";
        } else {
            str2 = "autoconf_verifier_creation_failed";
        }
        r1.A1X(str2);
    }
}
