package X;

/* renamed from: X.7ET  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7ET implements C1600286v {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ C138636xR A02;
    public final /* synthetic */ AnonymousClass1E7 A03;
    public final /* synthetic */ String A04;

    public final void C9q(AnonymousClass1E7 r12) {
        String string;
        C138636xR r6 = this.A02;
        AnonymousClass1FU r5 = this.A01;
        int i = this.A00;
        AnonymousClass1E7 r7 = this.A03;
        String str = this.A04;
        if (C18020vd.A05(C18040vf.A02, r6.A05, 6186)) {
            string = r5.getString(2131895218);
        } else {
            Object[] objArr = new Object[1];
            AnonymousClass3MX.A1N(r6.A02, r12, objArr, 0);
            string = r5.getString(2131895166, objArr);
        }
        C18070vi.A0b(string);
        r6.A00.A0B((AnonymousClass1FR) null);
        r6.A07.CGF(new AnonymousClass7R7(r5, r6, r7, str, string, i));
    }

    public /* synthetic */ AnonymousClass7ET(AnonymousClass1FU r1, C138636xR r2, AnonymousClass1E7 r3, String str, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = r3;
        this.A04 = str;
    }
}
