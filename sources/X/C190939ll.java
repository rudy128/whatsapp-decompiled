package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.biz.catalog.network.GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9ll  reason: invalid class name and case insensitive filesystem */
public final class C190939ll {
    public final C182809Vu A00;
    public final C182819Vv A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public final void A00(BAN ban, UserJid userJid) {
        if (C18020vd.A05(C18040vf.A02, this.A02, 10887)) {
            C182819Vv r0 = this.A01;
            C193009pO r5 = new C193009pO(userJid);
            AnonymousClass10E r1 = r0.A00.A00;
            AnonymousClass3MX.A1Q(new GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1(new C198649yg((C182829Vw) r1.A4B.get(), r5, (C199279zj) r1.A1v.get(), AnonymousClass10E.AHh(r1), (AnonymousClass4S5) r1.ABW.get(), AnonymousClass3MZ.A1B(r1)), ban, userJid, (C30391dr) null), (AnonymousClass1OX) C18070vi.A0E(this.A03));
            return;
        }
        C20971AcP acP = new C20971AcP(userJid, AnonymousClass8BU.A0K(this.A00.A00.A00));
        acP.A00 = ban;
        AnonymousClass1OZ r6 = acP.A02;
        String A0B = r6.A0B();
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        boolean A1W = C17890vO.A1W("jid", acP.A01.getRawString(), r2);
        C29621ca A0k = AnonymousClass8BR.A0k("public_key", r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[5];
        C17880vN.A1I(C173438v4.A00, "to", r22, A1W ? 1 : 0);
        C17880vN.A1Q("xmlns", "w:biz:catalog", r22, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
        AnonymousClass8BV.A1O("smax_id", "52", r22);
        r6.A0I(acP, AnonymousClass8BW.A0Q(A0k, AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B), r22), A0B, 283, 32000);
    }

    public C190939ll(C182809Vu r1, C182819Vv r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0s(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
