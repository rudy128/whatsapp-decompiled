package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9nP  reason: invalid class name and case insensitive filesystem */
public class C191919nP {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C19880zA A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass11S A06;
    public final C19830z4 A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5qs] */
    public C114465qs A00(UserJid userJid) {
        ((C60102nO) this.A02.get()).A01("fetch_cert");
        AnonymousClass00H r3 = this.A09;
        String A0T = C17890vO.A0T(r3);
        C17900vP.A0f("BizVNameXmppMethods/sendGetBizVNameCert; iq=", A0T, AnonymousClass000.A10());
        ? obj = new Object();
        AnonymousClass1OZ A0U = C17880vN.A0U(r3);
        C29621ca A0k = AnonymousClass8BR.A0k("verified_name", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) userJid, "jid")});
        AnonymousClass1MD[] r32 = new AnonymousClass1MD[3];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r32, 0);
        C17880vN.A1Q("xmlns", "w:biz", r32, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32);
        A0U.A0N(new C20993Acl(userJid, this, obj, 16), AnonymousClass8BT.A0a(A0k, r32), A0T, 118, 32000);
        return obj;
    }

    public C191919nP(C19880zA r1, AnonymousClass190 r2, AnonymousClass11S r3, C19830z4 r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A08 = r5;
        this.A05 = r2;
        this.A06 = r3;
        this.A09 = r6;
        this.A03 = r7;
        this.A00 = r8;
        this.A01 = r9;
        this.A07 = r4;
        this.A04 = r1;
        this.A02 = r10;
        this.A0A = r11;
        this.A0C = r12;
        this.A0B = r13;
    }
}
