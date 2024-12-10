package X;

/* renamed from: X.6O4  reason: invalid class name */
public final class AnonymousClass6O4 extends C35111lf {
    public final C18100vl A00;
    public final AnonymousClass00H A01;

    public void A00() {
        if (((C35511mM) this.A00.getValue()).A06(AnonymousClass00R.A0S)) {
            A01();
        }
    }

    public final void A01() {
        C18100vl r3 = this.A00;
        Integer num = AnonymousClass00R.A0S;
        if (((C35511mM) r3.getValue()).A06(num) && ((C35101le) this.A01.get()).A00(C35131lh.A02) == 2) {
            C18070vi.A0d("WaffleV2ToV3TransitionManager/onWfalLinkStateChanged detected a v3 link event. Unlinking v2 account", 0);
            ((C35511mM) r3.getValue()).A04(num, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6O4(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(C35131lh.A02);
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A00 = AnonymousClass1DF.A01(new C154917ru(r3));
    }
}
