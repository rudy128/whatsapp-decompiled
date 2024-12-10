package X;

/* renamed from: X.0Io  reason: invalid class name and case insensitive filesystem */
public final class C03520Io {
    public final C17330uU A00 = AnonymousClass0Q9.A02((Object) null);
    public final C16590sg A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass0Q5 A03;

    public C03520Io(AnonymousClass0Q5 r2, C16590sg r3, String str) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = str;
    }

    public final C05800Vt A00(C22821Di r7, C22821Di r8) {
        C17330uU r5 = this.A00;
        C05800Vt r1 = (C05800Vt) r5.getValue();
        if (r1 == null) {
            AnonymousClass0Q5 r4 = this.A03;
            C17330uU r12 = r4.A01.A00;
            Object invoke = r8.invoke(r12.getValue());
            C16590sg r2 = this.A01;
            r1 = new C05800Vt(this, new C05830Vw(AnonymousClass0DX.A00(r2, r8.invoke(r12.getValue())), r4, r2, invoke), r7, r8);
            r5.setValue(r1);
            r4.A06(r1.A02);
        }
        AnonymousClass0Q5 r0 = this.A03;
        r1.A03(r8);
        r1.A04(r7);
        r1.A02((C16580sf) r0.A05.getValue());
        return r1;
    }

    public final void A01() {
        C05800Vt r6 = (C05800Vt) this.A00.getValue();
        if (r6 != null) {
            AnonymousClass0Q5 r0 = this.A03;
            C05830Vw r5 = r6.A02;
            C22821Di A002 = r6.A00();
            C17330uU r4 = r0.A05;
            r5.A03((C17190uG) r6.A01().invoke(r4.getValue()), A002.invoke(((C16580sf) r4.getValue()).BSw()), r6.A00().invoke(((C16580sf) r4.getValue()).BaC()));
        }
    }
}
