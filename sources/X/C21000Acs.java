package X;

/* renamed from: X.Acs  reason: case insensitive filesystem */
public final class C21000Acs implements B9M {
    public final /* synthetic */ C187239fU A00;
    public final /* synthetic */ AnonymousClass1EC A01;
    public final /* synthetic */ String A02;

    public C21000Acs(C187239fU r1, AnonymousClass1EC r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void onError(Throwable th) {
        String str;
        int i;
        C187239fU r1 = this.A00;
        C41111vp r6 = r1.A03;
        r6.A0E(C76993ox.A00);
        if (th instanceof AnonymousClass9LJ) {
            AnonymousClass1EC r5 = this.A01;
            str = this.A02;
            i = ((AnonymousClass9LJ) th).errorCode;
            if (i == 406) {
                r1.A01.A04(false);
            } else if (i == 409) {
                r1.A00.A0H(r5, "description_conflict", 3);
            }
        } else {
            str = this.A02;
            i = -1;
        }
        r6.A0E(new C76983ow(str, i));
    }
}
