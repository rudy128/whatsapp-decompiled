package X;

/* renamed from: X.Dol  reason: case insensitive filesystem */
public final class C27949Dol extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25057CVn $rollover;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27949Dol(C25057CVn cVn) {
        super(1);
        this.$rollover = cVn;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BTY bty = (BTY) obj;
        C18070vi.A0d(bty, 0);
        C25057CVn cVn = this.$rollover;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("----------------------------------------------");
        A10.append(10);
        A10.append("Rollover data:");
        StringBuilder A0j = BE8.A0j(A10);
        A0j.append("Rollover queued: ");
        BEA.A1L(cVn.A00, A0j, A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Rollover received: ");
        BEA.A1L(cVn.A01, A102, A10);
        C26294Cx6.A06("LinkSetup", C18070vi.A0H(A10));
        bty.A00 = this.$rollover;
        return C27621Wu.A00;
    }
}
