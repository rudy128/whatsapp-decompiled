package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9jl  reason: invalid class name and case insensitive filesystem */
public final class C189739jl {
    public final AnonymousClass00H A00;

    public C189739jl(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C29621ca A00(C29671cg r8, AnonymousClass206 r9, String str, String str2) {
        C18070vi.A0o(str2, r8, r9);
        AnonymousClass00H r1 = this.A00;
        C178759Ei A01 = ((A2P) r1.get()).A01(r8);
        C178739Eg A03 = ((A2P) r1.get()).A03(r9, str2);
        AnonymousClass4A4 r4 = new AnonymousClass4A4(C83914Hd.A00(str2), 5);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        AnonymousClass8BY.A15(A0Y, str);
        C29591cX A0t = C108945cZ.A0t("spam_list");
        AnonymousClass8BT.A1E(r8, A0t, "jid");
        C29591cX A0S = AnonymousClass8BS.A0S();
        AnonymousClass8BT.A1E(r8, A0S, "from");
        A0S.A06(A03.A00);
        C108955ca.A1P(A0S, A0t);
        AnonymousClass8BW.A1E(A0t, A01);
        C108955ca.A1P(A0t, A0Y);
        C20121A8g.A09(A0Y, r4);
        return A0Y.A03();
    }
}
