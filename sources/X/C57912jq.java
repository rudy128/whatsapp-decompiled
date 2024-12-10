package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2jq  reason: invalid class name and case insensitive filesystem */
public final class C57912jq {
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1MZ A04;
    public final AnonymousClass00H A05;

    public final void A00(AnonymousClass1EC r15) {
        C18070vi.A0d(r15, 0);
        AnonymousClass1E7 A0G = this.A03.A0G(r15);
        if (A0G != null && A0G.A12) {
            AnonymousClass1MZ r1 = this.A04;
            if (r1.A0J(r15) && !r1.A0K(r15)) {
                C20996Aco aco = new C20996Aco(this, r15, 2);
                AnonymousClass00H r5 = this.A05;
                String A0T = C17890vO.A0T(r5);
                AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
                boolean A1W = C17890vO.A1W("requestor_fetch", "true", r2);
                C29621ca r3 = new C29621ca("membership_approval_requests", r2);
                AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
                C17880vN.A1Q("xmlns", "w:g2", r22, A1W ? 1 : 0);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r22, 1);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 2);
                C17880vN.A0U(r5).A0N(aco, C29621ca.A00(r15, r3, r22), A0T, 355, 32000);
            }
        }
    }

    public C57912jq(AnonymousClass190 r2, AnonymousClass1M9 r3, AnonymousClass1MZ r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r5, r6, r3, r7);
        C18070vi.A0d(r4, 6);
        this.A02 = r2;
        this.A00 = r5;
        this.A05 = r6;
        this.A03 = r3;
        this.A01 = r7;
        this.A04 = r4;
    }
}
