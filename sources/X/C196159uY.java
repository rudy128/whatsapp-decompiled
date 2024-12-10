package X;

/* renamed from: X.9uY  reason: invalid class name and case insensitive filesystem */
public final class C196159uY {
    public final AnonymousClass190 A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;
    public final AnonymousClass19D A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass10I A06;

    public final void A00(C22501BAi bAi) {
        AnonymousClass00H r2 = this.A05;
        String A0T = C17890vO.A0T(r2);
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O, "urn:xmpp:whatsapp:account");
        AnonymousClass8BY.A15(A0O, A0T);
        C29621ca A002 = C29591cX.A00(C108945cZ.A0t("confirm_email"), A0O);
        C17880vN.A0U(r2).A0N(new C20989Ach(bAi, 0), A002, A0T, 453, 32000);
    }

    public final void A03(C22560BCt bCt, String str, boolean z) {
        C18070vi.A0d(str, 1);
        C22560BCt bCt2 = bCt;
        this.A06.CGF(new C21376Aj5(this, bCt2, str, C17890vO.A0T(this.A05), 1, z));
    }

    public final void A04(C22504BAl bAl, String str) {
        C18070vi.A0d(str, 0);
        AnonymousClass00H r2 = this.A05;
        String A0T = C17890vO.A0T(r2);
        AnonymousClass9F6 r1 = new AnonymousClass9F6(A0T, str, 4);
        C17880vN.A0U(r2).A0N(new C20996Aco(bAl, r1, 7), (C29621ca) r1.A00, A0T, 417, 32000);
    }

    public final void A01(C22502BAj bAj) {
        AnonymousClass00H r2 = this.A05;
        String A0T = C17890vO.A0T(r2);
        AnonymousClass9F6 r1 = new AnonymousClass9F6(A0T, 0);
        C17880vN.A0U(r2).A0N(new C20996Aco(r1, bAj, 4), (C29621ca) r1.A00, A0T, 414, 32000);
    }

    public final void A02(C22503BAk bAk) {
        AnonymousClass00H r3 = this.A05;
        String A0T = C17890vO.A0T(r3);
        C18000vb r0 = this.A02;
        AnonymousClass9F6 r1 = new AnonymousClass9F6(A0T, r0.A05(), r0.A04());
        C17880vN.A0U(r3).A0N(new C20996Aco(bAk, r1, 5), (C29621ca) r1.A00, A0T, 416, 32000);
    }

    public C196159uY(AnonymousClass190 r1, AnonymousClass118 r2, C18000vb r3, AnonymousClass19D r4, C18030ve r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        C18070vi.A0w(r7, r3, r6, r2, r1);
        C18070vi.A0l(r5, r4);
        this.A05 = r7;
        this.A02 = r3;
        this.A06 = r6;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
    }
}
