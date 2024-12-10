package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.31h  reason: invalid class name and case insensitive filesystem */
public final class C679031h implements AnonymousClass878 {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    public /* bridge */ /* synthetic */ void CHQ(C72373Lr r12, Object obj, int i) {
        AnonymousClass00H r0 = this.A01;
        String A0T = C17890vO.A0T(r0);
        AnonymousClass1OZ A0U = C17880vN.A0U(r0);
        C29591cX r3 = new C29591cX("iq");
        r3.A04(new AnonymousClass1MD("smax_id", i));
        C29591cX.A01(r3, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
        C29591cX.A01(r3, "xmlns", "waffle");
        C29591cX.A01(r3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        C29591cX r2 = new C29591cX("timestamp");
        r2.A07(String.valueOf(AnonymousClass11P.A00(this.A00)));
        A0U.A0N(new C693736y(r12, 5), C29591cX.A00(r2, r3), A0T, 264, 32000);
    }

    public C679031h(AnonymousClass11P r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
