package X;

/* renamed from: X.7MS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MS implements AnonymousClass88A {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C188759hw A01;
    public final /* synthetic */ C22821Di A02;
    public final /* synthetic */ boolean A03;

    public final void C6n(C123206Tn r10) {
        C188759hw r4 = this.A01;
        int i = this.A00;
        C22821Di r6 = this.A02;
        boolean z = this.A03;
        if (r10 instanceof AnonymousClass6H8) {
            r4.A08.CGN(new C21365Aiu(r4, ((AnonymousClass6H8) r10).A00, r6, i, 2));
        } else if (r10 instanceof AnonymousClass6H7) {
            boolean z2 = r4.A0I.get();
            AnonymousClass00H r2 = r4.A0A;
            AnonymousClass70I A0q = C108945cZ.A0q(r2);
            if (z2) {
                AnonymousClass70I.A00(A0q, r2, "download_stickerpack_canceled", i).A02(i, AnonymousClass00R.A0C);
            } else {
                AnonymousClass70I.A00(A0q, r2, "download_stickerpack_failed", i).A02(i, AnonymousClass00R.A01);
                if (z) {
                    ((C56682hr) C18070vi.A0E(r4.A0D)).A00(6, "retry", false);
                }
            }
            r6.invoke(AnonymousClass000.A0h());
        }
        r4.A01.set((Object) null);
        r4.A00 = null;
    }

    public /* synthetic */ AnonymousClass7MS(C188759hw r1, C22821Di r2, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = z;
    }
}
