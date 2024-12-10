package X;

/* renamed from: X.4qt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98294qt implements AnonymousClass1TI {
    public final /* synthetic */ C97924qH A00;
    public final /* synthetic */ AnonymousClass1BI A01;
    public final /* synthetic */ String A02;

    public final void accept(Object obj) {
        C97924qH r1 = this.A00;
        AnonymousClass1BI r5 = this.A01;
        String str = this.A02;
        Boolean bool = (Boolean) obj;
        AnonymousClass1FR r3 = r1.A04;
        if (!r3.Bed()) {
            C18030ve r2 = r1.A0B;
            if (r1.A01) {
                str = "triggered_block";
            }
            r3.CMl(new C134136q6(r2, r5, str, bool.booleanValue()).A00());
        }
    }

    public /* synthetic */ C98294qt(C97924qH r1, AnonymousClass1BI r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }
}
